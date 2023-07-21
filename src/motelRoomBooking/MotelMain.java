package motelRoomBooking;

import java.util.Scanner;

public class MotelMain {

	public static void main(String[] args) {

		Room roomBasic = new Room("Basic", true, 100);
		Room roomDeluxe = new Room("Deluxe", true, 200);
		Room roomLuxury = new Room("Luxury", true, 300);

		Room[] allRoomsOfBlossom = { roomBasic, roomDeluxe, roomLuxury };

		Motel blossom = new Motel("Blossom", 5, allRoomsOfBlossom);

		Room roomCBasic = new Room("Basic", true, 100);
		Room roomCDeluxe = new Room("Deluxe", true, 200);
		Room roomCLuxury = new Room("Luxury", true, 300);

		Room[] allRoomsOfCherry = { roomCBasic, roomCDeluxe, roomCLuxury };
		Motel cherry = new Motel("Cherry", 5, allRoomsOfCherry);

		Motel[] allMotels = { blossom, cherry };
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Motel u wanna book");
		String motelBook = sc.next();
		for (int i = 0; i < allMotels.length; i++) {
			if (motelBook.equals(allMotels[i].nameOfMotel)) {
				System.out.println("Motel is available, plz tell which room u wanna book");
				String roomType = sc.next();
				if (allMotels[i].room[i].type.equals(roomType) && allMotels[i].room[i].isAvialable) {
					System.out.println("Room can be booked,can we have your name and id ");
					String nameOfCustomer = sc.next();
					String id = sc.next();
					GuestDetails details = new GuestDetails(nameOfCustomer, id, allMotels[i].room[i]);

					System.out.println(
							"The room " + allMotels[i].room[i] + "has been assigned to " + details.nameOfGuest);
				}
			}
		}
	}
}
