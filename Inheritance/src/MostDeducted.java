
public class MostDeducted extends PartialSalary {

	public MostDeducted() {
		// TODO Auto-generated constructor stub
	}
	
	public MostDeducted(String name, double age, String address, String nationality,
			double salary, String rank, String job, double bonus, double deduct) {
		super(name, age, address, nationality, salary, rank, job, bonus, deduct);
	}
	
	
	public double getDeduction() {
		return (Salary+Bonus+Deduction)-(Salary+Bonus);
	}	

}
