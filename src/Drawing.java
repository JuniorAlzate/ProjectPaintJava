
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


    public ArrayList<Figure> getList() {return list;}

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
        x_real = x_dragged-x_pressed;
        y_real = y_dragged-y_pressed;
        //System.out.println("x:"+" "+ x_real+" y:"+y_real);

        if (x_real < 0){
            System.out.println(list.get(list.size()-1));
            list.get(list.size()-1).setOrigin(new Point(x_dragged, y_pressed));
        }
        if (y_real < 0){
            System.out.println(list.get(list.size()-1));
            list.get(list.size()-1).setOrigin(new Point(x_pressed, y_dragged));
        }
        if (y_real < 0 && x_real < 0){
            System.out.println(list.get(list.size()-1));
            list.get(list.size()-1).setOrigin(new Point(x_dragged, y_dragged));
        }
        list.get(list.size()-1).setBoundingBox(Math.abs(x_real), Math.abs(y_real));
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



    public void SaveDrawing(Drawing DEREF) {
        FileOutputStream file;
        ObjectOutputStream out;
        try {
            file = new FileOutputStream(JOptionPane.showInputDialog(null, "save: "));
            out = new ObjectOutputStream(file);
            out.writeObject(DEREF);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void RecallDrawing(Container contentPane, Drawing DEREF) {
        FileInputStream file_in;
        ObjectInputStream in ;
        //Drawing deref;
        //Container contentPane = getContentPane();
        contentPane.remove(DEREF);
        try {
            file_in = new FileInputStream(JOptionPane.showInputDialog(null, "Open: "));
            in = new ObjectInputStream(file_in);
            DEREF = (Drawing) in.readObject();
            in.close();
            contentPane.add(DEREF);
            contentPane.revalidate();
            contentPane.repaint();
            contentPane.setBackground(Color.black);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void Resett(Container contentPane) {
        contentPane.remove(this);
        this.getList().clear();
        contentPane.add(this);
        contentPane.revalidate();
        contentPane.repaint();
        contentPane.setBackground(Color.blue);

    }
}
