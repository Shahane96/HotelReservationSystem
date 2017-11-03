public class Hotel {
 private Object address;
 private Object name;
 private RoomDescriptionCatalog roomDescriptionCatalog;
 private RoomList roomList;
 private ReservationCatalog reservationCatalog;
 private Archive archive;
 private GuestList guestList;
 private Controller controller;


 public Object getAddress() {
  return address;
 }

 public void setAddress(Object address) {
  this.address = address;
 }

 public Object getName() {
  return name;
 }

 public void setName(Object name) {
  this.name = name;
 }

 public RoomDescriptionCatalog getRoomDescriptionCatalog() {
  return roomDescriptionCatalog;
 }

 public void setRoomDescriptionCatalog(RoomDescriptionCatalog roomDescriptionCatalog) {
  this.roomDescriptionCatalog = roomDescriptionCatalog;
 }

 public RoomList getRoomList() {
  return roomList;
 }

 public void setRoomList(RoomList roomList) {
  this.roomList = roomList;
 }

 public ReservationCatalog getReservationCatalog() {
  return reservationCatalog;
 }

 public void setReservationCatalog(ReservationCatalog reservationCatalog) {
  this.reservationCatalog = reservationCatalog;
 }

 public Archive getArchive() {
  return archive;
 }

 public void setArchive(Archive archive) {
  this.archive = archive;
 }

 public GuestList getGuestList() {
  return guestList;
 }

 public void setGuestList(GuestList guestList) {
  this.guestList = guestList;
 }

 public Controller getController() {
  return controller;
 }

 public void setController(Controller controller) {
  this.controller = controller;
 }
}