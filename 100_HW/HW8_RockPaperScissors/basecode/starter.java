/*
 *	Author: Tara Pishehvar
 *  Date: 10/ 17/25
 *	Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Would you like to play the computer? (yes/no/done)");
            String ans = sc.nextLine();
            System.out.println("");
            System.out.println("-------------------------------");
            String choice = "";
            String randomResult = "";
            int compareResult = 0; 
            if (ans.equals("done")|| ans.equals("Done")){
                System.out.println("Thank you for playing!");
                break;
            }
            else if (ans.equals("yes")|| ans.equals("Yes")){
                while (true){
                    System.out.println("Please enter rock/paper/scissors");
                    choice = sc.nextLine();
                    if (choice.equals("rock")||choice.equals("paper")||choice.equals("scissors")){
                        break;
                    }
                }
                randomResult = getObject("rock","paper","scissors");
                compareResult = compare2(choice,randomResult);
                if (compareResult == 1){
                    System.out.println("You won!");
                    System.out.println("");
                    System.out.println("----------------------------");
                }
                else if (compareResult == 2){
                    System.out.println("You lost :(");
                    System.out.println("");
                    System.out.println("-----------------------------");
                }
                else if (compareResult == 0){
                    System.out.println("You tied!");
                    System.out.println("");
                    System.out.println("--------------------------");
                }
            }
            else if (ans.equals("no")|| ans.equals("No")){
                System.out.println("How many times do you want the computer to play itself?");
                int times = sc.nextInt(); 
                String z= sc.nextLine(); 
                int x = 0;
                int player1 =0;
                int player2= 0;
                int tie = 0;
                while (x<times){
                    randomResult = getObject("rock","paper","scissors");
                    String randomResult2 = getObject("rock","paper","scissors");
                    compareResult = compare2(randomResult, randomResult2);
        
                    if (compareResult == 1){
                        player1 = player1 +1; 
                    }
                    else if (compareResult == 2){
                        player2 = player2 +1; 
                    }
                    else if (compareResult == 0){
                        tie = tie +1; 
                    }
                    x = x +1;
                }
                System.out.println ("Player 1 wins: " +player1);
                System.out.println ("Player 2 wins: " +player2);
                System.out.println ("Ties: " +tie);
            }
        }  
    }
    public static String getObject (String a, String b, String c){
        int rand = (int)(Math.random()*3+1);
        if (rand == 1){
            return a;
        }
        else if (rand == 2){
            return b;
        }
        else{
            return c;
        }
    }
    
    public static int compare2 (String a, String b){
        if (a.equals("rock") && b.equals("scissors")){
            return 1;
        }
        else if (a.equals("paper") && b.equals("rock")){
            return 1;
        }
        else if (a.equals("scissors") && b.equals("paper")){
            return 1;
        }
        else if (a.equals("rock") && b.equals("paper")){
            return 2;
        }
        else if (a.equals("paper") && b.equals("scissors")){
            return 2;
        }
        else if (a.equals("scissors") && b.equals("rock")){
            return 2;
        }
        else{
            return 0;
        }
    }
    
    
}


