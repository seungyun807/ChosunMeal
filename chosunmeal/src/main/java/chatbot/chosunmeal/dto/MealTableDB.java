package chatbot.chosunmeal.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MealTableDB {
    private String date;
    private String day;
    private String time;
    private String menu;

    public MealTableDB(){}
    public MealTableDB(String date, String day, String time, String menu){
        super();
        this.date = date;
        this.day = day;
        this.time = time;
        this.menu = menu;

    }
}
