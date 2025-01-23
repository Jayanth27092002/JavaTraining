package questions;
import java.util.*;

public class StrangeCalc {
	
	private ArrayList<Double> numbers;
	
	public StrangeCalc(ArrayList<Double> mynumbers) {
		numbers=new ArrayList<>(mynumbers);
		
	}
	
	
	public double add(){
		int answer=0;
		for(double value:numbers){
			answer+=value;
			
			}
		return answer;
		
	}
	
	public double subtract(){
		double answer=numbers.get(0);
		for(int i=1;i<numbers.size();i++) {
			answer=answer-numbers.get(i);
		}
		
		return answer;
		
		
		
	}
	
	public double multiply(){
		double answer=1;
		for(double value:numbers){
			answer=answer*value;
			
			}
		return answer;
		
	}
	
	public double divide(){
		double answer=numbers.get(0);
		for(int i=1;i<numbers.size();i++) {
			answer=answer/numbers.get(i);
		}
		
		return answer;
		
		
		
	}
	
	public double largest(){
		double large=-1;
		for(double value:numbers) {
			if(value>large)large=value;
		}
		return large;
		
	}
	
	public double smallest(){
		double small=numbers.get(0);
		for(double value:numbers) {
			if(value<small)small=value;
		}
		return small;
		
	}
	
	
	public double average(){
		double sum=0;
		for(double value:numbers) {
			sum+=value;
		}
		
		return sum/numbers.size();
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]){
		ArrayList<Double> dynamicarray=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		boolean choice=true;
		while(choice) {
			System.out.print("give number to perform operation:");
			double number=sc.nextDouble();
			dynamicarray.add(number);
			System.out.print("Do you want to give another number [type (true/false)]:");
			choice=sc.nextBoolean();
		}
		
		StrangeCalc stracalc=new StrangeCalc(dynamicarray);
		
		System.out.println("--------------------------------");
		System.out.println("Sum of numbers: "+stracalc.add());
		System.out.println("Difference of numbers: "+stracalc.subtract());
		System.out.println("Product of numbers: "+stracalc.multiply());
		System.out.println("Division of numbers: "+stracalc.divide());
		System.out.println("Greater of numbers: "+stracalc.largest());
		System.out.println("Smaller of numbers: "+ stracalc.smallest());
		System.out.println("Avg of numbers: " +stracalc.average());
		
		
		
		
		
		
		
		
	}

}
