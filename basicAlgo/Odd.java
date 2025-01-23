package basicAlgo;
import java.util.*;



public class Odd {
	public static int oddNumbers(int n) {
		 int answer=0;
			
			for(int i=1;i<=n;i++) {
				if(i%2!=0)answer+=1;}
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Count number of odd numbers before n:");
		int n=sc.nextInt();
		
		System.out.println("Number of odd numbers upto "+n+":"+oddNumbers(n));
		}

}
