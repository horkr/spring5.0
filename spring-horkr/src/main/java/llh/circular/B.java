package llh.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
	@Autowired
	private A a;

	public void doB(){
		System.err.println("do B...");
	}
}
