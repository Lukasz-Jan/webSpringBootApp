package webSpringBootApp.data.interfaces;

import java.util.List;

import webSpringBootApp.data.Student;

public interface StudentProducer {

	Student produceStudent(int id);
	
	List<Student> produceStudents();
}
