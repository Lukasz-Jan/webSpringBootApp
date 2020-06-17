package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import webSpringBootApp.Adress;

public interface AddressGenerator {
	
	final List<String> streets = Arrays.asList("Gdańsk Wajdeloty", "Warszawa Chrobrego", "Kraków Kaczyńskiego", "Sopot Hausnera", "Warszawa Niepodległości", "Warszawa Wawelska", "Gdańsk Płażyńskiego");

	Address generateAddress();
}
