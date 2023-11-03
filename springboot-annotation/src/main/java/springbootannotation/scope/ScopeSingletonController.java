package springbootannotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ScopeSingletonController")
@Scope("singleton")
public class ScopeSingletonController {
	
	public ScopeSingletonController() {
		System.out.println("ScopeSingletonController");
	}
	
	@GetMapping("/getSingletonScope")
	public String getSingletonScope() {
		return "getting Singleton Scope";
	}

}
