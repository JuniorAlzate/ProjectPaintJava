
import java.awt.*;

public class Circle extends Ellipse{

    double pi = 3.1416;
    int r;

    //=========CIRCLE CONSTRUCTOR=========//

    public Circle(int x, int y, Color c) {
        super(x, y, c);
    }

    //==============SETTER=================//

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

    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxisX = heightBB;
        this.semiAxisY = heightBB;
    }

    //=============GETTER=============//

    public double getSurface(Circle circle) {return pi*circle.semiAxisX*circle.semiAxisY;}
    public double getPerimeter(Circle circle) {return 2*pi*circle.semiAxisX;}

    public String ToString() {return Integer.toString(x) + Integer.toString(y) + Integer.toString(r); }
}
