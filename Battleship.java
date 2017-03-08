//IMPORT TO FOR USER INPUT
import java.util.Scanner;

public class Battleship{
  
  //THIS IS AN ARRAY OF CHARARACTERS
  //IT IS INITIALIZED HERE TO HOLD ALL THE SHIPS
  static char[][] ships = {{' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' '}};
  
   public Battleship(){

   }

   public void placeShip(int x, int y){
     ships[y][x] = 'X';
   }
  
  /**
  * THIS IS A CUSTOM METHOD THAT PRINT THE BOARD
  **/
  public static void printBoard(){ 
     System.out.println("Battleship");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[0][0] + "    |   " + ships[0][1] + "    |   " + ships[0][2] + "    |   " + ships[0][3] + "    |    " + ships[0][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[1][0] + "    |   " + ships[1][1] + "    |   " + ships[1][2] + "    |   " + ships[1][3] + "    |    " + ships[1][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[2][0] + "    |   " + ships[2][1] + "    |   " + ships[2][2] + "    |   " + ships[2][3] + "    |    " + ships[2][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[3][0] + "    |   " + ships[3][1] + "    |   " + ships[3][2] + "    |   " + ships[3][3] + "    |    " + ships[3][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[4][0] + "    |   " + ships[4][1] + "    |   " + ships[4][2] + "    |   " + ships[4][3] + "    |    " + ships[4][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[5][0] + "    |   " + ships[5][1] + "    |   " + ships[5][2] + "    |   " + ships[5][3] + "    |    " + ships[5][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[6][0] + "    |   " + ships[6][1] + "    |   " + ships[6][2] + "    |   " + ships[6][3] + "    |    " + ships[6][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[7][0] + "    |   " + ships[7][1] + "    |   " + ships[7][2] + "    |   " + ships[7][3] + "    |    " + ships[7][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[8][0] + "    |   " + ships[8][1] + "    |   " + ships[8][2] + "    |   " + ships[8][3] + "    |    " + ships[8][4] + "   |");
     System.out.println("_____________________________________________");
     System.out.println("|  " + ships[9][0] + "    |   " + ships[9][1] + "    |   " + ships[9][2] + "    |   " + ships[9][3] + "    |    " + ships[9][4] + "   |");
     System.out.println("_____________________________________________");
    
  }
  
}
