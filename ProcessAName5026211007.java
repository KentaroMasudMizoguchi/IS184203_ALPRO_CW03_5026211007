import java.lang.*;
import java.util.*;

class ProcessAName5026211007{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	int index = input.indexOf(' ');
	String string1 = input.substring(index + 1);
	String string2 = input.substring(0, 1);
	System.out.println("Your name is: " + string1 + ", " + string2 + ".");
	}
}