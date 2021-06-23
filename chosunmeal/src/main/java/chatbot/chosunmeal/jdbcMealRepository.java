package chatbot.chosunmeal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class jdbcMealRepository {
    public void connect() {
        Connection conn = null;
        Statement stmt = null;

        String url = "jdbc:mariadb://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC";
        String id = "root";
        String pw = "1234";

        try{
            //Class.forName(MAria)
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("Successfully Connected!");
            stmt = conn.createStatement();

            StringBuilder sb = new StringBuilder();
            String sql = sb.append("CREATE TABLE IF NOT EXISTS meal(")
                    .append("day varchar(50),")
                    .append("dow varchar(20), ")
                    .append("menu varchar(200)")
                    .append(");").toString();

            stmt.execute(sql);

            sb.setLength(0);
            String truncate = sb.append("TRUNCATE meal;").toString();
            stmt.execute(truncate);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (conn != null && !conn.isClosed())
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void insert(List<MealTable> mealTable) {
        String temp = mealTable.get(0).toString();
        System.out.println("db 출력 = " + temp.substring(0,5));
//        String sql = "INSERT INTO meal VALUES('" + mealTable.
    }
}
