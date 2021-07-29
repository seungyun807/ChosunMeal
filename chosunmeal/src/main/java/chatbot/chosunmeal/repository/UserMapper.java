package chatbot.chosunmeal.repository;


import chatbot.chosunmeal.service.MealTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select(value = "select * from meal")
    List<MealTable> selectmeals();
}