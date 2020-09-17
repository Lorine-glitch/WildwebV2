package lorine.com.wildwebv2.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lorine.com.wildwebv2.Model.Registration;
import lorine.com.wildwebv2.Repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {
@Autowired
RegistrationRepository registrationRepository;

@Override
public List<Registration> getAllRegistrations() {
	return registrationRepository.findAll();

}

@Override
public void addNewUser(Registration registration) {
  this.registrationRepository.save(registration);
	
}

}



