/*
 *	Author: Tara Pishehvar
 *  Date: 9/10/25
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Give me a number ");
		int one = sc.nextInt();
		System.out.print ("Give me another number ");
		int two = sc.nextInt();
		if (one%2 ==0){
			System.out.println(one+" is even");
		}
		else if (one%2 !=0){
			System.out.println(one+" is odd");
		}
		if (two%2 ==0){
			System.out.println(two+" is even");
			}
		else if (two%2 !=0){
			System.out.println(two+" is odd");
		}
		if (one%3==0){
			System.out.println(one+" is divisible by 3");
		}
		if (one%4==0){
			System.out.println(one+" is divisible by 4");
		}
		if (one%5==0){
			System.out.println(one+" is divisible by 5");
		}
		if ((one%3!=0)&&(one%4!=0)&&(one%5!=0)){
			System.out.println(one+" is not divisible by all 3. 4. or 5");
			}
		if (two%3==0){
			System.out.println(two+" is divisible by 3");
		}
		if (two%4==0){
			System.out.println(two+" is divisible by 4");
		}
		if (two%5==0){
			System.out.println(two+" is divisible by 5");
		}
		if ((two%3!=0)&&(two%4!=0)&&(two%5!=0)){
			System.out.println(two+" is not divisible by all 3. 4. or 5");
			}
				
		}
	}

