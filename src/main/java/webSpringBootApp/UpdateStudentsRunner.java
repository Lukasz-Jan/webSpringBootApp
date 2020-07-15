package webSpringBootApp;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import webSpringBootApp.dataBase.interfaces.StudentRepoExt;
import webSpringBootApp.entities.Students;

public class UpdateStudentsRunner implements CommandLineRunner {

	public static final Logger log = LoggerFactory.getLogger(UpdateStudentsRunner.class);

	@Autowired
	StudentRepoExt stRepo;

	public void run(String... args) {

		final List<String> persons = Arrays.asList("Marek Łoś", "Krzysztof Marks", "Krzysztof Kluczyk",
				"Monika Oloejnik", "Henryk Sienkiewicz", "Juliusz Verne", "Adam Małysz", "Papcio Chmiel");

		for (String per : persons) {

			Students st = stRepo.getStudentByName(per);

			if (st == null) {
				Students stAdd = new Students(per, generateAge(40));
				stRepo.save(stAdd);
			} else
				log.info("Student already added");
		}
	}

	private int generateAge(int max) {

		int rand = 17;

		while (rand < 18) {

			rand = (int) (Math.random() * max);
			log.info("rand: " + rand);

		}
		return rand;
	}

}
