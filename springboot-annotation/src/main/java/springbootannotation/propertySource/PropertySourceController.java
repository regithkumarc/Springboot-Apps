package springbootannotation.propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PropertySourceController")
@PropertySource("classpath:custom.properties")
public class PropertySourceController {
	
	@Value("${mail.name}")
	private String name;
	
	@Value("${address}")
	private String address;

	@GetMapping("/getPropertyData")
	public String getPropertyData() {
		return name + " : " + address;
	}
}
