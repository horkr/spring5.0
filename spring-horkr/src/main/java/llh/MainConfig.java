package llh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(llh.Import.class)
@ComponentScan(basePackages = {"llh"})
public class MainConfig {
	@Bean
	public String custom(){
		return "嘻嘻";
	}

}
