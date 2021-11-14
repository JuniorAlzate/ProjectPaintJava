import java.awt.*;

public class TestSwing {

    public static void main(String[] args) {

//  ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===//
                //============TEST PROJECT===========//
//  ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===//

        Window win = new Window("Paint it black", 800, 600);

        /* ============TEST CLASS POINT===========//

       Point punto1 = new Point();
       System.out.println(punto1.toString());
       Point punto2 = new Point(10, 20);
       System.out.println(punto2.toString());*/

        /* ============TEST CLASS RECTANGLE===========//

        /*Rectangle Rect1 = new Rectangle(10,20,80,50 Color.LIGHT_GRAY);
        System.out.println("||lenght: " + Rect1.getLength() + "||widht: " + Rect1.getWidth() + "||Color: " + Rect1.getC());
        System.out.println(Rect1.getPerimeter());*/

        /* ============TEST CLASS ELLIPSE===========//

        Ellipse Ellip1 = new Ellipse(7,4, Color.BLUE);
        System.out.println("X: " + Ellip1.getX() + "||Y: " + Ellip1.getY() + "||Color: " + Ellip1.getC());

        //===============================//

        Rect1.setLength(100);
        Rect1.setWidth(150);
        System.out.println("Length: "+Rect1.getLength());
        System.out.println("Width: "+Rect1.getWidth());
        System.out.println("Perimeter :" + Rect1.getPerimeter());
        System.out.println("Surface :" + Rect1.getSurface());

        //===============================//

        Ellip1.setSemiAxisX(10);
        Ellip1.setSemiAxisY(2);
        System.out.println("SemiAxesX: " + Ellip1.getSemiAxisX());
        System.out.println("SemiAxesY: " + Ellip1.getSemiAxisY());
        System.out.println("Perimeter : " + Ellip1.getPerimeter());

        //===============================//

        Square  square1 = new Square(10, Color.ORANGE);
        System.out.println("L Square :" + square1.getX());*/

    }
}
