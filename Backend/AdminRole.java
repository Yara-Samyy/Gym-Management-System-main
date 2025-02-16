package Backend;

import java.util.*;
import javax.swing.JOptionPane;

public class AdminRole {

    private TrainerDatabase database;

    public AdminRole() {
        this.database = new TrainerDatabase("Trainers.txt");
        database.readFromFile();
    }
    //test
//    public void test(String key){
//        System.out.println("test: "+ database.contains(key));
//    }

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        if (database.contains(trainerId)) {
            // System.out.println("Trainer with ID " + trainerId + " already exists.");
            JOptionPane.showMessageDialog(null, "Trainer with ID " + trainerId + " already exists.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Trainer newTrainer = new Trainer(trainerId, name, email, specialty, phoneNumber);
        database.insertRecord(newTrainer);
        // System.out.println("Trainer added successfully.");
        JOptionPane.showMessageDialog(null, "Trainer with ID " + trainerId + " has been succesfully added");
    }

    public ArrayList<Trainer> getListOfTrainers() {
        ArrayList<Trainer> trainersList = database.returnAllRecords();
        return trainersList;
    }

    public void removeTrainer(String key) {
        if (database.contains(key)) {
            database.deleteRecord(key);
            JOptionPane.showMessageDialog(null, "The trainer with Id = " + key + " has been deleted");
        } //if (database.contains(key)) {
        //    database.deleteRecord(key);
        //  System.out.println("Trainer removed successfully.");
        //  }
        else {
            //System.out.println("Trainer with ID " + key + " does not exist.");
            JOptionPane.showMessageDialog(null, "The trainer with Id = " + key + " does not exist!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void logout() {
        database.saveToFile();
        System.out.println("All data saved. Logging out.");
    }
}
