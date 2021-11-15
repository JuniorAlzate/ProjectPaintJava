
import java.awt.*;

public class Circle extends Ellipse{

    //=========CIRCLE CONSTRUCTOR=========//

    public Circle(int x, int y, Color c) {
        super(x, y, c);
    }

    public Circle(int x, int y, int radio, Color c) {
        super(x, y, radio, radio, c);
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
            this.semiAxisX = Math.min(heightBB,widthBB);
            this.semiAxisY = Math.min(heightBB,widthBB);
        }



    public String ToString() {return Integer.toString(x) + Integer.toString(y); }
}
