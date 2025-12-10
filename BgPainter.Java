import org.code.neighborhood.*;

public class BgPainter extends PainterPlus {
   public void paintBg(String color){
     while(canMove("south")){
       while (canMove()) { // moves the paint across the row while painting and moving
         paint(color);
         move();
         if (!canMove()) {
           paint(color);
         }
       }
       if (isFacingEast()) { // turns down to next row when facing east
         turnRight();
         move();
         turnRight();
       } else if (isFacingWest()) { // turns down the next row when facing west
         turnLeft();
         move();
         turnLeft();
       }
      }
     while (canMove()) { // moves the paint across the row while painting and moving
         paint(color);
         move();
         if (!canMove()) {
           paint(color);
         }
       }
    }


     
     
}