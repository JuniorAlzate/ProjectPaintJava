import java.awt.*;

public class Square extends Rectangle {

    //=========SQUARE CONSTRUCTORS=========//

    public Square(int x, int y, int L, Color c) {
        super(x, y, L, L, c);
    }

    //==============SETTER=================//

    public void setLength(int lengthSquare) {
        if (lengthSquare > 0) {
            this.length = lengthSquare;
        }
    }

    public void setWidth(int widthSquare) {
        if (widthSquare > 0) {
            this.width = widthSquare;
        }
    }

    public void setBoundingBox(int length, int width) {
        if (length <= width) {
            this.length = Math.min(Math.abs(length), Math.abs(width));
            this.width = Math.min(Math.abs(length), Math.abs(width));
        }
        else if (length > width) {
            this.length = Math.max(Math.abs(length), Math.abs(width));
            this.width = Math.max(Math.abs(length), Math.abs(width));
        }

    }
}