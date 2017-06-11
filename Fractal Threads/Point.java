
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Dell on 9/2/2016.
 */
public class Point {

    private double x,y ;
    int R, G, B ;
    Color color1= new Color( R , G , B);

    public Point(int x, int y, Color color1) {
        this.x = x;
        this.y = y;
        this.color1 = color1;
    }

    public void drawPoint (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color1);

        g2.draw(new Line2D.Double(x,y,x,y));

    }



}
