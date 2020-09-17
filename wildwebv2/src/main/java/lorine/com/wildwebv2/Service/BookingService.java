package lorine.com.wildwebv2.Service;
import java.util.List;

import lorine.com.wildwebv2.Model.Booking;

public interface BookingService{
 List<Booking>getAllBookings();
 void newBooking(Booking booking);
 void saveBooking(Booking booking);
 void upBooking(Booking booking);
 Booking getBookingById(long id);

}
