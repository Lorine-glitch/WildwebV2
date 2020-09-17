package lorine.com.wildwebv2.Service;

import java.util.List;

import lorine.com.wildwebv2.Model.Login;
import lorine.com.wildwebv2.Model.Registration;



public interface RegistrationService {
	List<Registration>getAllRegistrations();
	void addNewUser(Registration registration);
}
