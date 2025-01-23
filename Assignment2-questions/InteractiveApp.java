package questions;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InteractiveApp {
	
	public static String moderatorClass(String word1,String word2 ){
		StringBuffer answer=new StringBuffer();
		Pattern pattern=Pattern.compile("\\b"+word2+"\\b");
		Matcher matcher=pattern.matcher(word1);
		
		while(matcher.find()) {
			String censored= new String(new char[word2.length()]).replace("\0","*");
			matcher.appendReplacement(answer, censored);
		}
		matcher.appendTail(answer);
		return answer.toString();
		
		
	}

	
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		String string="";
		System.out.print("Type something and press enter"+" otherwise " +"type \"end\" to end the program : ");
		while(!(string=scanner.next()).equals("end")) {
			
			string=moderatorClass(string,"jayanth");
			System.out.println("You typed:" + string.toUpperCase()+"!");
			
		}
		System.out.print("Program ended");
		
		
	}
}
