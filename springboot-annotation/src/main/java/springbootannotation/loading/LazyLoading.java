package springbootannotation.loading;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoading {
	
	public LazyLoading() {
		System.out.println("Calling LazyLoading");
	}

}
