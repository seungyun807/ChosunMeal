package chatbot.chosunmeal.service;

import chatbot.chosunmeal.dto.MealTableDB;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface MealService {
    HashMap<String, Object> getTodayMeals();
    HashMap<String, Object> getTomorrowMeals();

}
