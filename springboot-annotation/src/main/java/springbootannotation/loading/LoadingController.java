package springbootannotation.loading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("LoadingController")
public class LoadingController {
	
	@Autowired
	LazyLoading lazyLoading;
	
	@GetMapping("/load")
	public void load() {
		
	}

}
