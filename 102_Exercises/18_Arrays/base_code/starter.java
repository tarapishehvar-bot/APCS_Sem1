/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] x= new int [1001];
		 int [] y= new int [1001];
		 int index = 0;
		 int number =3;
		 while (index<1001){
		 	x[index]=number;
		 	number=number+3;
		 	index++;
		 }
		 index= 0;
		 while (index<1001){
		 	System.out.print(x[index]+", ");
		 	index++;
		 }
		 System.out.println("");
		 System.out.println("--------------------------------------------------------------------------");
		 System.out.println("");
		 index=0;
		 number=1000;
		  while (index<1001){
		 	y[index]=number;
		 	number--;
		 	index++;
		 }
		 index= 0;
		 while (index<1001){
		 	System.out.print(y[index]+", ");
		 	index++;
		 }
	}
}
