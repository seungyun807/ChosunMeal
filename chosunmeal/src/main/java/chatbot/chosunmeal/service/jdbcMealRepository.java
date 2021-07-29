package chatbot.chosunmeal.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class jdbcMealRepository {

    Connection conn = null;
    Statement stmt = null;

    String url = "jdbc:mariadb://db.c3v7iazhsj6s.us-east-2.rds.amazonaws.com:3306/DB?serverTimezone=UTC&characterEncoding=UTF-8";
    String user = "user";
    String pw = "a1645389";

    public void connect(List<MealTable> mealTable) {

        try{
            conn = DriverManager.getConnection(url, user, pw);

            stmt = conn.createStatement();

            System.out.println("Successfully Connected!");


            StringBuilder sb = new StringBuilder();
            String sql = sb.append("CREATE TABLE IF NOT EXISTS meal(")
                    .append("date varchar(50),")
                    .append("day varchar(20),")
                    .append("time varchar(20),")
                    .append("menu varchar(200)")
                    .append(");").toString();

            stmt.execute(sql);

            sb.setLength(0);
            String truncate = sb.append("TRUNCATE meal;").toString();
            stmt.execute(truncate);


            for (int i = 0; i < 10; i++){
                String temp = mealTable.get(i).getDay();
                String date = temp.substring(5, 10);

                temp = mealTable.get(i).getDay();
                String day = temp.substring(13, 14);

                String sql1 = "INSERT INTO meal VALUES ('"+date+"', '"+day+"', '"+mealTable.get(i).getWhen()+"', '"+mealTable.get(i).getMenu()+"');";
                stmt.execute(sql1);
            }


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
        String sql = "select * from meal;";
        try {
            stmt.execute(sql);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


}
