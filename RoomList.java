//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : RoomList.java
//  @ Date : 10/27/2017
//  @ Author : 
//
//


import java.util.ArrayList;

public class RoomList {
	private ArrayList<Room> rooms = new ArrayList<>();

	public Room findRoom(int roomNumber) {
		return rooms.get(roomNumber - 1);
	}
	
	public ArrayList<Room> getRelatedFreeRooms(RoomDescription roomDesc) {
		ArrayList<Room> result = new ArrayList<>();
		for (int i = 0; i < rooms.size(); i++) {
			Room room = rooms.get(i);
			if (room.check(roomDesc)) {
				result.add(room);
			}
		}
		return result;
	}
	
	private void load() {
	
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
}
