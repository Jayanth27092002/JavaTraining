package basicAlgo;

import java.util.Scanner;

public class isArmstrong {
		public static boolean armstrongNumber(int n) {
			int number=n;
			
			int answer=0;
			while(n>=10) {
				int quotient=n/10;
				int remainder=n%10;
				
				answer+=remainder*remainder*remainder;
				n=quotient;
				}
			
			answer+=n*n*n;
			
			if(answer==number){
				return true;
			}
			return false;
			}
		
		
		public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.print("Checking whether a number is Armstrong=");
				int n=sc.nextInt();
				
				System.out.println(n+" is an armstrong number: "+armstrongNumber(n));
				}
		
		
		
		
		

}
