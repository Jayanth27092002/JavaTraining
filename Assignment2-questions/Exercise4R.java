package questions;
import java.util.*;

public class Exercise4R {
	private static int matrix[][]= {
			{1,7,3,9,5,3},
			{6,2,3},
			{7,5,1,4,0},
			{1,0,2,9,6,3,7,8,4},
	};
	
	public static String findFirst(int digit){
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==digit) {
					return "Digit " +digit +" found at row "+i+" and at column "+ j;
				}
			}
		}
		
		return "Digit not found in the matrix";
		
		
	}
	
	public static void main(String args[]) {
		
		if(args.length>0 && args.length<2){
			
		try {
			
			String digit=args[0];
			int digi=Integer.parseInt(digit);
			
			String answer=findFirst(digi);
			System.out.print(answer);
			
		}
		catch(NumberFormatException e){
			System.out.print("Enter only digit.Not other formats");
			
		}
		
		catch (Exception e) {
            
            System.out.println("An error occurred: " + e.getMessage());
        }
		
		
		
		}
		else {
			System.out.print("Incorrect arguments given or not given any arguments");
			
		}
	}

}
