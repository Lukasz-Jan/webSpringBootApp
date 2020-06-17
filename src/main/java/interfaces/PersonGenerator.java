package interfaces;

import java.util.Arrays;
import java.util.List;

public interface PersonGenerator {

	
	final List<String> persons = Arrays.asList("Marek Łoś", "Krzysztof Marks",  "Krzysztof Kluczyk", "Monika Oloejnik", "Henryk Sienkiewicz", "Juliusz Verne", "Adam Małysz", "Papcio Chmiel");
	Person generatePerson();
}
