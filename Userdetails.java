import java.util.Scanner;

class Userdetails {
	public static void main(String[]args){
		 Scanner scanner = new Scanner(System.in);

        // Prompt user for their surname
        System.out.print("Enter your sirname: ");
        String sirname = scanner.nextLine();

        // Prompt user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print number of characters in the surname
        int sirnameLength = sirname.length();

        // Determine if age is odd or even
        String ageType = (age % 2 == 0) ? "even" : "odd";
        
        System.out.println("***********************");
        System.out.println("Sirname:" + sirname);
        System.out.println("Number of characters in surname: " + sirnameLength);
        System.out.println("***********************");
        System.out.println("Age:"+ age);
        System.out.println("Your age is " + ageType);
        System.out.println("***********************");

         // Close the scanner
        scanner.close();
	}
}