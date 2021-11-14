import java.awt.*;



public abstract class Figure implements java.io.Serializable{

    public Color C;
    public Point Origin;

    //==============SETTER=================//

    public void setOrigin(Point P){this.Origin = P;}

    //========= GETTER =============//

    public Color getC() {
        return C;
    }

    //=========FIGURE CONSTRUCTORS=========//

    public Figure(){}

    public Figure(int X, int Y, Color Coco){
        this.C = Coco;
        Origin = new Point(X,Y);
        System.out.println("figure created");
    }

    //==================ABSTRACT METHODS===================//

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void Draw(Graphics graphics);

}
