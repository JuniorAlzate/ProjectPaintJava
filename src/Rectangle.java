import java.awt.*;

class Rectangle extends Figure{

    protected int length = 0;
    protected int width = 0;

    //=========RECTANGLE CONSTRUCTORS=========//

    public Rectangle (int X, int Y, int l, int w, Color c){
        super(X, Y, c);
        this.length = l;
        this.width = w;
    }

    //==============SETTER=================//

    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width;}

    public void setBoundingBox(int  heightBB,  int  widthBB) {
        this.length = heightBB;
        this.width = widthBB;
    }

    //=============GETTER=============//

    public int getLength(){return this.length;}
    public int getWidth(){return this.width;}
    public int getPerimeter(){return (2*(this.length + this.width));}
    public int getSurface(){return this.length*this.width;}


    @Override public void Draw(Graphics graphics){
        graphics.setColor(this.C);
        graphics.fillRect(Origin.getx(),Origin.gety(), length, width);
    }

}
