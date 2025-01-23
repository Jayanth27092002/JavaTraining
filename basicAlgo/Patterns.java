package basicAlgo;
import java.util.*;

public class Patterns{
	public static void Patternsprint(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n+1-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		
		
		
		}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Pattern of length n=");
		int n=sc.nextInt();
		
		System.out.println("the pattern prinitng");
		Patternsprint(n);
		
	}
	
	
	
	
	
	
	

}
