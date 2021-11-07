import java.awt.*;

public class Square extends Rectangle{

    public Square (int x, int y, int L, Color col){
        super(x, y, L, L, col);
    }
    //======SETS===========//
    public void setLength(int lengthSquare){
        if (lengthSquare > 0){
            this.length = lengthSquare;
        }
    }
    public void setWidth(int widthSquare){
        if (widthSquare > 0){
            this.width = widthSquare;
        }
    }
    public void setBoundingBox(int  length,  int  width) {
        this.length = length;
        this.width = length;
    }
}