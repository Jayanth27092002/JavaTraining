package basicAlgo;

import java.util.Scanner;

public class Pyramids {
	
	public static void printPyramid(int n){
		int num=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
			space--;
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(i);
				num++;
			}
			System.out.println("");
			
		}
		
}
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Pyramid of number n: ");
		int n=sc.nextInt();
		
		System.out.println("Pyramid of n height: ");
		printPyramid(n);
		}

}
