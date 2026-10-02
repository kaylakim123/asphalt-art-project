import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
  BackgroundPainter ella = new BackgroundPainter();
    // Paints the background a light blue color
    // Makes the bee look like it is flying in the air
    ella.paintBackground("LightBlue", 12);

  BodyPainter kayla = new BodyPainter();
    // This creates the body of the bee
    // It doesn't yet have color; only provides outline
    // It doesn't include the wings
   kayla.paintBody("black");

    // This creates the wings of the bee and gives it the basic shape and size. 
    // It creates both the right and left wing
    WingsPainter kk = new WingsPainter();
   kk.paintWings("black");

    // This colors the body of the bee's body yellow
    // It doesn't provide the stripes or eyeball yet
    // only colors inside of the outline of the bee's body
    ColorPainter k = new ColorPainter();
   k.paintColor("yellow");

    // This creates the stripes and the eyeball for the bee
    // Creates two stripes following an every other line pattern
  k.paintBlack("black");
  }
  

    
  }
