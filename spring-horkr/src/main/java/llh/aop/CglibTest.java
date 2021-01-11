package llh.aop;

import org.springframework.stereotype.Component;

@Component
public class CglibTest {
	public void test(){
		System.err.println("cglib 执行");
	}
}
