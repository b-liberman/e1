package boris.test.sc.sc;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScTest {
	@Scheduled(fixedRate = 1000)
	public void ttt() {
		System.out.println("1234");
	}
}