/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Yara
 */
public abstract class Record implements Recordable{
   //common properties for record
    String id;

    public Record(String id) {
       
        this.id = id;
    }  
   
    @Override
    public String getSearchKey() {
        return id;
    }

//    int getAvailableSeats() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
