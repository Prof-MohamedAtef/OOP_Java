
public class SalariedEmployee extends Employee{
	
	static double Bonus;
	double Deduction;

	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(String name, double age, String address, String nationality,
			double salary, String rank, String job, double bonus, double deduct) {
		super(name,age,address,nationality,salary, rank, job);
		Bonus=bonus;
		Deduction=deduct;
	}
	
	@Override
	public double getSalary() {
		return Salary+Bonus-Deduction;
	}
	
	
	
}
