package questions;
import java.util.*;

public class CustomSimpleCalci {
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1=sc.nextInt();
		System.out.println("Enter second number:");
		int number2=sc.nextInt();
		
		SimpleCalc calci = new SimpleCalc(number1, number2);

        int choice;
        do {
            
            System.out.println("\nSelect the operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Largest");
            System.out.println("6. Smallest");
            System.out.println("7. Average");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result of Addition: " + calci.add());
                    break;
                case 2:
                    System.out.println("Result of Subtraction: " + calci.subtract());
                    break;
                case 3:
                    System.out.println("Result of Multiplication: " + calci.multiply());
                    break;
                case 4:
                    try {
                        System.out.println("Result of Division: " + calci.divide());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Largest number: " + calci.largest());
                    break;
                case 6:
                    System.out.println("Smallest number: " + calci.smallest());
                    break;
                case 7:
                    System.out.println("Average: " + calci.average());
                    break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }
            if (choice != 8) {
                System.out.print("\nPress Enter to continue...");
                sc.nextLine();  
                sc.nextLine(); 
            }

        } while (choice != 8);
        
            
         

       
        sc.close();
}
		
		
		
		
		
	

}
