package InheritanceDemo;

public class Professor extends Person {
	
	int salary;
	int experience;
	
	public void printProfessor() {
		
		System.out.println(salary);
		System.out.println(experience);
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
	}
		
		public Professor(String n, int a, String add, int sal, int exp) {
			
			super(n, a, add);
			salary=sal;
			experience=exp;
			
		}

}
