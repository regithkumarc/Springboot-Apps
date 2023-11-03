package springbootannotation.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ProfileController")
public class ProfileController {
	
	@Value("${name}")
	String name;
	
	@Value("${port}")
	String port;

	@GetMapping("/getProfileData")
	public String getProfileData() {
		return name + " : " + port;
	}
	
}
