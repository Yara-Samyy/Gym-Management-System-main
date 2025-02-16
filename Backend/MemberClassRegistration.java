
package Backend;

import java.time.LocalDate;
public class MemberClassRegistration extends Record {
    
    private String memberID;
    private String classID;
    private String status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberID, String classID, String status, LocalDate registrationDate) {
        super(memberID.concat(classID));
        this.memberID = memberID;
        this.classID = classID;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    
    public String getMemberId(){
        return memberID;
    }
    public String getClassId(){
        return classID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
   
    public LocalDate getRegistrationDate (){
        return registrationDate;
    }
    @Override
    public String getSearchKey(){
        String key= memberID.concat(classID);
      
        return key;
    }

    @Override
    public String lineRepresentation() {
        return String.join(",", memberID, classID, registrationDate.toString(), status);
    }    
}
