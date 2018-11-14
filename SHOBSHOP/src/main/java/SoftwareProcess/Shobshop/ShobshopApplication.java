package SoftwareProcess.Shobshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableAutoConfiguration
@SpringBootApplication
public class ShobshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShobshopApplication.class, args);
	}
}
