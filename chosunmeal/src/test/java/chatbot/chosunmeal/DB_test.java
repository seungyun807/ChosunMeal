package chatbot.chosunmeal;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.PropertySource;

import java.sql.Connection;
import java.sql.DriverManager;

@PropertySource("classpath:/application.properties")
public class DB_test {
    @Test
    public void test() throws Exception{
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test",
                "root",
                "");
        System.out.println(con);
    }
}
