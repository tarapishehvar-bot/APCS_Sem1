/*
 *	Author: Tara Pishehvar
 *  Date: 9/29/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an animal (either a dog, cat, or bird): "); 
		String animal = sc.nextLine();
		System.out.print("Input an object (either a plant, umbrella, or couch): "); 
		String object = sc.nextLine();
		System.out.print("Input an face (either smiley, sad, or mad): "); 
		String face = sc.nextLine();
		if ((animal.equals("Bird"))|| (animal.equals("bird"))){
			System.out.println ("That's right");
			System.out.println (" <(o)");
			System.out.println("/(__)\\");
		}
		else {
			System.out.println("That's incorrect");
		}
		if ((object.equals("umbrella"))|| (object.equals("Umbrella"))){
			System.out.println ("That's right");

			System.out.println("/_\\");
			System.out.println(" |");
		}
		else {
			System.out.println("That's incorrect");
		}
		if ((face.equals("smiley"))|| (face.equals("Smiley"))){
			System.out.println ("That's right");
			System.out.println ("  0  0");
			System.out.println("\\_____/");
		}
		else {
			System.out.println("That's incorrect");
		}
	}
}
