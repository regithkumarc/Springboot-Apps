package springbootannotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ScopePrototypeController")
@Scope("prototype")
public class ScopePrototypeController {
	
	public ScopePrototypeController() {
		System.out.println("ScopePrototypeController");
	}
	
	@GetMapping("/getPrototypeScope")
	public String getPrototypeScope() {
		return "getting Prototype Scope";
	}

}
