
public class Student extends Person{

	
	int studyLevel;
	String Specialization;
	double GPA;
	
	
	public void setstudyLevel(int studyL) {
		this.studyLevel=studyL;
	}
	
	public int getstudyLevel() {
		return this.studyLevel;
	}
	
	public void setSpecialization(String specialization) {
		this.Specialization=specialization;
	}
	
	public String getSepcialization() {
		return this.Specialization;
	}
	
	public void setGPA(double gpa) {
		this.GPA=gpa;
	}
	
	public double getGPA() {
		return this.GPA;
	}
	
	
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Child Constructor!");
	}
	
	public Student(String name, double age, String address, String nationality, 
			int stu_level, String specialization, double gpa) {
		super(name,age,address,nationality);
		studyLevel=stu_level;
		Specialization=specialization;
		GPA=gpa;
	}
	
	

}
