package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		
	int age;			
	String villain;		

	public Spiderman(){
		age = 0;
		actor = "unknown";
		villain = "unknown";
	}
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int ag){
		age = ag;
		actor = "uknown";
		villain = "unknown";
	}
	public Spiderman(String a, int ag){
		actor = a;
		age= ag;
		villain = "unknown";
	}
	public Spiderman(String a, int ag, String v){
		actor = a;
		age= ag;
		villain = v;
	}
	
	public int getAge(){
		return age; 
	}
	public String getVillain(){
		return villain; 
	}
	public String getActor(){
		return actor; 
	}
	public void setVillain(String v){
		villain = v; 
	}
	public void setActor(String a){
		actor = a;
	}
	public void setAge(int ag){
		age= ag;; 
	}
	public void print (){
		System.out.println("Actor: "+actor);
		System.out.println("Age: "+age);
		System.out.println("Villain: "+villain);
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
