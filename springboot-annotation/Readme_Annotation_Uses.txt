
Springboot Annotation :-

1) @SpringbootApplication :-

Start the spring boot app

----------------------------------------------------------------------------------------------

2) Configuration :-

@Configuration
class BeanConfig {
	@Bean
	public TestBean testBean() {
		return new TestBean();
	}
}


class TestBean {
	public void get() {
		System.out.println("calling get method");
	}
}


@RestController
class Controller {
	@Autowired
	TestBean testBean;

	@getMapping
	public void get() {
		testBean.get();
	}
}

----------------------------------------------------------------------------------------------

3) Stero type :-

@RestController
@Service
@Repository - Database connection

----------------------------------------------------------------------------------------------

4) @Qualifier :-

EmployeeService

@Service
EmployeeServiceImpl1 implements EmployeeService 

@Service
EmployeeServiceImpl2 implements EmployeeService 


@RestController
EmployeeController {

@Autowired 
EmployeeService employeeService; // will get the error which impl class it should go thats whay we will use the below line of code

1) 
	@Autowired
	@Qualifier("EmployeeServiceImpl1")
	EmployeeService employeeService; // if we will pass the class it should go that impl class

or else which EmployeeServiceImpl class is primary need to set

2) 
	@Autowired
	EmployeeService employeeService;

	@Service
	@Primary
	EmployeeServiceImpl1 implements EmployeeService 
}

----------------------------------------------------------------------------------------------


