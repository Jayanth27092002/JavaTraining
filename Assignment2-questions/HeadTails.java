package questions;
import java.util.*;


public class HeadTails {
	  
	  private String toss;
	
	 public HeadTails() {
		 double n=Math.random();
		 if(n>0.5) {
			 this.toss="head";
			 
		 }else {
			 this.toss="tail";
			 
		 }
	}
	 
	 public String getToss() {
		 return toss;
	 }
	 
	 
	 public static void main(String args[]){
	    System.out.println("Do you want to guess head or tails?");
	    HeadTails headtails=new HeadTails();
	    String toss=headtails.getToss();
	    
	    
	    System.out.println("The coin has been tossed");
	    System.out.println("What is your guess(head or tail): ");
	    Scanner sc=new Scanner(System.in);
	    String guess=sc.next();
	    System.out.print(toss);
	    System.out.print(guess);
		   
	    
	    if(guess.equals(toss)) {
	    	System.out.print("You won.Its " +guess);
	    }
	    else {
	    	System.out.print("You lost.Its" +toss);
	    }
	    
	    
	    
		 
	 }
	 
	 
	 
	 
	 
	 
	
	 

}
