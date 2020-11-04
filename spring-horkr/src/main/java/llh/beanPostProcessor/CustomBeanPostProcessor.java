package llh.beanPostProcessor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


/**
 * BeanPostProcessor的俩个方法会在bean对象的初始化方法之前和之后执行
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("user")){
			System.err.println(beanName+" invoke postProcessBeforeInitialization");
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("user")){
			System.err.println(beanName+" invoke postProcessAfterInitialization");
		}
		return null;
	}
}
