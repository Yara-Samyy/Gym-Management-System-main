/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Yara
 */
public class Class extends Record {
   // private String classId;
    private String className;
    private String trainerID;
    private int duration;
    private int availableSeats;
     
    public Class(String classId, String className, String trainerID, int duration, int availableSeats) {
        super(classId);
       
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }
     String classid= this.id;
     
    public int getAvailableSeats(){
    return this.availableSeats;
}
    public void setAvailableSeats (int availableSeats){
        this.availableSeats=availableSeats;
    }

    @Override
    public String lineRepresentation() {
        return String.join(",", classid, className, trainerID, String.valueOf(duration), String.valueOf(availableSeats));
    }
    @Override
    public String getSearchKey() {
        return classid;
    }  
}
