package StringPrograms;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String str= "Anushka";
		String reverseStr= " ";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr= reverseStr + str.charAt(i);
		}
		
		System.out.println("Reverse of String is: "+reverseStr);

	}

}
