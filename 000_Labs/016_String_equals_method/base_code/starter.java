/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose either warrior, rogue, or wizard ");
		String x = sc.nextLine();
			if ((x.equals("warrior"))||(x.equals("Warrior"))){
			System.out.print("You selected warrior");
		}
		if ((x.equals("wizard"))||(x.equals("Wizard"))){
			System.out.print("You selected wizard");
		}
		if ((x.equals("rogue"))||(x.equals("Rogue"))){
			System.out.print("You selected rogue");
		}
		else{
			System.out.print("You did not select a role");
			
		}

	}
}
