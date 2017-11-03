import java.util.ArrayList;

public class RoomList {
 private ArrayList<Room> rooms = new ArrayList<Room>();

 public Room findRoom(int roomNumber) {
  return rooms.get(roomNumber - 1);
 }
 
 public ArrayList<Room> getRelatedFreeRooms(RoomDescription roomDesc) {
  ArrayList<Room> result = new ArrayList<Room>();
  for (int i = 0; i < rooms.size(); i++) {
   Room room = rooms.get(i);
   if (room.check(roomDesc)) {
    result.add(room);
   }
  }
  return result;
 }
 
 private void load() {
 
   RoomDescription rd1 = new RoomDescription();
   RoomDescription rd2 = new RoomDescription();
   rd1.setNumberOfRelatedRooms(2);
   rd2.setNumberOfRelatedRooms(1);
   rd1.setRoomType("single");
   rd2.setRoomType("double");
   
   
   Room room1 = new Room();
   room1.setNumber(1);
   room1.setStatus(true);
   room1.setRoomDescription(rd1);
   
   Room room2 = new Room();
   room2.setNumber(2);
   room2.setStatus(true);
   room2.setRoomDescription(rd1);
   
   Room room3 = new Room();
   room3.setNumber(3);
   room3.setStatus(true);
   room3.setRoomDescription(rd2);
   
   rooms.add(room1);
   rooms.add(room2);
   rooms.add(room3);
 }

 public ArrayList<Room> getRooms() {
  return rooms;
 }

 public void setRooms(ArrayList<Room> rooms) {
  this.rooms = rooms;
 }

}