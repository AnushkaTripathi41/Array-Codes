package InheritanceDemo;

public class Person {
		
		String name;
		int age;
		String address;
		
		public void printPerson() {
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
			
		}
		
		public Person(String n, int a, String add) {
			
			name=n;
			age=a;
			address=add;
		}
		

	}


