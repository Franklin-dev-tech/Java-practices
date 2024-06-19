public class Multiples{
    public static void main(String[] args) {
        //variable declaration
        // Define the range of numbers to check
        int start = 71;
        int end = 150;

        // Print the header message
        System.out.println("Multiples of 2, 3, and 7 between " + start + " and " + end + ":");

        //for Loop to iterate through each number in the specified range
         // Print multiples of 2
        System.out.println("Multiples of 2:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Print multiples of 3
        System.out.println("Multiples of 3:");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // Print multiples of 7
        System.out.println("Multiples of 7:");
        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}