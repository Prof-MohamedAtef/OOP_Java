
public class Employee extends Person {
	
	
	static double Salary;
	String Rank, Job;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee( String name, double age, String address, String nationality, double salary, String rank, String job) {
		super(name, age, address, nationality);
		Salary=salary;
		Rank=rank;
		Job=job;
	}
	
	
	public void setSalary(double sal) {
		Salary=sal;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public double getDeduction() {
		return 0;
	}
	
	@Override
	public void printAllDetails() {
		super.printAllDetails();
		System.out.println("Job: "+ Job+"/n Rank: "+Rank+"/n Salary:"+Salary);
		
	}

}
