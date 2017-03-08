/*import java.util.List*/

public class Player{
  //private String color;
  private boolean win; 
  private Ship ship;

  public Player(){
    /*color = "red";
    suit = "diamonds";
    rank = 'A';*/
  }
  public Player(boolean newWin){
    //color = newColor; 
    win = newWin;
    int x1 = getRandomNumber(4, 0); 
    int y1 = getRandomNumber(9, 0);
    int x2 = getRandomNumber(4, 0); 
    int y2 = getRandomNumber(9, 0); 
    ship = new Ship(x1, y1, x2, y2);
  }

  public int getRandomNumber(int max, int min){
   int rangeX = (max - min) + 1;
   return (int)(Math.random() * rangeX) + min; 
  }
  /*public String getColor(){
    return color;*/
  
  public boolean getWin(){
    return win;
  }
  public void setWin(boolean newWin){
    win = newWin;
  }
  public Ship getShips(){
    return ship;
  }
  public void setShips(Ship newShips){
    ship = newShips;
  }
 
  public String toString(){
    return win + " " + ship.toString(); 
  }

}