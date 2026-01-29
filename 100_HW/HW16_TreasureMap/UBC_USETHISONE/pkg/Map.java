package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int[row][column];
		map[0][0]=2;
		posX=0;
		posY=0;
		generateTreasure();
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureY= (int)(Math.random()*map.length);
		treasureX= (int)(Math.random()*map[0].length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		int x = posX;
		int y=posY;
		if (m==1){
			posY--;
		}
		else if (m==2){
			posY++;
		}
		else if (m==3){
			posX--;
		}
		else if (m==4){
			posX++;
		}
		else if (m==5){
			posX--;
			posY--;
		}
		else if (m==6){
			posX++;
			posY--;
		}
		else if (m==7){
			posX--;
			posY++;
		}
		else if (m==8){
			posX++;
			posY++;
		}
		if((posX>=0)&&(posX<map[0].length)&&(posY>=0)&&(posY<map.length)){
				for (int i=0; i<map.length; i++){
					for (int j= 0; j<map[0].length; j++){
						if (map[i][j]==3){
							map [i][j]=1;
						}
						if (map[i][j]==2){
							map [i][j]=0;
						}
					}
				}
				if (map[posY][posX]==1){
					map[posY][posX]=3;
				}
				else {
					map[posY][posX]=2;
				}
				return true;

		}
		else {
			posX=x;
			posY=y;
			return false;	// Dummy value to make work
		}
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if ((row>=0)&&(row<map.length)&&(col>=0)&&(col<map[0].length)){
			posX=col;
			posY=row;
			for (int i=0; i<map.length; i++){
					for (int j= 0; j<map[0].length; j++){
						if (map[i][j]==3){
							map [i][j]=1;
						}
						if (map[i][j]==2){
							map [i][j]=0;
						}
					}
				}
				if (map[posY][posX]==1){
					map[posY][posX]=3;
				}
				else {
					map[posY][posX]=2;
				}
				return true;
		}
		return false;
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if ((map[posY][posX]==0)||(map[posY][posX]==2)){
			if ((posX==treasureX)&&(posY==treasureY)){
				map [posY][posX]=5;
				return true;
			}
			else {
				map [posY][posX]=3;
				return false;
			}
		}
		return false;
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		System.out.println("The treasure was at "+treasureY+","+treasureX+"!");
		map[treasureY][treasureX]=5;
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		System.out.println("\nMAP:");
		for (int i=0; i<map.length; i++){
			System.out.print("| ");
			for (int j= 0; j<map[0].length; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println("|");
		}
	}

}
