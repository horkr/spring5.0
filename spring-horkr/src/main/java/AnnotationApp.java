import llh.MainConfig;
import llh.aop.CustomService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        ctx.getBean(CustomService.class).add();
		//手动发布一个事件
//		ctx.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
//			@Override
//			public Object getSource() {
//				return super.getSource();
//			}
//		});
	}
}
