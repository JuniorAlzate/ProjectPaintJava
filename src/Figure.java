import java.awt.*;



abstract class Figure {

    public Color C;

    public Point Origin;

    //========= GETTER =============//
    public Color getC() {
        return C;
    }

//=============================================//

    public Figure(int X, int Y, Color Coco){
        this.C = Coco;
        Origin = new Point(X,Y);
        System.out.println("figure created");
    }

    public Figure(){}

    //==================ABSTRACT METHODS===================//

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void Draw(Graphics graphics);


}
