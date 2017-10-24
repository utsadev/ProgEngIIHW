// This is my first exercise to compare print/println/prinf
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I like Java
		// This is a practice
		// pi=3.14
		/*System.out.println("I like Java");
		System.out.println("This is a practice");
		System.out.println("pi="+3.14);*/
		
//		System.out.print("I like Java\n");
//		System.out.print("This is a practice\n");
//		System.out.print("pi="+3.14+"\n");
//		System.out.printf("I like Java%n");
//		System.out.printf("This is a practice%n");
//		System.out.printf("pi=%.1f",3.14);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name=input.nextLine(); //type name press enter
		System.out.println("Welcome "+name+" to Java world");

		input.close();
		
	}

}
