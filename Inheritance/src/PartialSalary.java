
public abstract class PartialSalary extends SalariedEmployee {

	
	public PartialSalary() {
		// TODO Auto-generated constructor stub
	}
	
	public PartialSalary(String name, double age, String address, String nationality,
			double salary, String rank, String job, double bonus, double deduct) {
		super(name, age, address, nationality, salary, rank, job, bonus, deduct);
	}
	
	
	
	public static double getSalaryPlusBonus() {
		return Salary+Bonus;
	}
	
	public abstract double getDeduction();
}
