import java.util.ArrayList;

public class GuestList {
 private ArrayList<Guest> guests = new ArrayList<Guest>();

 public Guest makeGuest(String personalData, Reservation res) {
  Guest newGuest = new Guest(personalData, res);
  guests.add(newGuest);
  return newGuest;
 }

 private void load() {

 }

 public void removeGuest(Guest guest) {
  guests.remove(guest);
 }

 public ArrayList<Guest> getGuests() {
  return guests;
 }

 public void setGuests(ArrayList<Guest> guests) {
  this.guests = guests;
 }




}