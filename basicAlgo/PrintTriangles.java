package basicAlgo;

import java.util.Scanner;

public class PrintTriangles {
public static void triangles(int n){
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++){
				System.out.print(i+1+" ");
				
			}
			System.out.println();
		}
		
		
}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("number of rows in triangles n= ");
	int n=sc.nextInt();
	
	System.out.println("print Triangles:");
	triangles(n);
	
	}


}
