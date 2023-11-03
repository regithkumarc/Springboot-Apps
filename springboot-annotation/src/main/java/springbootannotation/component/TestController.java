package springbootannotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestController")
public class TestController {
	
	@Autowired
	private TestBean testbean;
	
	@GetMapping("/getTest")
	public String getTest() {
		testbean.method();
		return "getting test";
	}

}
