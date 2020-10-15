package llh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(llh.Import.class)
public class MainConfig {
	@Bean
	public String custom(){
		return "嘻嘻";
	}

}
