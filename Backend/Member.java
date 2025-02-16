package Backend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member extends Record {

    String name;
    String email;
    String membershipType;
    String phoneNumber;
    String status;

    public Member(String id, String name, String membershipType, String email, String phoneNumber, String status) { 
        super(id);
        this.name = name;
        this.email = email;
        this.membershipType = membershipType;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    @Override
    public String lineRepresentation() {
        return String.join(",", id, name, membershipType, email, phoneNumber, status);
    }

    @Override
    public String getSearchKey() {
        return id;
    }


}
