package springbootannotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ValueController")
public class ValueController {
	
	@Value("${mail.name}")
	private String name;
	
	@Value("${mail.port}")
	private String port;
	
	@GetMapping("/getValueData")
	public String getValueData() {
		return name + " : "+ port;
	}

}
