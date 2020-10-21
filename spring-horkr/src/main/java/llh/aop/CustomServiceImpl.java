package llh.aop;

import org.springframework.stereotype.Service;

@Service
public class CustomServiceImpl implements CustomService{
	@Override
	public void add() {
		System.err.println("add() invoke");
	}

	@Override
	public void reduce() {
		System.err.println("reduce() invoke");
	}

	@Override
	public int get() {
		System.err.println("reduce() invoke");
		return 1;
	}
}
