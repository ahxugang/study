package xu.geoffery.service;

import java.util.List;

import xu.geoffery.domain.User;

public interface UserService {

	void addUser(User user);

	User getUserById(String userId);

	List<User> getAllUser();

}
