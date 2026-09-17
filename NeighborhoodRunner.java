import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
  BackgroundPainter ella = new BackgroundPainter();
    ella.paintBackground("LightBlue", 12);

  PainterPlus kayla = new PainterPlus();
    // creates body of the bee
    kayla.setPaint(10);
    kayla.move();
    kayla.move();
    kayla.turnRight();
    kayla.move();
    kayla.move();
    kayla.move();
    kayla.turnLeft();
    kayla.move();
    kayla.paint("black");
    kayla.move();
    kayla.paint("black");
    kayla.move();
    kayla.paint("black");
    kayla.move();
    kayla.paint("black");
    kayla.move();
    kayla.paint("black");
    kayla.move();
    kayla.paint("black");
    
    kayla.move();
    kayla.turnRight();
    kayla.move();
    kayla.paint("black");
    kayla.turnLeft();
    kayla.move();
    kayla.turnRight();
    kayla.move();
    kayla.paint("black");
    kayla.move();
    kayla.paint("black");
    
    kayla.move();
    kayla.turnRight();
    kayla.move();
    
  kayla.setPaint(7);
    kayla.paint("black");

    kayla.turnLeft();
    kayla.move();
    kayla.turnRight();
    kayla.move();
    kayla.paintToEmpty("black");

    kayla.setPaint(2);
    kayla.turnRight();
    kayla.move();
    kayla.turnRight();
    kayla.move();
    kayla.paint("black");
    kayla.turnLeft();
    kayla.move();
    kayla.move();
    kayla.move();
    kayla.paint("black");

    kayla.setPaint(5);
    kayla.turnLeft();
    kayla.move();
    kayla.paint("black");

    kayla.move();
    kayla.turnLeft();
    kayla.move();
    kayla.paint("black");
    kayla.move();
    kayla.paint("black");
     kayla.move();
    kayla.paint("black");
    kayla.turnLeft();
    kayla.move();
    kayla.paint("black");

    kayla.setPaint(1);
    kayla.turnAround();
    kayla.move();
    kayla.move();
    kayla.turnRight();
    kayla.move();
    kayla.paint("black");

    // creates left wing of the bee
    WingsPainter kk = new WingsPainter();
    kk.setPaint(6);
    kk.move();
    kk.move();
    kk.turnRight();
    kk.move();
    kk.move();
    kk.paint("black");
    kk.turnLeft();
    kk.turnLeft();
    kk.move();
    kk.paint("black");
    kk.move();
    kk.turnRight();
    kk.move();
    kk.paint("black");
    kk.move();
    kk.paint("black");
    kk.move();
    kk.turnRight();
    kk.move();
    kk.paint("black");
    kk.turnLeft();
    kk.move();
    kk.turnRight();
    kk.move();
    kk.paint("black");

    // creates right wing for the bee
    kk.setPaint(4);
    kk.turnLeft();
    kk.turnLeft();
    kk.move();
    kk.move();
    kk.paint("black");
    kk.turnRight();
    kk.move();
    kk.paint("black");
    kk.move();
    kk.turnRight();
    kk.move();
    kk.paint("black");
    kk.move();
    kk.paint("black");

    // colors body of bee
    color k = new color();
    k.setPaint(2);
    k.move();
    k.move();
    k.turnRight();
    k.move();
    k.move();
    k.move();
    k.move();
    k.move();
    k.paint("yellow");
    k.move();
    k.paint("yellow");
    k.turnLeft();
    k.setPaint(7);
    k.paintToEmpty("yellow");
    k.setPaint(1);
    k.paint("yellow");
    k.turnRight();
    k.move();
    k.turnRight();
    k.move();
    k.setPaint(5);
    k.paintToEmpty("yellow");
    k.turnRight();
    k.move();
    k.move();
    k.turnRight();
    k.setPaint(7);
    k.paintToEmpty("yellow");
    k.turnLeft();
    k.move();
    k.turnLeft();
    k.move();
    k.move();
    k.setPaint(5);
    k.paintToEmpty("yellow");

    //creates stripes and eye for bee
    k.turnLeft();
    k.move();
    k.setPaint(2);
    k.paintToEmpty("black");

    k.turnLeft();
    k.move();
    k.move();
    k.turnLeft();
    k.setPaint(4);
    k.paintToEmpty("black");

    k.setPaint(1);
    k.turnRight();
    k.move();
    k.move();
    k.turnRight();
    k.move();
    k.move();
    k.paint("black");
  }
  

    
  }
