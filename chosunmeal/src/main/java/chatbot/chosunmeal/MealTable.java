package chatbot.chosunmeal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Getter
public class MealTable {
    private String day;
    private final String when;
    private final String menu;

    public void setDay(String DAY){
        this.day = DAY;
    }
}

