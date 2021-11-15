
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
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
    private  int Distance_x;
    private int Distance_y;
    int x_dragged;
    int y_dragged;
    int radio;

    public Graphics graphics;

    //=============GETTER=============//

    public Color getC() {
        return C;
    }
    public String getNameFigure() {
        return nameFigure;
    }
    public Figure getCurrent_Figure() {return Current_Figure;}
    public ArrayList<Figure> getList() {return list;}

    //=============SETTER=============//

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

    //=========DRAWING CONSTRUCTOR=========//

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

    //=================MOUSE-LISTENER IMPLEMENTATION================//

    @Override
    public void mousePressed(MouseEvent e) {
        this.x_pressed = e.getX();
        this.y_pressed = e.getY();
        radio = (int) Math.pow((Math.pow(Distance_x/2,2) + Math.pow(Distance_y/2,2)),0.5);

        System.out.println(this.x_pressed+" and " + this.y_pressed + " color =" + this.C);

        if (nameFigure.equals("Rectangle")){
            Rectangle rectangulo = new Rectangle(x_pressed, y_pressed, Distance_x, Distance_y, C);
            this.list.add(rectangulo);
            System.out.println(list);
        }
        if (nameFigure.equals("Ellipse")){
            Ellipse elipse = new Ellipse(x_pressed, y_pressed,Distance_x/2,Distance_y/2, C);
            this.list.add(elipse);
            System.out.println(list);
        }
        if (nameFigure.equals("Square")){
            Square cuadrado = new Square(x_pressed,  y_pressed, Distance_x, C);
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
        System.out.println(this.Distance_x+" and "+ this.Distance_y + " color =" + this.C);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        /*
        x_dragged = e.getX();
        y_dragged = e.getY();
        x_real = Math.abs(x_dragged-x_pressed);
        y_real = Math.abs(y_dragged-y_pressed);

        list.get(list.size()-1).setBoundingBox(x_real, y_real);
        this.repaint();*/

        x_dragged = e.getX();
        y_dragged = e.getY();
        //System.out.println("x:"+" "+ x_dragged+" y:"+y_dragged);
        Distance_x = x_dragged-x_pressed;
        Distance_y = y_dragged-y_pressed;
        //System.out.println("x:"+" "+ x_real+" y:"+y_real);

        if (Distance_x < 0){
            System.out.println(list.get(list.size()-1));
            list.get(list.size()-1).setOrigin(new Point(x_dragged, y_pressed));
        }
        if (Distance_y < 0){
            System.out.println(list.get(list.size()-1));
            list.get(list.size()-1).setOrigin(new Point(x_pressed, y_dragged));
        }
        if (Distance_y < 0 && Distance_x < 0){
            System.out.println(list.get(list.size()-1));
            list.get(list.size()-1).setOrigin(new Point(x_dragged, y_dragged));
        }
        list.get(list.size()-1).setBoundingBox(Math.abs(Distance_x), Math.abs(Distance_y));
        this.repaint();
    }

    // ============ UNDEFINED FEATURES======================//

    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    //=================FILE HANDLER IMPLEMENTATION======================//

    public void SaveDrawing() {
        FileOutputStream file;
        ObjectOutputStream out;

        try {
            file = new FileOutputStream(JOptionPane.showInputDialog(null, "save: "));
            out = new ObjectOutputStream(file);
            out.writeObject(this.list);
            out.close();
        }

        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void reset(){
        this.list.clear();
        this.repaint();

    }
    public void RecallDrawing() {
        FileInputStream file_in;
        ObjectInputStream in ;
        reset();
        try {
            file_in = new FileInputStream(JOptionPane.showInputDialog(null, "Open: "));
            in = new ObjectInputStream(file_in);
            this.list = (ArrayList<Figure>)  in.readObject();
            in.close();
            this.repaint();
        }

        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void ResetDrawing(Container contentPane) {
        contentPane.remove(this);
        this.getList().clear();
        contentPane.add(this);
        contentPane.revalidate();
        contentPane.repaint();
        contentPane.setBackground(Color.blue);
    }

}
