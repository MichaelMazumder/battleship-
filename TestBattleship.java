import java.util.Scanner;

public class TestBattleship{
  public static void main (String[] args){
    
    //this prints the screen
    System.out.println(
       "__________         __    __  .__                .__    .__          "  +
       "\n\\______   \\_____ _/  |__/  |_|  |   ____   _____|  |__ |__|_____    "  +
       "\n |    |  _/\\__  \\\\   __\\   __\\  | _/ __ \\ /  ___/  |  \\|  \\____ \\   "  +
       "\n |    |   \\ / __ \\|  |  |  | |  |_\\  ___/ \\___ \\|   Y  \\  |  |_> >  "  +
       "\n |______  /(____  /__|  |__| |____/\\___  >____  >___|  /__|   __/   "  +
       "\n         \\/      \\/                     \\/     \\/     \\/   |__|     "    
                                );
      Player player = new Player(false);

      Battleship board = new Battleship();
    
      System.out.println(player);
      board.printBoard();
    
      int x1 = player.getShips().getx1(); 
      int y1 = player.getShips().gety1();
      int x2 = player.getShips().getx2();
      int y2 = player.getShips().gety2();
     
      /*
        Make GamePlay:
        1) Allow for Player to input x and y values which will be marked with 'x' to signify a ship.
        a) enter x1,y1,x2,y2 values
        2) Using if else; if value/char is equal to the opponents x1,y1,x2,y2 then print "you hit" (and removed value)
            else return "you missed"
        3) Using if else; if value/char is equal to the x1,y1,x2,y2 (equal to all of these) print "you sunk the ship"
          else return "you missed" */
    
    board.placeShip(x1, y1);
    board.placeShip(x2, y2);
    board.printBoard();
    
    //test game logic
    Scanner input = new Scanner(System.in);
    
    System.out.println("x-location: " + player.getShips().getx1());
    System.out.println("y-location: " + player.getShips().gety1());
    
    System.out.println("Guess where the ship is! Enter x-location: ");
    int x_loc = input.nextInt();
    System.out.println("Enter y-location: ");
    int y_loc = input.nextInt();
    
    if(x_loc == player.getShips().getx1() && y_loc == player.getShips().gety1()){
      System.out.println("You sunk the ship!");
    }
    else{
      System.out.println("You missed!");
    }
    
    
    }
  
}