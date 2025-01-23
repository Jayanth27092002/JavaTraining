package basicAlgo;

import java.util.Scanner;

public class SumofNumbers {
	public static int sumNumbers(int n) {
		 int answer=(n*(n+1))/2;
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Sum of n numbers n= ");
		int n=sc.nextInt();
		
		System.out.println("Sum of numbers: "+sumNumbers(n));
		}


}
