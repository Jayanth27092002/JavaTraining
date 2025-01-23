package questions;
import java.util.*;

public class SimpleCalc {
	int num1;
	int num2;
	
	public SimpleCalc(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public int add(){
		return num1+num2;
	}
	public int subtract() {
		return num2-num1;
	}
	
	public int multiply() {
		return num1*num2;
	}
	
	public int divide() {
		if(num2!=0) {
			return num1/num2;
		}
		else {
			throw new ArithmeticException("0 in denominator undefined");
		}
	}
	
	public int largest() {
		if(num2>num1)return num2;
		return num1;
	}
	
	public int smallest() {
		if(num2>num1)return num1;
		return num2;
	}
	
	public int average() {
		return (num1+num2)/2;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2=sc.nextInt();
		
		SimpleCalc calci=new SimpleCalc(num1,num2);
		System.out.println("--------------------------------");
		System.out.println("Sum of numbers: "+calci.add());
		System.out.println("Difference of numbers: "+calci.subtract());
		System.out.println("Product of numbers: "+calci.multiply());
		System.out.println("Division of numbers: "+calci.divide());
		System.out.println("Greater of numbers: "+calci.largest());
		System.out.println("Smaller of numbers: "+ calci.smallest());
		System.out.println("Avg of numbers: " +calci.average());
		
		
		
		
		
	}
	
}

