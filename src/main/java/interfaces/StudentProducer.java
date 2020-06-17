package interfaces;

import java.util.List;

import webSpringBootApp.Student;

public interface StudentProducer {

	Student produceStudent(int id);
	
	List<Student> produceStudents();
}
