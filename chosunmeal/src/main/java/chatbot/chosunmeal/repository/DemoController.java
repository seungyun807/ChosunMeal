package chatbot.chosunmeal.repository;

import chatbot.chosunmeal.service.MealTable;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class DemoController {
    private UserService userService;
    public DemoController(UserService userService){
        this.userService = userService;
    }
    public List<MealTable> getMeals() {
        return userService.getMeals();
    }


    @GetMapping("/users")
    public List<MealTable> users(Model model){
        model.addAttribute("data", "hi");
       return getMeals();
    }

//    @GetMapping("/usersDao")
//    public List<MealTable> getUsersDao() {
//        return userService.getUsersWithDao();
//    }
}