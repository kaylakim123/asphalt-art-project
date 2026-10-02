import org.code.neighborhood.*;
public class WingsPainter extends PainterPlus{

  public void paintWings(String color){
     setPaint(6);
    move();
    move();
    turnRight();
    move();
    move();
    paint(color);
    turnLeft();
    turnLeft();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    turnRight();
    move();
    paint(color);

    // creates right wing for the bee
    setPaint(4);
    turnLeft();
    turnLeft();
    move();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
  }
}