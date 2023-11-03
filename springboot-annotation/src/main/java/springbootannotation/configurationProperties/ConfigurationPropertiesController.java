package springbootannotation.configurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ConfigurationPropertiesController")
public class ConfigurationPropertiesController {
	
	@Autowired
	MailProps mailProps;

	@GetMapping("/getConfigurationPropertyData")
	public String getConfigurationPropertyData() {
		return mailProps.getName() + " : " + mailProps.getPort();
	}
}
