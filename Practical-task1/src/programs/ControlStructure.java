package programs;
		import java.util.Scanner;
		public class ControlStructure {
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // 1. if-else
		        System.out.print("Enter a number (if-else example): ");
		        int num = sc.nextInt();

		        if (num > 0) {
		            System.out.println("The number is positive.");
		        } else if (num < 0) {
		            System.out.println("The number is negative.");
		        } else {
		            System.out.println("The number is zero.");
		        }

		        // 2. switch
		        System.out.print("\nEnter a day number (1 to 3): ");
		        int day = sc.nextInt();

		        switch (day) {
		            case 1:
		                System.out.println("It's Monday.");
		                break;
		            case 2:
		                System.out.println("It's Tuesday.");
		                break;
		            case 3:
		                System.out.println("It's Wednesday.");
		                break;
		            default:
		                System.out.println("Invalid day.");
		        }

		        // 3. for loop
		        System.out.println("\nFor loop: Print numbers 1 to 5");
		        for (int i = 1; i <= 5; i++) {
		            System.out.print(i + " ");
		        }

		        // 4. while loop
		        System.out.println("\n\nWhile loop: Countdown from 5");
		        int count = 5;
		        while (count > 0) {
		            System.out.println("Count: " + count);
		            count--;
		        }

		        // 5. do-while loop
		        System.out.println("\nDo-While loop: Print number once even if condition is false");
		        int x = 0;
		        do {
		            System.out.println("x = " + x);
		            x--;
		        } while (x > 0);

		        sc.close();
		    }
		}
