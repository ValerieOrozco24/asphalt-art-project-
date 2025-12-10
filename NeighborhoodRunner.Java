import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
    
BgPainter sea = new BgPainter();
  
    
    sea.setPaint(144);
    sea.paintBg("yellow");
    // sea.turnRight();
    // sea.move();
    FacePainter zoe = new FacePainter();
    
    zoe.setPaint(5);
    zoe.paintSquare( "black");
    faceColor v = new faceColor();
    v.setPaint(5);
    v.paintEye("black");
   
    Mouth s = new Mouth();
    s.setPaint(8);
    s.paintLine("black");
    s.paintTongue("pink");
    
    
   
   
    

    
  }
}