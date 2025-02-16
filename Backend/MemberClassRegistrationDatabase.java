package Backend;
import java.time.LocalDate;
public class MemberClassRegistrationDatabase extends Database{
    
    
    
    public MemberClassRegistrationDatabase(String filename) {
        super(filename);
    }

    @Override
    protected Record createRecordFrom(String line) {
        String[] res = line.split(",");
        if (res.length == 4){
            String MemberID = res[0];
            String classID = res[1];
            String registrationDate = res[2];
            String status = res[3];
            return new MemberClassRegistration(MemberID, classID, status, LocalDate.parse(registrationDate));
        } else {
            return null;
        }
    
    }
    
}

