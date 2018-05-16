package xu.geoffery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xu.geoffery.dao.UserMapper;
import xu.geoffery.domain.User;
import xu.geoffery.service.UserService;

/**
 * 
 * @author xug
 * 
 * 使用@Service注解将UserServiceImpl类标注为一个service service的id是userService
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	/**
	 * 使用@Autowired注解标注userMapper变量， 
	 * 当需要使用UserMapper时，Spring就会自动注入UserMapper
	 */
	@Autowired
	private UserMapper userMapper;	//注入dao

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public User getUserById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
