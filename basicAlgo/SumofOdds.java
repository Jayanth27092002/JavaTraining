package basicAlgo;

import java.util.Scanner;

public class SumofOdds {
////////odd numbers sum upto n
	public static int sumOfOdds(int n){
    int sum=0;
	
	for(int i=1;i<=n;i++) {
		if(i%2!=0)sum+=i;}
	
	return sum;
	}
	
 public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Sum number of odd numbers upto n =");
		int n=sc.nextInt();
		
		System.out.println("Sum of odd numbers upto "+n+":"+sumOfOdds(n));
		}




}
