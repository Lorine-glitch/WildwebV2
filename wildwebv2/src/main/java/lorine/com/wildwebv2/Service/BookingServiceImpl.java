package lorine.com.wildwebv2.Service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lorine.com.wildwebv2.Model.Booking;
import lorine.com.wildwebv2.Repository.BookingRepository;


@Service
public  class BookingServiceImpl implements BookingService{
@Autowired
private BookingRepository bookingRepository;
	@Override
	public List<Booking> getAllBookings() {
		
		return bookingRepository.findAll();
	}
	@Override
	public void newBooking(Booking booking) {
		this.bookingRepository.save(booking);
		
	}
	
	public void newBookings( Booking booking){
	this.bookingRepository.delete(booking);
}
	@Override
	public void saveBooking(Booking booking) {
		this.bookingRepository.save(booking);
		
	}

	@Override
	public Booking getBookingById(long id) {
		Optional<Booking> optional =bookingRepository.findById(id);
		Booking booking =null;
		if(optional.isPresent()) {
			booking =optional.get();
		}
		else {
			throw new RuntimeErrorException(null, "Destination not found id: "+id);
		}
		return booking;
	}
	@Override
	public void upBooking(Booking booking) {
		this.bookingRepository.save(booking);
		
	}


}
