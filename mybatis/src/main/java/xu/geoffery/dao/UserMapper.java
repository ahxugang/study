package xu.geoffery.dao;

import java.util.List;

import xu.geoffery.domain.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getAllUser();
    
}
