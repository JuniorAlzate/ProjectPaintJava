
import java.awt.*;

public class Circle extends Ellipse{

    double pi = 3.14;
    int r;

    public Circle(int x, int y, Color c) {
        super(x, y, c);
        this.C = c;
    }

    //==============SETS=================//
    public void setSemiAxisY(int axisY){
        if (axisY > 0){
            this.semiAxisY = axisY;
        }
    }
    public void setSemiAxisX(int AxisX){
        if (AxisX > 0){
            this.semiAxisX = AxisX;
        }
    }

    public double getSurface(Circle circle) {return pi*circle.semiAxisX*circle.semiAxisY;}
    public double getPerimetre(Circle circle) {return 2*pi*circle.semiAxisX;}

    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxisX = heightBB;
        this.semiAxisY = heightBB;
    }

    public String ToString() {return Integer.toString(x) + Integer.toString(y) + Integer.toString(r); }
}
