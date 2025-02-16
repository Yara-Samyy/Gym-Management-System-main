package Backend;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Database {
     ArrayList<Record> records;
     String filename;

    public Database(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
    }

    public void readFromFile() {
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = br.readLine()) != null) {
            //System.out.println("Reading line: " + line); // Debug output
            Record record = createRecordFrom(line);
            if (record != null) {
                records.add(record);
              //  System.out.println("Added record: " + record.lineRepresentation()); // Debug output
            }
        }
    } catch (IOException e) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Error reading from file", e);
    }
}

    
    
    protected abstract Record createRecordFrom(String line); // kol class y implement el howa 3ayzo feha
    
    public ArrayList<Record> returnAllRecords() {
        return records;
    }
    public boolean contains(String key) {
        for (Record record : records) {
            if (record.getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }
    public Record getRecord(String key) {
        for (Record record : records) {
            if (record.getSearchKey().equals(key)) {
                return record;
            }
        }
        
        return null;
    }
    public void insertRecord(Record record) {
       
        if (!contains(record.getSearchKey())) {
            records.add(record);
            saveToFile();
        }
    }
    public void deleteRecord(String key) {
        Iterator<Record> iterator = records.iterator();
        while (iterator.hasNext()) {
            Record record = iterator.next();
            if (record.getSearchKey().equals(key)) {
                iterator.remove();
                saveToFile();
            }
        }
    }
    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Record record : records) {
                writer.write(record.lineRepresentation());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}