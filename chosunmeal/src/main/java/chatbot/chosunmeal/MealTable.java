package chatbot.chosunmeal;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Builder
@Getter
public class MealTable {
    private String rice;
    private String soup;
    private String sub1;
    private String sub2;
    private String sub3;
    private String sub4;
    private String sub5;
    private String sub6;
}
