package chatbot.chosunmeal;

import chatbot.chosunmeal.service.MealDataService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@SpringBootTest
class ChosunmealApplicationTests {

	@Test
	void contextLoads() throws IOException, NoSuchAlgorithmException, KeyManagementException {
		MealDataService data = new MealDataService();
	}


}
