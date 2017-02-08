public class TestBattleship{
  public static void main(String[] args){
  
    Player player = new Player(false);
    
    Battleship board = new Battleship();
    
    System.out.println(player);    
    board.printBoard();
    
    int x1 = player.getShips().getx1();
    int y1 = player.getShips().gety1();
    int x2 = player.getShips().getx2();
    int y2 = player.getShips().gety2();
    
    board.placeShip(x1, y2);
    board.placeShip(x2, y2);
    board.printBoard();

  }
}