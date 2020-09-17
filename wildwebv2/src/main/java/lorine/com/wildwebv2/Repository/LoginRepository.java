package lorine.com.wildwebv2.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lorine.com.wildwebv2.Model.Registration;

@Repository

public interface LoginRepository extends JpaRepository<Registration, Long> {

}
