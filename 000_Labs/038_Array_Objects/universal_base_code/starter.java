/*
 *	Author:  Tara Pishehvar
 *  Date: 11/20/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] x = new Wizard [100];
		Warrior [] y = new Warrior [100];
		for (int i=0; i<x.length; i++){
			x[i]= new Wizard();
			y[i]= new Warrior();
		}
		int z = 0; 
		int t =0;
		int numWarrior=100;
		int numWizard=100;
		while ((numWarrior>0)&&(numWizard>0)){
			x[t].attack(y[z]);
			if (y[z].isDead()){
				z++;
				numWarrior--;
			}
			if (z==100){
				break;
			}
			
			y[z].attack(x[t]);
			if (x[t].isDead()){
				numWizard--;
				t++;
			}
		}
		if (numWarrior>numWizard){
			System.out.println("Warriors won with "+numWarrior+" left in their army");
		}
		else if (numWizard>numWarrior){
			System.out.println("Wizards won with "+numWizard+" left in their army");
		}
		

	}
}
