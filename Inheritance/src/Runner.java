
public class Runner {

	public Runner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1=new Student("Mohamed",16,"Cairo", "Egyptian", 10,"Software Engineer",4.5);
		System.out.println(std1.getName());
		System.out.println(std1.getNationality());
		
		Student std2=new Student();
//		
//		
		
		Employee se1=new Employee("Mohamed", 1, "Alex","Egyptian",6000,"2","Engineer") ;
		
		Employee se2=new SalariedEmployee("Seif", 1, "Cairo","Egyptian",5000,"1","Doctor", 500, 250) ;
		System.out.println(se1.getSalary());
		System.out.println(se2.getSalary());
		
		Employee em1=new Employee("Seif", 1, "Cairo","Egyptian",5000,"1","Doctor");
		em1.printAllDetails();
		
		
		

	}

}
