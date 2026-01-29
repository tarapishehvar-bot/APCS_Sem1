/*
 *	Author: Tara Pishehvar
 *  Date: 9/30/25
*/

import java.util.*;

public class starter {
    public static void main(String[] args) {
        int number = 10;
        String message= "Number is greater than 5!";
        if (number > 5) {
            message = "Number is greater than 5!";
        }

        System.out.println(message);
        int bonus = 5;
        if (number < 20) {
            number = number + bonus;
        }

        System.out.println("Bonus was: " + bonus);
        int x = 0;
        if (x == 0) {
            System.out.println("x is zero!");
        }

        number = 100;
        System.out.println("Final number: " + number);
    }
}
