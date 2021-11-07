import java.awt.*;

public class Ellipse extends Figure {

    int x;
    int y;
    double pi = 3.14;

    protected int semiAxisX = 0; //
    protected int semiAxisY = 0;  //

    //Created Ellipse
    public Ellipse(int px, int py, Color c) {
        super(px, py, c);
    }
    public Ellipse() {
        super();
    }

    public Ellipse(int x, int y, int semiAxisX, int semiAxisY, Color color) {
    super(x,y,color);
    this.semiAxisX = semiAxisX;
    this.semiAxisY = semiAxisY;
    }

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

    //=========SET=============//
    public double getSurface(Ellipse ellipse) {
        return pi * ellipse.semiAxisY * ellipse.semiAxisX;
    }

    public int getSemiAxisX(Ellipse ellipse) {
        return ellipse.semiAxisX;
    }

    public int getSemiAxisY(Ellipse ellipse) {
        return ellipse.semiAxisY;
    }

    public double getPerimeter(Ellipse ellipse) {return Math.round(2 * pi * (Math.sqrt((Math.pow(ellipse.semiAxisX, 2) + Math.pow(ellipse.semiAxisY, 2)) / 2)));}

    public void setBoundingBox(int heightBB, int widthBB) {
        this.semiAxisX = heightBB;
        this.semiAxisY = widthBB;
    }
    @Override
    public void Draw(Graphics g) {
        g.setColor(this.C);
        g.fillOval(Origin.getx(), Origin.gety(), semiAxisX, semiAxisY);
    }
}
