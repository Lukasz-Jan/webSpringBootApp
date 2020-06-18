package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public interface AddressGenerator {
	
	final List<String> streets = Arrays.asList("Wajdeloty", "Chrobrego", "Kaczyńskiego", "Hausnera", "Niepodległości", "Wawelska", "Płażyńskiego");
	final List<String> cities = Arrays.asList("Gdańsk", "Warszawa", "Kraków", "Sopot", "Kopenhaga", "Marsylia", "Sromowce Niżne");

	public Address generateAddress();
}
