import java.awt.*;

public class TestSwing {

    public static void main(String[] args) {

//  ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===//
                //============TEST PROJECT===========//
//  ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===   ===//

        Window win = new Window("Paint", 800, 600);

        /* ============TEST CLASS POINT===========//

       Point punto1 = new Point();
       System.out.println(punto1.toString());
       Point punto2 = new Point(10, 20);
       System.out.println(punto2.toString());*/

        /* ============TEST CLASS RECTANGLE===========//

        /*Rectangle Rect1 = new Rectangle(10,20,80,50 Color.BLUE);
        System.out.println("||lenght: " + Rect1.getLength() + "||widht: " + Rect1.getWidth() + "||Color: " + Rect1.getC());
        System.out.println(Rect1.getPerimeter());*/

         /*============TEST CLASS ELLIPSE===========//

        Ellipse Elip0 = new Ellipse(10,5, Color.BLUE);
        System.out.println("X: " + Elip0.getSemiAxisX() + "||Y: " + Elip0.getSemiAxisY() + "||Color: " + Elip0.getC());

        //=============CHANGE RECTANGLE PARAMETERS================//

        Rect1.setLength(100);
        Rect1.setWidth(150);
        System.out.println("Length: "+Rect1.getLength());
        System.out.println("Width: "+Rect1.getWidth());
        System.out.println("Perimeter :" + Rect1.getPerimeter());
        System.out.println("Surface :" + Rect1.getSurface());

        //===============CHANGE ELLIPSE PARAMETERS================//

        Elip0.setSemiAxisX(100);
        Elip0.setSemiAxisY(50);
        System.out.println("SemiAxesX: " + Elip0.getSemiAxisX());
        System.out.println("SemiAxesY: " + Elip0.getSemiAxisY());
        System.out.println("Perimeter : " + Elip0.getPerimeter());

        //==============TEST CLASS SQUARE=================*/

        /*Square  square0 = new Square(10,10,50, Color.RED);
        System.out.println("L Square :" + square0.getLength() + " and " + "it's surface: " + square0.getSurface());*/

        //==============TEST CLASS CIRCLE=================*/

       /* Circle circle0 = new Circle(10,10,50, Color.green);
        System.out.println("circle radio:" + circle0.getSemiAxisX() + "it's surface: " + circle0.getSurface());
        System.out.println("circle perimeter:" + circle0.getPerimeter());*/
    }
}
