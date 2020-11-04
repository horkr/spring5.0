package llh.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 用以注册bean定义 ConfigurationClassPostProcessor（扫描spring容器bean定义的）就是实现了BeanDefinitionRegistryPostProcessor
 * 在spring使用ConfigurationClassPostProcessor解析完bean后，会将我们自己写的也注册到bd map中，然后会再执行我们自己实现的CustomBeanDefinitionRegistryPostProcessor
 * 之后再执行实现了BeanFactoryPostProcessor的postProcessBeanFactory方法
 */
@Component
public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		int beanDefinitionCount = registry.getBeanDefinitionCount();
		System.err.println("当前已注册的bean数量:"+beanDefinitionCount);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
	}
}
