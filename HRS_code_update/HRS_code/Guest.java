public class Guest {
 private String checkInTime;
 private String checkOutTime;
 private String personalData;
 private Reservation res;

 public Guest(String personalData, Reservation res) {
  this.personalData = personalData;
  this.res = res;

  String timeInterval = res.getTimeInterval();
  String dates[] = timeInterval.split("-");
  checkInTime = dates[0];
  checkOutTime = dates[1];
 }

 public String getCheckInTime() {
  return checkInTime;
 }

 public void setCheckInTime(String checkInTime) {
  this.checkInTime = checkInTime;
 }

 public String getCheckOutTime() {
  return checkOutTime;
 }

 public void setCheckOutTime(String checkOutTime) {
  this.checkOutTime = checkOutTime;
 }

 public String getPersonalData() {
  return personalData;
 }

 public void setPersonalData(String personalData) {
  this.personalData = personalData;
 }

 public Reservation getRes() {
  return res;
 }

 public void setRes(Reservation res) {
  this.res = res;
 }
}