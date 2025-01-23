package questions;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomStrangeCalc {
	public static void main(String args[]){
        ArrayList<Double> dynamicarray=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		boolean choice=true;
		while(choice) {
			System.out.print("give number to perform operation:");
			Double number=sc.nextDouble();
			dynamicarray.add(number);
			System.out.print("Do you want to give another number [type (true/false)]:");
			choice=sc.nextBoolean();
		}
		
		StrangeCalc stracalc=new StrangeCalc(dynamicarray);
		int choice1;
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
            choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Result of Addition: " + stracalc.add());
                    break;
                case 2:
                    System.out.println("Result of Subtraction: " + stracalc.subtract());
                    break;
                case 3:
                    System.out.println("Result of Multiplication: " + stracalc.multiply());
                    break;
                case 4:
                    try {
                        System.out.println("Result of Division: " + stracalc.divide());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Largest number: " +stracalc.largest());
                    break;
                case 6:
                    System.out.println("Smallest number: " + stracalc.smallest());
                    break;
                case 7:
                    System.out.println("Average: " + stracalc.average());
                    break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }
            if (choice1 != 8) {
                System.out.print("\nPress Enter to continue...");
                sc.nextLine();  
                sc.nextLine(); 
            }

        } while (choice1 != 8);
        

        sc.close();
        
            
         


		
		
		
	}

}
