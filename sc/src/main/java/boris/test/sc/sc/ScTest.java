package boris.test.sc.sc;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScTest {
	@Scheduled(fixedRate = 1000)
	public void ttt() {
		System.out.println("xxyyzz");
		System.out.println("add");
		System.out.println("this is from b2" + "this is another oneCC");
		System.out.println("this is form master" + "and another one");
	}
}
