import java.awt.*;

class Rectangle extends Figure{

    protected int length = 0;
    protected int width = 0;

    public Rectangle (int X, int Y, int m, int n, Color c){
        super(X, Y, c);
        this.length = m;
        this.width = n;
    }

    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width;}

    public int getLength(Rectangle rectangle){return rectangle.length;}
    public int getWidth(Rectangle rectangle){return rectangle.width;}
    public int getPerimeter(Rectangle rectangle){return (2*(rectangle.length+ rectangle.width));}
    public int getSurface(Rectangle rectangle){return rectangle.length*rectangle.width;}

    public void setBoundingBox(int  heightBB,  int  widthBB) {
        this.length = heightBB;
        this.width = widthBB;
    }

    @Override public void Draw(Graphics graphics){
        graphics.setColor(this.C);
        graphics.fillRect(Origin.getx(),Origin.gety(), length, width);
    }

}
