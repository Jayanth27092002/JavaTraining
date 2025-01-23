package basicAlgo;
import basicAlgo.*;

import java.util.Scanner;

public class SumofArmstrong {
	
	public static int sumArmstrongNumber(int n) {
		
		
		int answer=0;
		for(int i=0;i<n;i++) {
			if(isArmstrong.armstrongNumber(i))answer+=i;
		}
		return answer;
	}
	
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Sum number of armstrong upto n =");
			int n=sc.nextInt();
			
			System.out.println("Sum of armstrong numbers upto "+n+":"+ sumArmstrongNumber(n));
	}

}
