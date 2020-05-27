package mx.com.profuturo.arquetipo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(properties = "spring.cloud.config.enabled=false")
class ArquetipoApplicationTests {

	@Test
	void contextLoads() {
		 Assert.assertEquals(6,6);
	}

}
