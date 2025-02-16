package Backend;

public class ClassDatabase extends Database {

    public ClassDatabase(String filename) {
        super(filename);
    }

    @Override
    protected Record createRecordFrom(String line) {

        String[] res = line.split(",");
        if (res.length == 5) {
            String classID = res[0];
            String className = res[1];
            String trainerID = res[2];
            String duration = res[3];
            String availableSeats = res[4];
            
            return new Class (classID, className, trainerID, Integer.parseInt(duration), Integer.parseInt(availableSeats));
        } else {
            System.out.println("invalid line in the file");
            return null;
        }
    }
}