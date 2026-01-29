/*
 *	Author: Tara Pishehvar
 *  Date: 10/30/25
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Dog name?");
		String name= sc.nextLine();
		Dog one = new Dog(name);
		System.out.println("What age should "+name+" be?");
		int age = sc.nextInt();
		one.setAge(age);
		one.printInfo();
		String dog1Name= one.getName();
		
		Dog two = new Dog("Toto","Cairn Terrier");
		two.printInfo();
		String dog2Name= two.getName();
		boolean oneSleep = one.isSleeping();
		boolean twoSleep = two.isSleeping();
		if (oneSleep){
			System.out.println(dog1Name+" is asleep");
		}
		else{
			System.out.println(dog1Name+" is awake");
			one.bark();
		}
		if ((twoSleep)&&(!oneSleep)){
			System.out.println(dog2Name+" wakes up from hearing "+dog1Name+" bark");
			two.bark();
		}
		else if ((!twoSleep)&&(!oneSleep)){
			System.out.println(dog2Name+" hears "+dog1Name);
			two.bark();
		}
		else{
			if (twoSleep){
			System.out.println(dog2Name+" is asleep");
			}
			else {
			System.out.println(dog2Name+" is awake");
			}
		}


	}
}
