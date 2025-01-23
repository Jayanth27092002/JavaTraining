package basicAlgo;
import java.util.Scanner;

import basicAlgo.*;

public class PrintPalindrome {
	
	public static void printPalindrome(int n){
		for(int i=0;i<=n;i++) {
			
			if(isPalindrome.isPalindrome(i))System.out.print(i+" ");
			
		}
		
}
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("palindrome numbers upto n= ");
		int n=sc.nextInt();
		
		System.out.println("palindrome numbers upto n: ");
		printPalindrome(n);
		}

}
