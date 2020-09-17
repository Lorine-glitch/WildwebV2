package lorine.com.wildwebv2.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import lorine.com.wildwebv2.Model.Booking;
import lorine.com.wildwebv2.Repository.BookingRepository;
import lorine.com.wildwebv2.Service.BookingService;

@Controller
public class BookingController  {
	//private final BookingRepository bookingRepository = null;
	
	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private BookingService bookingservice;
	private Object bookingService;
	
	@GetMapping("/")
public String bookingHome(Model model) {
	model.addAttribute("bookings",bookingservice.getAllBookings());
	return "index";
}
	@GetMapping("/getBookingForm")
	public String Bookingform(Model model) {
		Booking booking =new Booking();
		model.addAttribute("booking",booking);
		return "booking";
	}
	@PostMapping("/newBooking")
	public String saveBooking(@ModelAttribute("booking") Booking booking) {
		bookingservice.newBooking(booking);
		return "redirect:/";
	}
	
	
	@GetMapping("/deleteBooking1/{id}")
	public String deleteBooking(@ModelAttribute(value = "id") long id) {
		this.bookingRepository.deleteById(id);
		return "redirect:/";
	}
	
	// fetching all bookings 
	@GetMapping("/fetchAll")
	public List<Booking> fetchAllBookings(){
		List<Booking> bb=bookingRepository.findAll();
		System.out.println("***********List of Booking*******\n"+bb);
		
		return bb;
	}

	@GetMapping("/UpdateBooking/{id}")
	public String UpdateBooking(@PathVariable(value = "id") long id, Model model) {
		Booking booking = bookingservice.getBookingById(id);
		model.addAttribute("booking", booking);
		return "updateBooking";
	}
}


	
