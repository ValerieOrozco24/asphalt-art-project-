import org.code.neighborhood.*;
public class Mouth extends PainterPlus{
  public void paintLine(String color){
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    
  }
  public void paintTongue(String color){
   move();
  paint(color);
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  }
}