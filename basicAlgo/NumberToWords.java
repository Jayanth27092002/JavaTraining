package basicAlgo;

import java.util.Scanner;

public class NumberToWords {
	//converting number to words--simple
	
	public static String numToWords(int n){
		int temp=n;
		String answer="";
		String[] arr= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		while(temp>0) {
		  answer=arr[temp%10]+" "+answer;
		  temp=temp/10;
		}
		
		return answer;
}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("convert number n=");
		int n=sc.nextInt();
		
		System.out.println("n in words: " +numToWords(n));
		}


}
