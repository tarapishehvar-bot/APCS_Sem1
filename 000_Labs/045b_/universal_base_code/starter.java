/*
 *	Author:  Tara Pishehvar
 *  Date: 1/21/26
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter a word that you'd like to hide in a crossword:");
        String word = sc.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n");
        String [][] cross = new String [word.length()+5][word.length()+5];
        System.out.println("-----Crossword Puzzle-----");
        for (int i=0; i<cross.length; i++){
        	for (int j=0; j<cross[0].length; j++){
        		int ran = (int)(Math.random()*(letters.length-1)+1);
        		cross [i][j]= letters[ran];
        	}
        }
        
        int ran = (int)(Math.random()*3+1);
        int r = 0;
        int c = 0;
        int random = (int)(Math.random()*2+1);
        
        if (ran == 1){ 
            r = (int)(Math.random()*(cross.length));
            c = (int)(Math.random()*(cross.length-(word.length()-1)));
            if (random==1){
            	for (int i=0; i<word.length(); i++){
                	cross[r][c]=word.substring(i,i+1);
                	c++;
                }
            }
            else{
                for (int i=word.length()-1; i>=0; i--){
                	cross[r][c]=word.substring(i,i+1);
                	c++;
                }
            }
        }
        
        
        else if (ran ==2){
            c = (int)(Math.random()*(cross.length));
            r = (int)(Math.random()*(cross.length-(word.length()-1)));
            if (random ==1){
            	for (int i=0; i<word.length(); i++){
                	cross[r][c]=word.substring(i,i+1);
                	r++;
                }
            }
            else{
                for (int i=word.length()-1; i>=0; i--){
                	cross[r][c]=word.substring(i,i+1);
                	r++;
                }
            }
        }
        
        
        else if (ran == 3){
            r = (int)(Math.random()*(cross.length-(word.length()-1)));
            c = (int)(Math.random()*(cross.length-(word.length()-1))+word.length()-1);
            if (random ==1){
                for (int i=0; i<word.length(); i++){
                    cross[r][c]=word.substring(i,i+1);
                    c--;
                    r++;
                }
            }
            else{
                for (int i=word.length()-1; i>=0; i--){
                    cross[r][c]=word.substring(i,i+1);
                	c--;
                	r++;
                }
            }
        }
        
        
        
		for (int i=0; i<cross.length; i++){
			System.out.println("");
        	for (int j=0; j<cross[0].length; j++){
        		System.out.print(cross[i][j]+" ");
        	}
        }
	}
}
