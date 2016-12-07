//IMPORT TO FOR USER INPUT
import java.util.Scanner;

public class Battleship{
  
<<<<<<< HEAD
    static char[][] ships = {
                      {' ', ' ', ' ', ' ', ' '},
                       {' ', ' ', ' ', ' ', ' '},
                      {' ', ' ', ' ', ' ', ' '},
                      {' ', ' ', ' ', ' ', ' '},
                     {' ', ' ', ' ', ' ', ' '},
                     {' ', ' ', ' ', ' ', ' '},
                      {' ', ' ', ' ', ' ', ' '},
                     {' ', ' ', ' ', ' ', ' '},
                     {' ', ' ', ' ', ' ', ' '},
                      {' ', ' ', ' ', ' ', ' '}
                    };
  
  //main method
  public static void main(String[] args){
    
     Scanner input = new Scanner(System.in);
    
     System.out.println("Enter an x and y.");
   
     int x = input.nextInt(); 
     int y = input.nextInt();     
    
     printBoard(x, y);
    
    
    while(x > -1){
       
      if(x > - 1){}
        System.out.println("Enter an x and y.");

        x = input.nextInt(); 
        y = input.nextInt();     

        printBoard(x, y);
      }
    }
   
                   
   }
  
  //prints the board
  public static void printBoard(int x, int y){
    
   ships[x][y] = 'x'; 
   
   System.out.println("Battleship");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[0][0] + "    |   " + ships[0][1] + "    |   " + ships[0][2] + "    |   " + ships[0][3] + "    |    " + ships[0][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[1][0] + "    |   " + ships[1][1] + "    |   " + ships[1][2] + "    |   " + ships[1][3] + "    |    " + ships[1][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[2][0] + "    |   " + ships[2][1] + "    |   " + ships[2][2] + "    |   " + ships[2][3] + "    |    " + ships[2][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[3][0] + "    |   " + ships[3][1] + "    |   " + ships[3][2] + "    |   " + ships[3][3] + "    |    " + ships[3][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[4][0] + "    |   " + ships[4][1] + "    |   " + ships[4][2] + "    |   " + ships[4][3] + "    |    " + ships[4][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[5][0] + "    |   " + ships[5][1] + "    |   " + ships[5][2] + "    |   " + ships[5][3] + "    |    " + ships[5][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[6][0] + "    |   " + ships[6][1] + "    |   " + ships[6][2] + "    |   " + ships[6][3] + "    |    " + ships[6][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[7][0] + "    |   " + ships[7][1] + "    |   " + ships[7][2] + "    |   " + ships[7][3] + "    |    " + ships[7][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[8][0] + "    |   " + ships[8][1] + "    |   " + ships[8][2] + "    |   " + ships[8][3] + "    |    " + ships[8][4] + "   |");
   System.out.println("_________________________________________");
   System.out.println("|  " + ships[9][0] + "    |   " + ships[9][1] + "    |   " + ships[9][2] + "    |   " + ships[9][3] + "    |    " + ships[9][4] + "   |");
   System.out.println("_________________________________________");
  
    
    
=======
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
  
  /**
  * THIS IS MAIN METHOD
  * THIS IS WHERE THE PROGRAM STARTS
  **/
  public static void main(String[] args){
    
    //ASK THE USER TO PLACE THEIR FIRST SHIP
    Scanner input = new Scanner(System.in);
    
    //PROMPT THE USER TO PUT IN X AND Y LOCATION
    System.out.println("Enter in x and then y to place your first ship.");
    
    //TELL USER TO ENTER IN X
    System.out.println("x: ");
    //THE VALUE THAT THE USER PUTS IN GOES INSIDE THE 'x' VARIABLE
    int x = input.nextInt();
    
    //TELL THE USER TO ENTER IN Y
    System.out.println("y: ");
    //THE VALUE THAT THE USER PUTS IN GOES INSIDE THE 'y' VARIABLE
    int y = input.nextInt();
    
    //UPDATE THE BOARD BY CALLING THE SHIPS ARRAY USING INDEX CALLING
    ships[x][y] = '*'; 
    
    //PRINT THE BOARD BY CALLING YOUR CUSTOM 'printBoard' method
    printBoard();
    
    //TO-DO: IN THE NEXT LINES OF CODE, ASK THE USER TO PLACE THE SECOND AND THIRD SHIPS
   

>>>>>>> 4552f046b9de21c0965f2627e18397b069417e07
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