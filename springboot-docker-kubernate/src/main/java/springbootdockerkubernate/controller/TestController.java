package springbootdockerkubernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestController")
public class TestController {
	
	@GetMapping("/getString")
	public String getString() {
		return "getting string with docker";
	}
	
	@GetMapping("/getData")
	public String getData() {
		return "getting data";
	}


}
