/*
 *	Author: Tara Pishehvar
 *  Date: 11/20/25
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();
        
        if(diff == 1){
            int numTimes= 1;
            while (true){
                String [] arr = new String [numTimes];
                System.out.println("--------------------------------------");
                for (int i = 0; i<numTimes; i++){
                    arr [i]  = getColorWord();
                    Colors.println(arr[i]);
                }
                System.out.println("--------------------------------------");
                System.out.println("Memorize the phrase above!");
                System.out.print("You have : ");
                delay(5);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Please enter the words that you saw on separate lines!");
                int right =0;
                for (int i = 0; i<numTimes; i++){
                    String word = sc.nextLine();
                    if (word.equals(arr[i])){
                        right++;
                    }
                }
                if (right==numTimes){
                    System.out.println("You got it! Onto the next level!");
                    numTimes++;
                }
                else {
                    System.out.print("You got it wrong! Try again!\nWORDS ");
                    printArray(arr);
                    break;
                }
    
            }
        }
        
        else if(diff == 2){
             int numTimes= 1;
            while (true){
                String [] arr = new String [numTimes];
                String [] arr2 = new String [numTimes];
                String [] arr2Color = new String [numTimes];
                System.out.println("--------------------------------------");
                for (int i = 0; i<numTimes; i++){
                    arr [i]  = getColorWord();
                    arr2Color[i]= getColorWord();
                    arr2 [i]= "BRIGHT_"+arr2Color[i];
                    Colors.println(arr[i],arr2[i]);
                }
                System.out.println("--------------------------------------");
                System.out.println("Memorize the phrase above!");
                System.out.print("You have : ");
                delay(5);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                int rand = (int)(Math.random()*2+1);
                int right= 0;
                if (rand ==1){
                    System.out.println("Please enter the WORDS that you saw on separate lines!");
                    for (int i = 0; i<numTimes; i++){
                        String word = sc.nextLine();
                        if (word.equals(arr[i])){
                            right++;
                        }
                    }
                }
                else{
                    System.out.println("Please enter the TEXT COLOR that you saw on separate lines!");
                    for (int i = 0; i<numTimes; i++){
                        String word = sc.nextLine();
                        if (word.equals(arr2Color[i])){
                            right++;
                        }
                    }
                }
                if (right==numTimes){
                    System.out.println("You got it! Onto the next level!");
                    numTimes++;
                }
                else {
                    System.out.print("You got it wrong! Try again!\nWORDS ");
                    printArray(arr);
                    System.out.print("TEXT COLORS ");
                    printArray(arr2Color);
                    break;
                }
    
            }
        }
        else if(diff == 3){
           int numTimes= 1;
            while (true){
                String [] arr = new String [numTimes];
                String [] arr2 = new String [numTimes];
                String [] arr2Color = new String [numTimes];
                String [] arr3 = new String [numTimes];
                String [] arr3Color = new String [numTimes];
                System.out.println("--------------------------------------");
                for (int i = 0; i<numTimes; i++){
                    arr [i]  = getColorWord();
                    arr2Color[i]= getColorWord();
                    arr2 [i]= "BRIGHT_"+arr2Color[i];
                    arr3Color[i]= getColorWord();
                    arr3 [i]= "BG_"+arr3Color[i];
                    Colors.println(arr[i],arr2[i],arr3[i]);
                }
                System.out.println("--------------------------------------");
                System.out.println("Memorize the phrase above!");
                System.out.print("You have : ");
                delay(5);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                int rand = (int)(Math.random()*3+1);
                int right= 0;
                if (rand ==1){
                    System.out.println("Please enter the WORDS that you saw on separate lines!");
                    for (int i = 0; i<numTimes; i++){
                        String word = sc.nextLine();
                        if (word.equals(arr[i])){
                            right++;
                        }
                    }
                }
                else if (rand ==2){
                    System.out.println("Please enter the TEXT COLOR that you saw on separate lines!");
                    for (int i = 0; i<numTimes; i++){
                        String word = sc.nextLine();
                        if (word.equals(arr2Color[i])){
                            right++;
                        }
                    }
                }
                else{
                    System.out.println("Please enter the BACKGROUND COLOR that you saw on separate lines!");
                    for (int i = 0; i<numTimes; i++){
                        String word = sc.nextLine();
                        if (word.equals(arr3Color[i])){
                            right++;
                        }
                    }
                }
                if (right==numTimes){
                    System.out.println("You got it! Onto the next level!");
                    numTimes++;
                }
                else {
                    System.out.print("You got it wrong! Try again!\nWORDS ");
                    printArray(arr);
                    System.out.print("TEXT COLORS ");
                    printArray(arr2Color);
                    System.out.print("BACKGROUND COLORS ");
                    printArray(arr3Color);
                    break;
                }
    
            }
        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }
    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
