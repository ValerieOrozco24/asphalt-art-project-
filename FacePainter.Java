import org.code.neighborhood.*;
public class FacePainter extends PainterPlus {
    
     public void paintSquare(String color) {
   move();
       move();
       turnRight();
       move();
       move();
       
       
       while (hasPaint()) {
      move();
      paint(color);
      turnRight();
         
    }
       
}

    }

 
        