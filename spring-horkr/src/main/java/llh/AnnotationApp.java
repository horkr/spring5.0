package llh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		System.err.println(ctx.getBean(Import.class));
	}
}
