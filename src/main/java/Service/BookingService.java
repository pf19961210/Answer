package Service;

import Dao.BookingDao;
import Entity.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingService implements BookingDao {

    @Override
    public List<Booking> addBooking(Booking booking) {
      List<Booking> list = new ArrayList<>();
      list.add(booking);
      return list;
    }
}
