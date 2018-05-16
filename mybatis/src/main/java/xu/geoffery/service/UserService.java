package xu.geoffery.service;

import xu.geoffery.domain.User;

public interface UserService {

	void addUser(User user);
	
	User getUserById(String userId);
}
