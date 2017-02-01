public class Player{
  //private String color;
  private boolean win; 
  private int ships; 
  
  public Player(){
    /*color = "red";
    suit = "diamonds";
    rank = 'A';*/
  }
  public Player(boolean newWin, int newShips){
    //color = newColor;
    win = newWin;
    ships = newShips;
  }
  /*public String getColor(){
    return color;*/
  
  public boolean getWin(){
    return win;
  }
  public void setWin(boolean newWin){
    win = newWin;
  }
  public int getShips(){
    return ships;
  }
  public void setShips(int newShips){
    ships = newShips;
  }
 
  public String toString(){
    return win + " " + ships; 
  }

}