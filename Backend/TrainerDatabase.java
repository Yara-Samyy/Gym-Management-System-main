/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Yara
 */
public class TrainerDatabase {
     private ArrayList<Trainer> records;
    private String filename;
    
     public TrainerDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
     }
     
     public void readFromFile(){
         try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                Trainer trainer = createRecordFrom(line);
                if (trainer != null) {
                    records.add(trainer);
                }
            }
        } catch (IOException e) {
            Logger.getLogger(TrainerDatabase.class.getName()).log(Level.SEVERE, "Error reading from file", e);
        }
         //test
         for (Trainer record : records) {
             System.out.println(records);
         }
            
     }
    public Trainer createRecordFrom (String line) {
        
        String[] res= line.split(",");
        if(res.length==5){
            String id= res[0]; 
            String name= res[1];
            String email= res[2];
            String speciality= res[3];
            String phoneNumber= res[4];
            Trainer newTrainer = new Trainer(id,name, email, speciality, phoneNumber);
            return newTrainer;
        }
        else{
            System.out.println("invalid line in a the file");
            return null;
        }
    }
    public ArrayList<Trainer> returnAllRecords() {
        return records;
    }
    public boolean contains(String key){
       for(int i=0; i<records.size();i++){
           System.out.println("trainer: "+ records.get(i).getSearchKey());
          if(records.get(i).id.equals(key))
               return true;
       }
       return false;
       
    }
    public Trainer getRecord (String key) {
      for (Trainer trainer : records) {
            if (trainer.getSearchKey().equals(key)) {
                return trainer; 
            }
        }
        return null;
    }
    public void insertRecord (Trainer record){
       
        if (!contains(record.getSearchKey())) {
            records.add(record);
            saveToFile();
        }
    }
    public void deleteRecord(String key) {
        Iterator<Trainer> iterator = records.iterator();
        //the iterator loops through the arraylist
        while (iterator.hasNext()) {
            Trainer trainer = iterator.next();
            if (trainer.getSearchKey().equals(key)) {
                iterator.remove();
                saveToFile();     
            }
        }
    }
    
    
    
    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Trainer trainer : records) {
                writer.write(trainer.lineRepresentation());
                writer.newLine(); // Move to the next line after each record
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    }
    

