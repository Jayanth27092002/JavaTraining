package basicAlgo;

import java.util.Scanner;

public class isPalindrome {
	public static boolean isPalindrome(int n){
		int sum=0;
		
		int temp=n;
		while(temp>0) {
			int r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
			
		}
		
		
		
		if(n==sum)return true;
		
		return false;
		
		
		
}
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("is palindrome n= ");
		int n=sc.nextInt();
		
		System.out.println("n is palindrome: "+isPalindrome(n));
		}

}
