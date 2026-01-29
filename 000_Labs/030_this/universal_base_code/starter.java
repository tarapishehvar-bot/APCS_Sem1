/*
 *	Author:  Tara Pishehvar
 *  Date:  10/28/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int randomAge= (int)(Math.random()*99+1);
		PooleDwarf one = new PooleDwarf(randName(),randomAge);
		String name1= one.getName();
		PooleDwarf two= new PooleDwarf(randName(),randomAge);
		PooleDwarf three = new PooleDwarf(randName(),randomAge);
		PooleDwarf four = new PooleDwarf(randName(),randomAge);
		PooleDwarf five = new PooleDwarf(randName(),randomAge);
		PooleDwarf six = new PooleDwarf(randName(),randomAge);
		PooleDwarf seven = new PooleDwarf(randName(),randomAge);
		
		int x=0;
		if (one.isSameName(two.getName())){
			x++;
		}
		if (one.isSameName(three.getName())){
			x++;
		}
		if (one.isSameName(four.getName())){
			x++;
		}
		if (one.isSameName(five.getName())){
			x++;
		}
		if (one.isSameName(six.getName())){
			x++;
		}
		if (one.isSameName(seven.getName())){
			x++;
		}
		System.out.println(name1+" was the name with "+x+" matches!");
	}
}
