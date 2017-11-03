import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Reservation {
 private int reservationID;
 private String timeInterval;
 private RoomDescription roomDescription;


 public Reservation(int reservationID, String timeInterval, RoomDescription roomDescription) {
  this.reservationID = reservationID;
  this.timeInterval = timeInterval;
  this.roomDescription = roomDescription;
 }

 public boolean check(RoomDescription roomDesc, String timeInterval) {
  if (!roomDesc.equals(roomDescription)) {
   return false;
  } else {
   DateFormat format = new SimpleDateFormat("d/M/y", Locale.ENGLISH);
   String attributeTimeInterval[] = this.timeInterval.split("-");
   String parameterTimeInterval[] = timeInterval.split("-");

   try {
    Date attrCheckIn = format.parse(attributeTimeInterval[0]);
    Date attrCheckOut = format.parse(attributeTimeInterval[1]);

    Date parCheckIn = format.parse(parameterTimeInterval[0]);
    Date parCheckOut = format.parse(parameterTimeInterval[1]);

    if (parCheckIn.before(attrCheckIn) && parCheckOut.before(attrCheckOut) || parCheckIn.after(attrCheckIn) && parCheckOut.after(attrCheckOut)) {
     return true;
    } else {
     return false;
    }
   } catch (ParseException e) {
    e.printStackTrace();
   }
  }

  return false;
 }


 public int getReservationID() {
  return reservationID;
 }

 public void setReservationID(int reservationID) {
  this.reservationID = reservationID;
 }

 public String getTimeInterval() {
  return timeInterval;
 }

 public void setTimeInterval(String timeInterval) {
  this.timeInterval = timeInterval;
 }

 public void setRoomDescription(RoomDescription roomDescription) {
  this.roomDescription = roomDescription;
 }

 public RoomDescription getRoomDescription() {
  return roomDescription;
 }
 

}