package basicAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class SumofPrime {
	///finding sum and average of prime numbers
		public static int[] primeNumbers(int n){
			int sum=0;
			int count=0;
			boolean[] isprime=new boolean[n+1];
			Arrays.fill(isprime,true);
			isprime[0]=isprime[1]=false;
			
			for(int i=2;i<=n;i++) {
				if(isprime[i]) {
					for(int j=2*i;j<=n;j+=i) {
						isprime[j]=false;
					}
				}
			}
			for(int i=0;i<=n;i++) {
				if(isprime[i]) {
					System.out.print(i+" ");
					sum+=i;
					count+=1;
				}
			}
			
			int avg=sum/count;
			int[] result= {sum,avg};
			return result;
			
		}
		
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Printing prime numbers and finding sum upto n= ");
			int n=sc.nextInt();
			int[] result=primeNumbers(n);
			
			System.out.println("Sum is: "+ result[0] +"Avg of prime: " + result[1] );
			}

}
