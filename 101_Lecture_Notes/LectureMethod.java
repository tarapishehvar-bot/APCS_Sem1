/* 
    Lecture note example - Methods
*/
import java.util.Scanner;
class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("number 1:");
        int num1= sc.nextInt();
        System.out.print("number 2:");
        int num2= sc.nextInt();
        
        int num1Squared = squared(num1);
        System.out.println(num1Squared);
        System.out.println(squared(num2));
        
        System.out.println(absolute(num1));
        System.out.println(absolute(num2));
        }
    public static int squared(int a){
        return a*a;
    }
    public static int absolute(int a){
        if (a<0){
            return a*(-1);
        }
        else{
            return a;
        }
    }
        
}