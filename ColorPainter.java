import org.code.neighborhood.*;
public class ColorPainter extends PainterPlus{

  public void paintColor(String color){
     setPaint(2);
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    setPaint(7);
    paintToEmpty(color);
    setPaint(1);
    paint(color);
    turnRight();
    move();
    turnRight();
    move();
    setPaint(5);
    paintToEmpty(color);
    turnRight();
    move();
    move();
    turnRight();
    setPaint(7);
    paintToEmpty(color);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    setPaint(5);
    paintToEmpty(color);
  }

  public void paintBlack(String color){
      turnLeft();
    move();
    setPaint(2);
    paintToEmpty(color);

    turnLeft();
    move();
    move();
    turnLeft();
    setPaint(4);
    paintToEmpty(color);

    setPaint(1);
    turnRight();
    move();
    move();
    turnRight();
    move();
    move();
    paint(color);
  }
  }
