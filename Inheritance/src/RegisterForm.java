
enum Gender {male, female};
enum Course {Database, Programming, Math, ERP};
enum Semester {Summer, Winter, Fall, Spring};
public class RegisterForm {
	
	String stdName;
	Gender stdGender;
	Course stdCourse;
	Semester stdSemster;
	

	public RegisterForm() {
		// TODO Auto-generated constructor stub
		stdName="No Name";
		stdGender=Gender.male;
		stdCourse=Course.Math;
		stdSemster=Semester.Spring;
	}
	
	

}
