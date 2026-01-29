/*
 *	Author: Tara Pishehvar
 *  Date: 1/3/25
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String question;
		int amount;
		int x= 100;
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("----------------------------------------------");
		while (true){
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : "); 
				question = sc.nextLine();
				if ((question.equals("y")) || (question.equals("Y"))||(question.equals("yes")) || (question.equals("Yes"))){
					System.out.print("You have $"+x+". How much would you like to wager: "); 
					amount= sc.nextInt();
					while (amount>x || amount<0){
						if (amount>x){
						System.out.print("You only have $"+x+". Please enter a smaller number: ");
						amount= sc.nextInt();
						}
						if  (amount<0){
						System.out.print("Sneaky no negatives or 0! ");
						System.out.print("Please enter a bigger number: ");
						amount= sc.nextInt();
						}
					}
					sc.nextLine();
					int one = (int) (Math.random()*10+1);
					int two = (int) (Math.random()*10+1);
					int three = (int) (Math.random()*10+1);
					System.out.println("");
					System.out.println("Great! Let's play!!!");
					System.out.println("Your rolls are:");
					System.out.println("");
					System.out.println("___________________");
					System.out.println (one +" | "+two+" | "+three);
					System.out.println("___________________");
					System.out.println("");
					if ((one==two)||(two==three)||(one==three)){
						System.out.println("You won, your wager has been doubled!");
						x= x+amount;
						System.out.println("You now have $"+ x);
						System.out.println ("-------------------------------");
						System.out.println ("");
					}
					else if ((one==two)&&(two==three)){
						System.out.println("You won, your wager has been tripled!");
						x= x+(2*amount);
						System.out.println("You now have $"+ x);
						System.out.println ("-------------------------------");
						System.out.println ("");
					}
					else {
						System.out.println("Didn't win this time, better luck next time!");
						x= x-amount; 
						System.out.println ("You now have $"+x);
						System.out.println ("-------------------------------");
						System.out.println ("");
						if (x==0){
							System.out.print("");
							System.out.print("You've run out of money! Thanks for coming! Come back soon!");
							break;
						}
					}
				}
				else if ((question.equals("n")) || (question.equals("N"))||(question.equals("No")) || (question.equals("no")))  {
					System.out.println("Sad to see you go! You still have $" +x+" left. Come again soon! Thanks!");
					break;
					
				}
				else {
					System.out.println("That wasn't quite the correct answer. Try again.");
					System.out.println("--------------------------------------------------");
					System.out.println("");
				}
		}
	}
}
