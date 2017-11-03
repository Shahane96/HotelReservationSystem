import java.util.ArrayList;

public class Archive {
    private ArrayList<Record> records = new ArrayList<Record>();

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    
    }

    private void load() {
      
    }

    public void utilizeGuest(Room room) {
      Record record = new Record();
      record.setRoomNumber(room.getNumber());
      records.add(record);
    }
    
    
}