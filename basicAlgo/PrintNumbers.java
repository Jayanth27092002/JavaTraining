package basicAlgo;

import java.util.Scanner;

public class PrintNumbers {
	
	public static void printnumbers(int n) {
		for(int i=0;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
	
	
   public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Print upto numbers n=");
		int n=sc.nextInt();
		
		System.out.println("printing Numbers upto"+n+":");
		printnumbers(n);
		}
	
	
	
	

}
