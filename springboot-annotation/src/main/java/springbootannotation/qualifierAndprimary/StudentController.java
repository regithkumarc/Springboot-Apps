package springbootannotation.qualifierAndprimary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StudentController")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudentS() {
		return studentService.getAllStudent();
	}
}
