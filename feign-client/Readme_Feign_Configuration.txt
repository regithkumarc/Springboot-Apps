
Feign Client :

URL :

https://www.youtube.com/results?search_query=spring+boot+topics



1) create service application also need to create client app also

2) Need to add feign dependency in application.properties

<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

3) then need to add @EnableFeignClients in main class

4) the we need to add controller and need to create the util class also

5) Add below code in Client Code

client : (port - 8088)


@RestController
@RequestMapping("/FeignClientController")
public class FeignClientController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/feign-name")
	public String getName() {
		return feignServiceUtil.getName();
	}
	
	@GetMapping("/feign-status")
	public String getStatus() {
		return feignServiceUtil.getStatus();
	}
}

@FeignClient(value = "feignDemo",url="http://localhost:8087/FeignServiceController/")
public interface FeignServiceUtil {
	
	@GetMapping("/getName")
	public String getName();
	
	@GetMapping("/getStatus")
	public String getStatus();

}


6) add below in service class

service : (port - 8087)

@RestController
@RequestMapping("/FeignServiceController")
public class FeignServiceController {
	
	@GetMapping("/getName")
	public String getName() {
		return "getting name";
	}
	
	@GetMapping("/getStatus")
	public String getStatus() {
		return "getting status";
	}

}

6) here we are adding the url to call and get the value from the partricular end point

7) end point for service and client

http://localhost:8087/FeignServiceController/getName

http://localhost:8088/FeignClientController/feign-status