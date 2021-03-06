public class Room {
 private int number;
 private boolean status;
 private RoomDescription roomDescription;
 private Guest guest; 
 private Reservation reservation;


 public void becomeAllocated(Guest guest, Reservation res) {
  status = false;
  this.guest = guest;
  this.reservation = res;
 }
 
 public void becomeDeallocated() {
  status = true;
  guest = null;
  reservation = null;
 }
 
 public boolean check(RoomDescription roomDesc) {
  return status && roomDescription.equals(roomDesc);
 }

 public int getNumber() {
  return number;
 }

 public void setNumber(int number) {
  this.number = number;
 }

 public boolean getStatus() {
  return status;
 }

 public void setStatus(boolean status) {
  this.status = status;
 }

 public RoomDescription getRoomDescription() {
  return roomDescription;
 }

 public void setRoomDescription(RoomDescription roomDescription) {
  this.roomDescription = roomDescription;
 }

 public Guest getGuest() {
  return guest;
 }

 public void setGuest(Guest guest) {
  this.guest = guest;
 }

 public Reservation getReservation() {
  return reservation;
 }

 public void setReservation(Reservation reservation) {
  this.reservation = reservation;
 }


}