
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Window extends JFrame implements ActionListener {

    public Drawing draw;

    public Window(String Title,int x,int y)
    {
        super(Title);
        this.setSize(x,y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane() ;
        contentPanel.setLayout(null);

//============================DRAWING PANEL==================================//

    this.draw = new Drawing(Color.black);
    draw.setBounds(0,0,800,480);
    draw.setBackground(Color.white);

        this.draw.setNameFigure("Rectangle"); //Default figure and color
        this.draw.setC(Color.black);

//====================MENU BAR===========================//

        JMenuBar m = new JMenuBar();

        JMenu menu1= new JMenu("File");
        JMenu menu2 = new JMenu("About");

        JMenuItem New = new JMenuItem("New") ;
        New.addActionListener(this);

        JMenuItem Open = new JMenuItem("Open") ;
        Open.addActionListener(this);

        JMenuItem Save = new JMenuItem("Save") ;
        Save.addActionListener(this);

        JMenuItem Quit = new JMenuItem("Quit") ;
        Quit.addActionListener(this);

        JMenuItem Author = new JMenuItem("Author");
        Author.addActionListener(this);

        menu2.add(Author);
        menu1.add(New);
        menu1.add(Open);
        menu1.add(Save);
        menu1.add(Quit);

        m.add(menu1);
        m.add(menu2);

//====================PANEL FOR COLORS=========================================

        JButton black = new JButton("Black");
        black.addActionListener(this);
        black.setBackground(Color.black);
        black.setForeground(Color.white);

        JButton yellow = new JButton("Yellow");
        yellow.setBackground(Color.yellow);
        yellow.addActionListener(this);

        JButton red = new JButton("Red");
        red.setBackground(Color.red);
        red.addActionListener(this);

        JButton pink = new JButton("Pink");
        pink.setBackground(Color.pink);
        pink.addActionListener(this);

        JButton green = new JButton("Green");
        green.setBackground(Color.green);
        green.addActionListener(this);

        JButton cyan = new JButton("Cyan");
        cyan.setBackground(Color.cyan);
        cyan.addActionListener(this);

        JButton blue = new JButton("Blue");
        blue.setBackground(Color.blue);
        blue.addActionListener(this);

        JButton orange = new JButton("Orange");
        orange.setBackground(Color.orange);
        orange.addActionListener(this);


        JPanel PanelColors = new JPanel();
        PanelColors.setBounds(1,480,400,60);
        PanelColors.setLayout(new GridLayout(2,4));
        PanelColors.add(black);
        PanelColors.add(yellow);
        PanelColors.add(red);
        PanelColors.add(pink);
        PanelColors.add(green);
        PanelColors.add(cyan);
        PanelColors.add(blue);
        PanelColors.add(orange);

//=====================PANEL FOR FIGURES======================================

        JButton Ellipse = new JButton("Ellipse");
        Ellipse.addActionListener(this);

        JButton Rectangle = new JButton("Rectangle");
        Rectangle.addActionListener(this);

        JButton Circle = new JButton("Circle");
        Circle.addActionListener(this);

        JButton Square = new JButton("Square");
        Square.addActionListener(this);

        JPanel southPanel = new JPanel();
        southPanel.setBounds(400,480,400,60);
        southPanel.setLayout(new GridLayout(2,2));
        southPanel.add(Ellipse);
        southPanel.add(Rectangle);
        southPanel.add(Circle);
        southPanel.add(Square);

    //======================ADD PANELS==============================

        contentPanel.add(this.draw);
        contentPanel.add(PanelColors);
        contentPanel.add(southPanel);
        this.setJMenuBar(m);
        this.setVisible(true);
    }

    //======================COLOR IMPLEMENTATION==============================

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        Container contentPanel = this.getContentPane() ;

        switch (command) {
            case "Black":
                System.out.println("I've been clicked black!");
                this.draw.setC(Color.black);
                break;
            case "Red":
                System.out.println("I've been clicked red!");
                this.draw.setC(Color.red);
                break;
            case "Yellow":
                System.out.println("I've been clicked yellow!");
                this.draw.setC(Color.yellow);
                break;
            case "Cyan":
                System.out.println("I've been clicked Cyan!");
                this.draw.setC(Color.cyan);
                break;
            case "Blue":
                System.out.println("I've been clicked blue!");
                this.draw.setC(Color.blue);
                break;
            case "Green":
                System.out.println("I've been clicked green!");
                this.draw.setC(Color.green);
                break;
            case "Orange":
                System.out.println("I've been clicked orange!");
                this.draw.setC(Color.orange);
                break;
            case "Pink":
                System.out.println("I've been clicked orange!");
                this. draw.setC(Color.pink);
                break;

    //======================FIGURE IMPLEMENTATION==============================

            case "Ellipse":
                System.out.println("I've been clicked ellipse!");
                this.draw.setNameFigure("Ellipse");
                break;

            case "Rectangle":
                System.out.println("I've been clicked rectangle!");
                this.draw.setNameFigure("Rectangle");
                break;

            case "Square":
                System.out.println("I've been clicked square!");
                this.draw.setNameFigure("Square");
                break;

            case "Circle":
                System.out.println("I've been clicked circle!");
                this.draw.setNameFigure("Circle");
                break;

    //======================FILE HANDLER IMPLEMENTATION==============================//

            case "New":
                draw.ResetDrawing();
                repaint();
                break;
            case "Save":
                draw.SaveDrawing();
                break;
            case "Open":
                draw.RecallDrawing();
                break;
            case "Quit":
                draw.ResetDrawing();
                dispose();
                break;

            case "Author":
                JOptionPane info = new JOptionPane();
                JOptionPane.showInternalMessageDialog( info, "Paint by Junior Elian ALZATE MORERA",
                        "Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
