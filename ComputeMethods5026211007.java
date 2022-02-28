import java.lang.*;
import java.util.*;

class ComputeMethods5026211007{

	public double fToC(double degreesF){

	float degreeC = (float)5 / 9;
	double celcius = degreeC * (degreesF - 32);
	System.out.println("Temp in celcius is " + celcius);
	return degreeC;
	}


	public double hypotenuse(int a, int b){

	double c = Math.sqrt((a*a) + (b*b));
	System.out.println("Hypotenuse is " + c);
	return c;
	}


	public int roll(){
	Random randomInt = new Random();
	int dice1 = randomInt.nextInt(5) + 1;
	int dice2 = randomInt.nextInt(5) + 1;
	int sumdice = dice1 + dice2;
	System.out.println("The sum of values is " + sumdice);
	return sumdice;
	}
}