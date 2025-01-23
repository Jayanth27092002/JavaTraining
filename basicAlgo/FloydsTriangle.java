package basicAlgo;

import java.util.Scanner;

public class FloydsTriangle {
	
public static void floydsTriangle(int n) {
		
		int num=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				num++;
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		
	}

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Floyd traingle upto n= ");
	int n=sc.nextInt();
	
	System.out.println("FLoyd traingle: ");
	floydsTriangle(n);
	}

}
