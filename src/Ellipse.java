import java.awt.*;

public class Ellipse extends Figure {

    int x;
    int y;
    double pi = 3.1416;

    protected int semiAxisX = 0; //
    protected int semiAxisY = 0;  //

    //=========ELLIPSE CONSTRUCTORS=========//

    public Ellipse() {
        super();
    }

    public Ellipse(int px, int py, Color c) {
        super(px, py, c);
    }

    public Ellipse(int x, int y, int semiAxisX, int semiAxisY, Color color) {
    super(x,y,color);
    this.semiAxisX = semiAxisX;
    this.semiAxisY = semiAxisY;
    }

    //=============SETTER=============//

    public void setSemiAxisX(int axisX) {
        if (axisX > 0) {
            this.semiAxisX = axisX;
        }
    }

    public void setSemiAxisY(int axisY) {
        if (axisY > 0) {
            this.semiAxisY = axisY;
        }
    }

    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxisX = heightBB;
        this.semiAxisY = widthBB;
    }

    //=============GETTER=============//

    public double getSurface() {
        return pi * this.semiAxisY * this.semiAxisX;
    }
    public int getSemiAxisX() {
        return this.semiAxisX;
    }
    public int getSemiAxisY() {
        return this.semiAxisY;
    }
    public double getPerimeter() {return Math.round(2 * pi * (Math.sqrt((Math.pow(this.semiAxisX, 2) + Math.pow(this.semiAxisY, 2)) / 2)));}

    @Override
    public void Draw(Graphics g) {
        g.setColor(this.C);
        g.fillOval(Origin.getx(), Origin.gety(), semiAxisX, semiAxisY);
    }
}
