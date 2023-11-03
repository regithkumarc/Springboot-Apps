package springbootannotation.loading;

import org.springframework.stereotype.Component;

@Component
public class EagerLoading {

	public EagerLoading() {
		System.out.println("Calling EagerLoading");
	}
}
