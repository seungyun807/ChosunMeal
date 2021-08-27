package chatbot.chosunmeal.repository;



import chatbot.chosunmeal.dto.MealTableDB;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface MealMapper {

    @Select(value = "select * from meal")
    List<MealTableDB> selectmeals();

    @Select(value = "select menu from meal where day = N'일'")
    List<Map<String, String>> selectmeals_1();

    @Select(value = "select menu from meal where day = N'월'")
    List<Map<String, String>> selectmeals_2();

    @Select(value = "select menu from meal where day = N'화'")
    List<Map<String, String>> selectmeals_3();

    @Select(value = "select menu from meal where day = N'수'")
    List<Map<String, String>> selectmeals_4();

    @Select(value = "select menu from meal where day = N'목'")
    List<Map<String, String>> selectmeals_5();

    @Select(value = "select menu from meal where day = N'금'")
    List<Map<String, String>> selectmeals_6();

    @Select(value = "select menu from meal where day = N'토'")
    List<Map<String, String>> selectmeals_7();
}
