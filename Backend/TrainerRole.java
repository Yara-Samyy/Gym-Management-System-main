package Backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class TrainerRole {

    private MemberDatabase memberDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;
    private ClassDatabase classDatabase;
    private TrainerDatabase trainerDatabase;

    public TrainerRole() {
        this.memberDatabase = new MemberDatabase("Members.txt");
        memberDatabase.readFromFile();
        this.registrationDatabase = new MemberClassRegistrationDatabase("Registration.txt");
        registrationDatabase.readFromFile();
        this.classDatabase = new ClassDatabase("Class.txt");
        classDatabase.readFromFile();
        this.trainerDatabase = new TrainerDatabase("Trainers.txt");
        trainerDatabase.readFromFile();
    }

    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {

        if (!memberDatabase.contains(memberID)) {

            Member m = new Member(memberID, name, membershipType, email, phoneNumber, status);

            memberDatabase.insertRecord(m);
            JOptionPane.showMessageDialog(null, "Trainer with ID " + memberID + " has been succesfully added");
        } else {
            JOptionPane.showMessageDialog(null, "Trainer with ID " + memberID + " already exists.", "Message", JOptionPane.ERROR_MESSAGE);
            // System.out.println("the member you're trying to add already exists");
        }
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        if (!trainerDatabase.contains((trainerID))) {
            JOptionPane.showMessageDialog(null, "Sorry! This trainer does not exist in our gym.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!classDatabase.contains(classID)) {
            // System.out.println("maxParticipants after if: "+ maxParticipants);
            Class c = new Class(classID, className, trainerID, duration, maxParticipants);
            classDatabase.insertRecord(c);
            JOptionPane.showMessageDialog(null, "Class with ID " + classID + " has been succesfully added");
        } else {
            JOptionPane.showMessageDialog(null, "Class with ID " + classID + " already exists.", "Message", JOptionPane.ERROR_MESSAGE);
            //  System.out.println("the class you're trying to add already exists");
        }
    }

    public ArrayList<Record> getListOfMembers() {
        return memberDatabase.returnAllRecords();
        //  return registrationDatabase.returnAllRecords();
    }

    public ArrayList<Record> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        Record r = classDatabase.getRecord(classID);
        Record v = memberDatabase.getRecord(memberID);
        Class registeredClass = (Class) r;
        Member regMember = (Member) v;

        if (registeredClass != null && registeredClass.getAvailableSeats() > 0 && regMember != null) {

            //keda el class exists w fy available seats
            MemberClassRegistration registeredMember = new MemberClassRegistration(memberID, classID, "active", registrationDate);
            registrationDatabase.insertRecord(registeredMember);
            registeredClass.setAvailableSeats(registeredClass.getAvailableSeats() - 1);
            classDatabase.saveToFile();
            registrationDatabase.saveToFile();
            JOptionPane.showMessageDialog(null, "The Member with ID " + memberID + " has succesfully registered to class " + classID);
            return true;
        }
        if (regMember == null && registeredClass == null) {
            JOptionPane.showMessageDialog(null, "The member and the class do not exist ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (registeredClass == null) {
            JOptionPane.showMessageDialog(null, "The class does not exist ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (regMember == null) {
            JOptionPane.showMessageDialog(null, "The member does not exist ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!(registeredClass.getAvailableSeats() > 0)) {
            JOptionPane.showMessageDialog(null, "The calss has no available seats ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return false; // registration failed bec. of number of seats or existance of the class    
    }

    public boolean cancelRegistration(String memberID, String classID) {

        String key = memberID.concat(classID);

        Record f = registrationDatabase.getRecord(key);
        Record r = classDatabase.getRecord(classID);
        Record v = memberDatabase.getRecord(memberID);
        Class registeredClass = (Class) r;
        Member regMember = (Member) v;

        MemberClassRegistration registration = (MemberClassRegistration) f;

        // if(registration==null)
        //   System.out.println("registration = null"); 
//        if (registration == null) {
//            JOptionPane.showMessageDialog(null, "This user is not registered at the gym!", "Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
        if (regMember == null && registeredClass == null) {
            JOptionPane.showMessageDialog(null, "The member and the class do not exist ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (registeredClass == null) {
            JOptionPane.showMessageDialog(null, "The class does not exist ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (regMember == null) {
            JOptionPane.showMessageDialog(null, "The member does not exist ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (registration.getStatus().equals("canceled")) {
            JOptionPane.showMessageDialog(null, "The member's registration was already canceled ", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (registration != null && LocalDate.now().isBefore(registration.getRegistrationDate().plusDays(3))) {
            registration.setStatus("canceled");

            Record rec = classDatabase.getRecord(classID);
            Class c = (Class) rec;
            c.setAvailableSeats(c.getAvailableSeats() + 1);
            classDatabase.saveToFile();
            registrationDatabase.deleteRecord(key);
            //registrationDatabase.saveToFile();
            //classDatabase.deleteRecord(memberID);
            JOptionPane.showMessageDialog(null, "The Member with ID " + memberID + " has been unregistered from class " + classID);
            return true;
        } else // if (!(LocalDate.now().isBefore(registration.getRegistrationDate().plusDays(3)))) 
        {
            JOptionPane.showMessageDialog(null, "SORRY! You can't cancel your registration after more than 3 days.", "Message", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // return false;
    }

    public ArrayList<Record> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }
}
