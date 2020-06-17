package webSpringBootApp;

import java.io.Serializable;
import java.util.List;


public class Student implements Serializable {

	private Integer id;
	private String name;
	private Integer age;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Student(Integer id, String name, Integer age, List<Adress> addresslist) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.addresslist = addresslist;
	}


	
	List<Adress> addresslist;


	public List<Adress> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(List<Adress> addresslist) {
		this.addresslist = addresslist;
	}
	
}
