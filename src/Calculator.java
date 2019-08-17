import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
    private JFrame frame;

    private JPanel Panebasic = new JPanel();
    private JPanel Panelsciencific = new JPanel();
    private JPanel Panelprogrammer = new JPanel();

    private MenuItem Itemexit,Itemabout,Itembasic,Itemscience,Itemprogrammer;

    Basic basic = new Basic();
    Scientific scientific = new Scientific();
    Programmer programmer = new Programmer();

    public Calculator()
    {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panebasic.add(basic,BorderLayout.CENTER);
        Panelsciencific.add(scientific,BorderLayout.CENTER);
        Panelprogrammer.add(programmer,BorderLayout.CENTER);


        //Menu
        MenuBar menuBar = new MenuBar();

        Menu fisier = new Menu (" File ");
        Itemexit = new MenuItem("Exit");
        Itemabout = new MenuItem("Help");

        Menu tipuri = new Menu(" Calculator ");
        Itembasic = new MenuItem("Basic");
        Itemscience = new MenuItem("Scientific");
        Itemprogrammer = new MenuItem("Programmer");

        Itemexit.addActionListener(this);
        Itemabout.addActionListener(this);
        Itembasic.addActionListener(this);
        Itemscience.addActionListener(this);
        Itemprogrammer.addActionListener(this);

        fisier.add(Itemexit);
        fisier.add(Itemabout);
        tipuri.add(Itembasic);
        tipuri.add(Itemscience);
        tipuri.add(Itemprogrammer);

        menuBar.add(fisier);
        menuBar.add(tipuri);
        frame.setMenuBar(menuBar);

        frame.setContentPane(Panebasic);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
    }

    public static void main(String[] args)
    {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource() == Itemexit)
        {
            System.exit(1);
        }
        else if(e.getSource() == Itemabout)
        {
           new Help();
        }

        else if(e.getSource() == Itembasic)
        {
            frame.setContentPane(Panebasic);
            frame.pack();
            frame.setVisible(true);
        }
        else if(e.getSource() == Itemscience)
        {
            frame.setContentPane(Panelsciencific);
            frame.pack();
            frame.setVisible(true);
        }
        else if(e.getSource() == Itemprogrammer)
        {
            frame.setContentPane(Panelprogrammer);
            frame.pack();
            frame.setVisible(true);
        }
    }

}
