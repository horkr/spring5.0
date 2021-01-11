package llh.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
	private B b;

	public void doA(){
		System.err.println("do A...");
	}
}
