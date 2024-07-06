package InheritanceDemo;

public class Student extends Person {
	
	String courseName;
	int fees;
	
	public void printStudent() {
		
		System.out.println(courseName);
		System.out.println(fees);
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
	}
	
	public Student(String nm, String ad, int ag, String cn, int fee) {
		
		super(nm, ag, ad);
		courseName=cn;
		fees=fee;
	}
		

	}


