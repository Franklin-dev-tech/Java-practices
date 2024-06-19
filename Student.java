import java.util.Scanner;//import the scanner class for reding user input

class Student{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);

		//prompt user for their marks
		System.out.print("Enter your java programing marks:");
		int javaprogramingmarks = scanner.nextInt();

		System.out.print("Enter your application programing marks:");
		int applicationprogramingmarks = scanner.nextInt();

		System.out.print("Enter your network desighn marks");
		int networkdesighnmarks= scanner.nextInt();

		System.out.print("Enter your  structured cabling marks");
		int  structuredcablingmarks = scanner.nextInt();

		System.out.print("Enter your control system marks");
		int controlsystemmarks = scanner.nextInt();


		//method to do average of the marks
		double average = ( javaprogramingmarks + applicationprogramingmarks +  networkdesighnmarks + structuredcablingmarks + controlsystemmarks) / 5;

		System.out.printf("The average marks is: %.2f%n", average);

		// Close the scanner
		scanner.close();


	}
}