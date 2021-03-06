//import javafx.util.Pair;

import java.util.ArrayList;

public class Controller {
 private GuestList guestList;
 private RoomDescriptionCatalog roomDescriptionCatalog;
 private ReservationCatalog reservationCatalog;
 private RoomList roomList;
 private Archive archive;
 private Reservation res;

 public void cancelReservation(int reservationID) {
  reservationCatalog.cancelReservation(reservationID);
 }
 
 public boolean check(String roomType, String timeInterval) {
  RoomDescription roomDesc = roomDescriptionCatalog.getRoomDescription(roomType);
  int numberOfRelatedReservations = reservationCatalog.getNumberOfRelatedReservations(roomDesc, timeInterval);
  boolean answer = roomDesc.checkNumber(numberOfRelatedReservations);
  return answer;
 }
 
 public void fixRoom(int roomNumber, String personalData) {
  Room room = roomList.findRoom(roomNumber);
  Guest guest = guestList.makeGuest(personalData, res);
  room.becomeAllocated(guest, res);
 }
 
 public void freeRoom(int roomNumber) {
  Room room = roomList.findRoom(roomNumber);
  archive.utilizeGuest(room);
  Reservation reservation = room.getReservation();
  Guest guest = room.getGuest();
  room.becomeDeallocated();
  reservationCatalog.removeReservation(reservation);
  guestList.removeGuest(guest);
 }
 
 public ArrayList<Room> getRooms(int reservationID) {
  res = reservationCatalog.getReservation(reservationID);
  RoomDescription roomDesc = res.getRoomDescription();
  ArrayList<Room> result = roomList.getRelatedFreeRooms(roomDesc);
  return result;
 }
 
 public int makeReservation(String roomType, String timeInterval) {
  RoomDescription roomDesc = roomDescriptionCatalog.getRoomDescription(roomType);
  int reservationID = reservationCatalog.makeReservation(roomDesc, timeInterval);
  return reservationID;
 }

 public GuestList getGuestList() {
  return guestList;
 }

 public void setGuestList(GuestList guestList) {
  this.guestList = guestList;
 }

 public RoomDescriptionCatalog getRoomDescriptionCatalog() {
  return roomDescriptionCatalog;
 }

 public void setRoomDescriptionCatalog(RoomDescriptionCatalog roomDescriptionCatalog) {
  this.roomDescriptionCatalog = roomDescriptionCatalog;
 }

 public ReservationCatalog getReservationCatalog() {
  return reservationCatalog;
 }

 public void setReservationCatalog(ReservationCatalog reservationCatalog) {
  this.reservationCatalog = reservationCatalog;
 }

 public RoomList getRoomList() {
  return roomList;
 }

 public void setRoomList(RoomList roomList) {
  this.roomList = roomList;
 }

 public Archive getArchive() {
  return archive;
 }

 public void setArchive(Archive archive) {
  this.archive = archive;
 }

 public Reservation getRes() {
  return res;
 }

 public void setRes(Reservation res) {
  this.res = res;
 }
 
 //public static void main(String[] args) {
        
        //Controller cc = new Controller();
        //System.out.println(cc.makeReservation("sce", "scd"));
        //Reservation r = new Reservation();
        //this.Reservation(1,"timeint",rd);
        
    //}
}