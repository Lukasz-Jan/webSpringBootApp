package pagesPackage;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import webSpringBootApp.HelloController;
import webSpringBootApp.data.Student;
import webSpringBootApp.data.interfaces.StudentProducer;

@Controller
//@ComponentScan("webSpringBootApp")
public class HelloControl {

	@Autowired
	private StudentProducer stProd;
	
	public static final Logger log = LoggerFactory.getLogger(HelloController.class);
			
	//	https://stackoverflow.com/questions/39077787/difference-between-the-annotations-getmapping-and-requestmappingmethod-requ	
	
	@RequestMapping("/")
	public String index() {
		
		
		//applicationContext.close();
		
		return "Hello from first application Hello Hello";
	}
	

	@RequestMapping("/helloC")
	public String hello(Model model) {
		
		//StudentProducer stProd = new StudentProducer_Impl();
		
		List<Student> list = stProd.produceStudents();

		log.info(list.get(0).getAddresslist().get(0).getAddress());
		
		model.addAttribute("studentList_1", list);
		
		return "helloC";
	}
}
