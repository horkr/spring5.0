package llh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class CustomAspect {

	@Pointcut("execution(public * llh.aop.CustomService.*(..))")
	public void pointCut(){};

	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName()+" invoke after");
	}

	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName()+" invoke before");
	}

	@AfterReturning(value = "pointCut()")
	public void afterReturning(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName()+" invoke afterReturning");
	}
	@AfterThrowing(value = "pointCut()")
	public void afterThrow(JoinPoint joinPoint){
		System.err.println(joinPoint.getSignature().getName()+" invoke afterThrowing");
	}
}
