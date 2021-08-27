package chatbot.chosunmeal.controller;

import chatbot.chosunmeal.dto.MealTableDB;
import chatbot.chosunmeal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MealController {
    HashMap<String, Object> jsonObject = null;

    @Autowired
    MealService mealService;

    @RequestMapping("/getmenu")
    @ResponseBody
    public HashMap<String, Object> getmenu(@RequestBody String map){
        if(map.contains("오늘")){
            return mealService.getTodayMeals();
        }
        else if(map.contains("내일")){
            return mealService.getTomorrowMeals();
        }
        return null;
    }

}