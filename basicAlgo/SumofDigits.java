package basicAlgo;

import java.util.Scanner;

public class SumofDigits {
	
	//sum of digits
		public static int sumOfDigits(int num) {
			int answer=0;
			while(num>0) {
				int quotient=n/10;
				int remainder=n%10;
				
				answer+=remainder;
				num=quotient;
				}
			
			
			return answer;
		}
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Sum of digits of n= ");
			int num=sc.nextInt();
			
			System.out.println("Sum of digits=: "+sumOfDigits(num));
			}
		

	
}
