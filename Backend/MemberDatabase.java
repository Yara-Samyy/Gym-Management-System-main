package Backend;

public class MemberDatabase extends Database {

    public MemberDatabase(String filename) {
        super(filename);
    }

    @Override
    protected Record createRecordFrom(String line) {
        String[] res = line.split(",");
        if (res.length == 6) {
            String id = res[0];
            String name = res[1];
            String membershipType = res[2];
            String email = res[3];
            String phoneNumber = res[4];
            String status = res[5];
            return new Member(id, name, membershipType, email, phoneNumber, status);
        }
        else {
            return null;
        }
    }
}
