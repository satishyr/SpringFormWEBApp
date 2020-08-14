package in.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.nit.service")
public class ServiceConfig {

	  public ServiceConfig() {
		System.out.println("ServiceConfig: 0-param constructor");
	}
}
