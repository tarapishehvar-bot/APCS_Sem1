/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        double item1 = 2.05;
        double item2 = 4.45;
        double item3 = 3.85;
        System.out.println ("Welcome to the cafe");
        System.out.println ("MENU:");
        System.out.println ("1.🍦 Ice Cream- $"+item1);
        System.out.println ("2.🍕 Pizza- $"+item2);
        System.out.println ("3.🍰 Cake- $"+item3);
        
        System.out.println ();
        System.out.print ("Whats the name for the order? ");
        String name = sc.nextLine();
        System.out.println ();
        System.out.print ("How many ice creams would you like? ");
        int quant1 = sc.nextInt();
        System.out.print ("How many pizzas would you like? ");
        int quant2 = sc.nextInt();
        System.out.print ("How many cakes would you like? ");
        int quant3 = sc.nextInt();
        double total1 = quant1 *item1;
        double total2 = quant2 *item2;
        double total3 = quant3 *item3;
        double total = total1+total2+total3;
        System.out.println("Your total currently is: $"+total);
        System.out.print ("What percent would you like to tip? ");
        double tipPer = sc.nextDouble();
        double tip = total*(tipPer/100);
        double grandTotal = tip +total;
        System.out.println("----------------------------");
        System.out.println (name+"'s reciept: ");
        System.out.println (quant1 +" x Ice Cream = " +total1);
        System.out.println (quant2 +" x Pizza = " +total2); 
        System.out.println (quant3 +" x Cake = " +total3);
        System.out.println ("Tip ("+tipPer+"%) = "+ tip);
        System.out.println("--------------------------");
        System.out.println ("Total: $"+grandTotal);
        System.out.print ("Thank you, " +name+", for eating at the cafe");
    }
}
