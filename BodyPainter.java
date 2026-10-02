import org.code.neighborhood.*;
public class BodyPainter extends PainterPlus {

  public void paintBody(String color){
     setPaint(10);
    move();
    move();
    turnRight();
    move();
    move();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
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
    move();
    paint(color);
    
    move();
    turnRight();
    move();
    
  setPaint(7);
    paint(color);

    turnLeft();
    move();
    turnRight();
    move();
    paintToEmpty(color);

    setPaint(2);
    turnRight();
    move();
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    paint(color);

    setPaint(5);
    turnLeft();
    move();
    paint(color);

    move();
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
     move();
    paint(color);
    turnLeft();
    move();
    paint(color);

    setPaint(1);
    turnAround();
    move();
    move();
    turnRight();
    move();
    paint(color);
  }
}