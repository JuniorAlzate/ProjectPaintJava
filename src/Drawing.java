
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Drawing extends JPanel implements MouseListener, MouseMotionListener {

    private Color C;
    private String nameFigure;
    private Figure Current_Figure;
    private ArrayList<Figure> list = new ArrayList<Figure>();
    private int x_pressed;
    private int y_pressed;
    private int x_releassed;
    private int y_releassed;
    private  int x_real;
    private int y_real;
    int x_dragged;
    int y_dragged;
    int radio;

    public Graphics graphics;

    public Color getC() {
        return C;
    }
    public String getNameFigure() {
        return nameFigure;
    }
    public Figure getCurrent_Figure() {return Current_Figure;}

    public void setC(Color c) {
        C = c;
    }
    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
    public void setCurrent_Figure(Figure current_Figure) {Current_Figure = current_Figure;}
    public void setName(String name){
        this.nameFigure = name;
    }

    public Drawing(Color color){
        super();
        addMouseMotionListener(this);
        addMouseListener(this);
        this.C = color;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.white);
       for(Figure f : list){
           f.Draw(graphics);
       }
    }

//=====================Mouse listener implementation===========
    @Override
    public void mousePressed(MouseEvent e) {
        this.x_pressed = e.getX();
        this.y_pressed = e.getY();
        radio = (int) Math.pow((Math.pow(x_real/2,2)+Math.pow(y_real/2,2)),0.5);

        System.out.println(this.x_pressed+" et "+ this.y_pressed + " couleur =" + this.C);

        if (nameFigure.equals("Rectangle")){
            Rectangle rectangle0 = new Rectangle(x_pressed,y_pressed,x_real, y_real, C);
            this.list.add(rectangle0);
            System.out.println(list);
        }
        if (nameFigure.equals("Ellipse")){
            Ellipse ellipse0 = new Ellipse(x_pressed,y_pressed,x_real/2, y_real/2, C);
            this.list.add(ellipse0);
            System.out.println(list);
        }
        if (nameFigure.equals("Square")){
            Square cuadrado = new Square(x_pressed,  y_pressed, x_real, C);
            this.list.add(cuadrado);
            System.out.println(list);
        }
        if (nameFigure.equals("Circle")){
            Circle circulo = new Circle(x_pressed, y_pressed, C);
            this.list.add(circulo);
            System.out.println(list);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.x_releassed = e.getX();
        this.y_releassed = e.getY();
        System.out.println(this.x_real+" et "+ this.y_real + " couleur =" + this.C);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x_dragged = e.getX();
        y_dragged = e.getY();
        x_real = Math.abs(x_dragged-x_pressed);
        y_real = Math.abs(y_dragged-y_pressed);

        list.get(list.size()-1).setBoundingBox(x_real, y_real);
        this.repaint();
    }

    // ============ unused features============================//
    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

}
