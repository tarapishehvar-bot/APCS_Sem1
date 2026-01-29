/*
 *	Author:  Tara Pishehvar
 *  Date: 9/17/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.print("What is your title? ");
		String title = sc.nextLine();
		System.out.print("Choose either warrior, rogue, or wizard ");
		String role = sc.nextLine();
		boolean warrior =((role.equals("warrior"))||(role.equals("Warrior")));
		boolean wizard = ((role.equals("wizard"))||(role.equals("Wizard")));
		boolean rogue = ((role.equals("rogue"))||(role.equals("Rogue")));
		if (warrior){
			System.out.println("You selected warrior");
		}
		else if (wizard){
			System.out.println("You selected wizard");
		}
		else if (rogue){
			System.out.println("You selected rogue");
		}
		else {
			System.out.println("You did not select a role, choose again ");
			 role = sc.nextLine();
		}
		System.out.println("");
		System.out.println ("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.print("Strength (1-10) ");
		int strength = sc.nextInt();
		int x =20;
		int t= x-strength;
		if ((strength>=1) && (strength <=10) && (strength<=x)){
			System.out.println ("You have "+t+" skill points left");
			System.out.println("");
		}
		else {
			System.out.print ("Input a smaller number: ");
			strength = sc.nextInt();
			if ((strength>=1) && (strength <=10) && (strength<=x)){
				t= x-strength;
				System.out.println ("You have "+t+" skill points left");
				System.out.println("");
			}
		}
		System.out.print("Dexterity (1-10) ");
		int dexterity = sc.nextInt();
		int y =t-dexterity;
		if ((dexterity>=1) && (dexterity <=10) && (dexterity<=t)){
			System.out.println ("You have "+y+" skill points left");
			System.out.println("");
		}
		else {
			System.out.print ("Input a smaller number: ");
			dexterity = sc.nextInt();
			y =t-dexterity;
			if ((dexterity>=1) && (dexterity <=10) && (dexterity<=t)){
				System.out.println ("You have "+y+" skill points left");
				System.out.println("");
		}
		}
		System.out.print("Intelligence (1-10) ");
		int intel = sc.nextInt();
		int z= y-intel;
		if ((intel>=1) && (intel <=10) && (intel<=y)){
			System.out.println ("You have "+z+" skill points left");
			System.out.println("");
		}
		else {
			System.out.print ("Input a smaller number: ");
			intel = sc.nextInt();
			z =y-intel;
			if ((intel>=1) && (intel <=10) && (intel<=y)){
				System.out.println ("You have "+z+" skill points left");
				System.out.println("");
			}
		}
		System.out.print("Charisma (1-10) ");
		int cha = sc.nextInt();
		int w = z-cha;
		if ((cha>=1) && (cha <=10) && (cha<=z)){
			System.out.println ("You did not use "+w+" skill points");
			System.out.println("");
		}
		else {
			System.out.print ("Input a smaller number: ");
			cha = sc.nextInt();
			w =z-cha;
			if ((cha>=1) && (cha<=10) && (cha<=z)){
				System.out.println ("You did not use "+w+" skill points");
				System.out.println("");
			}
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("You are "+name+" the "+title+" of CVHS.");
		System.out.println("You are a "+role+" with the following stats!");
		System.out.println("Strength: "+strength);
		System.out.println("Dexterity: "+dexterity);
		System.out.println("Intelligence: "+intel);
		System.out.println("Charisma: "+cha);
		System.out.println("");
		System.out.println("Good luck on your quest "+name+" !");
	}
}
