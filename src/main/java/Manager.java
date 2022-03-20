import Entity.Booking;
import Entity.Guest;
import Entity.Room;
import Service.BookingService;
import Service.GuestService;
import Service.RoomService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * For Test
 */
public class Manager {

    public static void main(String[] args){
        Room room = new Room();
        room.setAvaliable(true);
        room.setGid(1);
        room.setRid(1);
        Room room1 = new Room();
        room1.setAvaliable(true);
        room1.setGid(2);
        room1.setRid(2);
        Room room2 = new Room();
        room2.setAvaliable(true);
        room2.setGid(3);
        room2.setRid(3);
        List<Room> list = new ArrayList<>();
        list.add(room);
        list.add(room1);
        list.add(room2);
        Guest guest = new Guest();
        guest.setGid(1);
        guest.setName("a");
        Guest guest1 = new Guest();
        guest1.setGid(2);
        guest1.setName("b");
        Guest guest2 = new Guest();
        guest2.setGid(3);
        guest2.setName("c");
        GuestService guestService = new GuestService();
        List<Room> res = guestService.findAll(list,guest.getGid());
        System.out.println("==========查询该客户的房间：");
        for(Room r : res){
            System.out.println("房间号:" + r.getRid());
        }
        RoomService roomService = new RoomService();
        List<Room> l = roomService.findAvaliable(list, new Date());
        System.out.println("==========查询空闲的房间：");
        for(Room r : l){
            System.out.println("空闲的房间号:" + r.getRid());
        }
        Booking booking = new Booking();
        booking.setBid(1);
        booking.setDate(new Date());
        booking.setGid(1);
        booking.setGname("a");
        booking.setRnum(1);
        BookingService bookingService = new BookingService();
        bookingService.addBooking(booking);

    }


}
