package llh;

import llh.service.UserSerivce;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp extends AnnotationConfigApplicationContext{



	public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		UserSerivce bean = ctx.getBean(UserSerivce.class);
		bean.createUser("xxx");
	}
}
