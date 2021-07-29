package chatbot.chosunmeal.repository;

import chatbot.chosunmeal.service.MealTable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    private UserMapper userMapper;
   // private UserDao userDao;

//    public UserService(UserMapper userMapper, UserDao userDao){
//        this.userMapper = userMapper;
//        this.userDao = userDao;
//    }

    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public List<MealTable> getMeals() {
        return userMapper.selectmeals();
    }

//    public List<MealTable> getUsersWithDao() {
//        return userDao.getMeals();
//    }

}