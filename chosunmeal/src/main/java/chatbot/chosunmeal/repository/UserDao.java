//package chatbot.chosunmeal.repository;
//
//import chatbot.chosunmeal.service.MealTable;
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.List;
//
//@Repository
//public class UserDao {
//    private SqlSession sqlSession;
//    public UserDao(SqlSession sqlSession){
//        this.sqlSession = sqlSession;
//    }
//
//    public List<MealTable> getMeals() {
//        return sqlSession.selectList("chatbot.chosunmeal.repository.UserMapper.selectUsers");
//    }
//}