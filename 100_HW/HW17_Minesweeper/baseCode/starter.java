import java.util.*;

class starter{
    public static void main(String[] args){
        System.out.println("Welcome to Minesweeper!");
        System.out.println("On the grid, 9 means untouched space.");
        System.out.println("Any other number means how many bombs are adjacent to the square.");
        System.out.println("Clear all empty spots and don't touch the bombs!");
        System.out.println();
        
        System.out.println("How difficult would you like the game?");
        System.out.println("1 - Easy (10 bombs)");
        System.out.println("2 - Medium (25 bombs)");
        System.out.println("3 - Hard (40 bombs)");
        System.out.println("4 - Impossible (99 bombs)");
        
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        
        int[][] guessGrid = new int[10][10];
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                guessGrid[i][j] = 9;
            }
        }
        
        
        int[][] bombProxGrid = new int[10][10];
        mapSetUp(diff, bombProxGrid);
        printGrid(guessGrid);
        System.out.println("-------------------------------------");

        boolean alive = true;
        while(alive){
            System.out.print("Please enter a row: ");
            int r = sc.nextInt();
            System.out.print("Please enter a col: ");
            int c = sc.nextInt();
            
            boolean boom = move(r, c, bombProxGrid);
            if(boom){           
                System.out.println("-------------------------------------");
                System.out.println("You've hit a bomb! Better luck next time!");
                printGrid(bombProxGrid);
                break;
            }
            reveal(r, c, guessGrid, bombProxGrid);
            System.out.println("-------------------------------------");
            if(checkWin(guessGrid, bombProxGrid)){
                System.out.println("You won! Congratz!");
                break;
            }
        }
    }
    
    /*
        This method should completely generate a grid of bombs and adjacent values
        EX:
            0 1 9 1 0 2 9 2 0 0 
            0 1 1 1 0 2 9 2 1 1 
            0 0 0 0 0 2 2 2 1 9 
            0 0 0 0 0 1 9 2 3 3 
            1 1 1 0 0 1 1 2 9 9 
            1 9 1 0 0 0 0 1 2 2 
            1 1 1 0 0 0 0 0 0 0 
            0 0 1 1 1 0 0 0 0 0 
            1 1 2 9 1 0 0 0 0 0 
            1 9 2 1 1 0 0 0 0 0 
            
        Start by defining how many bombs the difficulty states.
        
        There are 2 steps to this:
        1. Generate bombs randomly
        2. Generate all the adjacent values in a grid
        
        For step 1:
        - Create a loop that goes until there are no more bombs to place
        - Within that, iterate through the entire 2D array and place bombs
            - To place a bomb randomly, this should be a 1 in 10 chance to place a bomb
                - All bombs should be the value 9
            - Make sure to not place bombs on bombs that are already there
            - When a bomb is placed, make sure to track that for your outer loop
        - This should loop through the 2D array over and over until ALL bombs have been placed
        
        For step 2:
        - Loop through the 2D array
            - For every bomb, call the add adjacent method,  
    */
    public static void mapSetUp(int diff, int [][] bombProxGrid){
        int ran=0;
        //int t=0;
        int row=0;
        int col=0;
        int x=0;
        if (diff==1){
            x=10;
        }
        else if (diff==2){
            x=25;
        }
        else if (diff==3){
            x=40;
        }
        else if (diff==4){
            x=99;
        }
        for (int t=0; t<x; t++){
            row =(int)(Math.random()*10);
            col =(int)(Math.random()*10);
            if (bombProxGrid[row][col]!=9){
                bombProxGrid[row][col]=9;
            }
            else{
                t--;
            }
        }
        for (int i=0; i<bombProxGrid.length; i++){
            for (int j=0; j<bombProxGrid[0].length; j++){
                if (bombProxGrid[i][j]!=9){
                    bombProxGrid[i][j]=addAdj(i,j,bombProxGrid);
                }
            }
        }
    
    }
    
    /*
        Add adjacent values to each location
        Key Concept -> In a compound boolean, if the first evaluation of an && is false, the statement will STOP immediately
        
        - Using the given parameters of row and column, check first if the location is value
        - Check there isn't a bomb in the current location
        - Then add to the location to say there is a bomb adjacent
        
    */
    public static int addAdj(int r, int c, int [][] bombProxGrid){
        int counter= 0;
        if (bombProxGrid[r][c]!=9){
            for (int i=r-1; i<r+2; i++){
                for (int j=c-1; j<c+2; j++){
                    if (c+1<bombProxGrid[0].length&&r+1<bombProxGrid.length&&r-1>0&&c-1>0){
                        if (bombProxGrid[i][j]==9){
                            counter++;
                        }
                	}
                }
            }
        }
        return counter;
        
        
    }
    
    /*
        Checks if you can move to a location or not.
        If it's a bomb, then return true
        If not a bomb, then return false
    */
    public static boolean move(int r, int c, int [][] bombProxGrid){
        if (bombProxGrid[r][c]==9){
            return true;
        }
        return false;
    }
    
    /*
        This method updates the guessGrid with a 3 by 3 square around the location guessed
        The values from the bomb grid should be translated to the answer grid
        After transferred, call the print method on the answer grid.
    */
    public static void reveal(int r, int c, int [][] guessGrid, int[][] bombProxGrid){
        for (int i=r-1; i<r+2; i++){
            for (int j=c-1; j<c+2; j++){
                if (c+1<bombProxGrid[0].length&&r+1<bombProxGrid.length&&r-1>0&&c-1>0){
                guessGrid[i][j]=bombProxGrid[i][j];
                }
            }
        }
        printGrid(guessGrid);
    }
    
    /*
        This method should traverse the entire 2D array and check
        whether the guess grid is exactly the same as the proximity grid
        Returning true if so, false if there is a discrepancy
    */
    public static boolean checkWin(int [][] guessGrid, int [][] bombProxGrid){
        int counter=0;
        for (int i=0; i<guessGrid.length; i++){
            for (int j=0; j<guessGrid[0].length; j++){
                if (guessGrid[i][j]!=bombProxGrid[i][j]){
                    counter++;
                }
                
            }
        }
        if (counter ==0){
            return true;
        }
        return false;
        
    }
    
    public static void printGrid(int [][] board){
		System.out.println("_________________________________________");
		for(int i = 0; i < board.length;i++){
			for(int j = 0; j < board[0].length;j++){
				System.out.print("| " + board[i][j] + " | ");
			}
			System.out.println("");
		}
		System.out.println("_________________________________________");
	}
}