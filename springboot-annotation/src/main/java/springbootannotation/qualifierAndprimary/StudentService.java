package springbootannotation.qualifierAndprimary;

import java.util.List;

public interface StudentService {

	public List<Student> getAllStudent();
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student getStudentById(int id);
	public Student deleteById(int id);
}
