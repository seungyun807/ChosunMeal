package chatbot.chosunmeal.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Getter
@Setter

public class MealTable {
    private String day;
    private String when;
    private String menu;

    public MealTable(){}
    public MealTable(String day, String when, String menu){
        super();
        this.day = day;
        this.when = when;
        this.menu = menu;
    }


//    public void setDay(String DAY){
//        this.day = DAY;
//    }

}

