/*
	Author: Tara Pishehvar
	Date: 10/27/25
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman one = new Spiderman();
		Spiderman two = new Spiderman("Tobey Maguire",48, "Green Goblin");
		Spiderman three = new Spiderman("Andrew Garfield",40, "Electro");
		Spiderman four = new Spiderman("Tom Holland", 27, "The Vulture");
		one.setAge(700);
		one.setActor("Sophia Li");
		one.setVillain("The evil guy");
		three.print();
		
	}
		

		
	
}
