package lorine.com.wildwebv2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lorine.com.wildwebv2.Model.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

	//void updateBookingById(long id);

 
//void deleteById(long id);
//
//List<Booking> findAll();
//
//void updateById(long id);



	

	
}
