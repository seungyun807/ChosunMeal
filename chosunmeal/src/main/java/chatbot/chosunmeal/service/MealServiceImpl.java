package chatbot.chosunmeal.service;

import chatbot.chosunmeal.dto.MealTableDB;
import chatbot.chosunmeal.repository.MealMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MealServiceImpl implements MealService{
    @Resource
    MealMapper mealMapper;

    @Autowired
    JsonText jsontext;
    int day_of_week = 0;

    public List<Map<String, String>> getDayMenu(int index) {
        if (index == 1)
            day_of_week = DayOfWeek.getDayOfWeek();
        else
            day_of_week = DayOfWeek.getDayOfWeek()+1;

        switch (day_of_week) {
            case 1:
                return mealMapper.selectmeals_1();
            case 2:
                return mealMapper.selectmeals_2();
            case 3:
                return mealMapper.selectmeals_3();
            case 4:
                return mealMapper.selectmeals_4();
            case 5:
                return mealMapper.selectmeals_5();
            case 6:
                return mealMapper.selectmeals_6();
            case 7:
                return mealMapper.selectmeals_7();
            case 8:
                return mealMapper.selectmeals_1();
        }
        return null;
    }



//    public List<MealTableDB> getAllMeals() {
//        return mealMapper.selectmeals();
//    }


    public HashMap<String, Object> getTodayMeals(){
        HashMap<String, Object> result;
        List<Map<String, String>> meals = getDayMenu(1);

        String stemp = meals.get(0).toString();
        String strmeals = "점심: [";

        stemp = stemp.substring(6, stemp.length()-1);
        strmeals += stemp;
        strmeals += "]\n저녁: [";
        stemp = meals.get(1).toString();
        stemp = stemp.substring(6, stemp.length()-1);
        strmeals += stemp;
        strmeals += "]";

        result = jsontext.jsonText(strmeals);
        return result;
    }

    public HashMap<String, Object> getTomorrowMeals(){
        HashMap<String, Object> result;
        List<Map<String, String>> meals = getDayMenu(2);

        String stemp = meals.get(0).toString();
        String strmeals = "점심: [";

        stemp = stemp.substring(6, stemp.length()-1);
        strmeals += stemp;
        strmeals += "]\n저녁: [";
        stemp = meals.get(1).toString();
        stemp = stemp.substring(6, stemp.length()-1);
        strmeals += stemp;
        strmeals += "]";

        result = jsontext.jsonText(strmeals);
        return result;
    }

}