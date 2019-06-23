
public class Person {

	
	public double age;
	public String Name, Address, Nationality;
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public double getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.Name=name;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setNationality(String nationality) {
		this.Nationality=nationality;
	}
	
	public String getNationality() {
		return this.Nationality;
	}
	
	
	public void setAddress(String address) {
		this.Address=address;
	}
	
	public String getAddress() {
		return this.Address;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Base Constructor!");
	}
	
	public Person(String name, double age, String address, String nationality) {
		Name=name;
		this.age=age;
		Nationality=nationality;
		Address=address;
	
	}
	
	public void printAllDetails() {
		System.out.println("Name: "+Name+"/n Age: "+this.age +"/n Nationality:"+Nationality+"/n Address:"+Address);
	}
}