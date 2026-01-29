/*
 *	Author: Tara Pishehvar
 *  Date: 9/9/25
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter a number:");
		int x= sc.nextInt();
		System.out.println("Here are the next 5 numbers!");
		System.out.print (x+1+", ");
		System.out.print (x+2+", ");
		System.out.print (x+3 +", ");
		System.out.print (x+4+", ");
		System.out.println (x+5);
		System.out.println("Here are the next 5 mulitples of "+x+"!");
		System.out.print (x*1+", ");
		System.out.print (x*2+", ");
		System.out.print (x*3 +", ");
		System.out.print (x*4+", ");
		System.out.println (x*5);
		System.out.println(x+" divided by 100 is:");
		System.out.println (x/100.0);
		System.out.println(x+" divided by 10 is:");
		System.out.print (x/10.0);

	}
}
