import org.code.neighborhood.*;
public class faceColor extends PainterPlus {
  public void paintEye(String color) {
   move();
       move();
       turnRight();
       move();
       move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    
       
       
      while (hasPaint()) {
     move();
      paint(color);
      turnLeft();
         
    }
       
}
}
