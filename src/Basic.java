import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Basic extends JPanel implements ActionListener
{

    private JLabel labelOper = new JLabel("0",SwingConstants.RIGHT);
    private JLabel labelRes = new JLabel("0",SwingConstants.RIGHT);
    private ArrayList<String> operations = new ArrayList<String>();
    private ArrayList<String> arith = new ArrayList<String>();
    GridBagConstraints c;

    private JButton n0 = new JButton("0");
    private JButton n1 = new JButton("1");
    private JButton n2 = new JButton("2");
    private JButton n3 = new JButton("3");
    private JButton n4 = new JButton("4");
    private JButton n5 = new JButton("5");
    private JButton n6 = new JButton("6");
    private JButton n7 = new JButton("7");
    private JButton n8 = new JButton("8");
    private JButton n9 = new JButton("9");
    private JButton dot = new JButton(".");

    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multiply = new JButton("*");
    private JButton devide = new JButton("/");
    private JButton percent = new JButton("%");
    private JButton invers = new JButton("+ -");
    private JButton clear = new JButton("Clear");
    private JButton ce = new JButton("CE");
    private JButton equal = new JButton("=");
    private JButton delet = new JButton("\u2190");


    public Basic()
    {
        super();

        setLayout(new BorderLayout());

        JPanel panelUp = new JPanel();
               panelUp.setLayout(new BorderLayout());

        JPanel panelDown = new JPanel();
               panelDown.setLayout(new GridBagLayout());

        c = new GridBagConstraints();

        panelUp.add(labelOper,BorderLayout.NORTH);
        panelUp.add(labelRes,BorderLayout.SOUTH);

        labelOper.setFont(new Font("Verdana", Font.PLAIN, 25));
        labelRes.setFont(new Font("Verdana", Font.PLAIN, 25));

        labelOper.setSize(300,400);


        //Lista de operatii aritmetice
        arith.add("*");
        arith.add("/");
        arith.add("%");
        arith.add("+");
        arith.add("-");

        //Adaugam primul zero
        operations.add("0");

        n0.addActionListener(this);
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);

        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        devide.addActionListener(this);
        percent.addActionListener(this);
        invers.addActionListener(this);
        clear.addActionListener(this);
        ce.addActionListener(this);
        equal.addActionListener(this);
        delet.addActionListener(this);
        dot.addActionListener(this);


        c.ipadx = 15;
        c.ipady = 15;
        c.insets = new Insets(1,1,1,1);

        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(delet,c);

        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(ce,c);

        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(clear,c);
//============================================== Primu rand
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(invers,c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(percent,c);

        c.gridx = 2;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(devide,c);

        c.gridx = 3;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(multiply,c);
//============================================== Al doilea rand
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n7,c);

        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n8,c);

        c.gridx = 2;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n9,c);

        c.gridx = 3;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(minus,c);
//============================================== Al treile rand

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n4,c);

        c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n5,c);

        c.gridx = 2;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n6,c);

        c.gridx = 3;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(plus,c);
//============================================== Al patrulea rand


        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n1,c);

        c.gridx = 1;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n2,c);

        c.gridx = 2;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n3,c);

        c.insets = new Insets(1,1,1,1); // Pentru a ridica randul de jos, putin mai sus.
        c.gridx = 3;
        c.gridy = 4;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(equal,c);
//============================================== Al patrulea rand


        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n0,c);

        c.gridx = 2;
        c.gridy = 5;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(dot,c);

//============================================== Al patrulea rand


        add(panelUp, BorderLayout.NORTH);
        add(panelDown, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String name = ((JButton)e.getSource()).getActionCommand(); // extragem textul butonului

        if(e.getSource() == equal)
        {
            labelRes.setText(calulation(operations));
            return;
        }

        if(e.getSource() == delet)
        {
            if(operations.size() > 1)
            {
                operations.remove(operations.size() - 1);
                labelOper.setText(getText(operations));
            }
            else
            {
                operations.set(0,"0");
                labelOper.setText(getText(operations));
            }

            labelOper.setFont(new Font("Verdana",0,getSize(operations)));
            labelRes.setFont(new Font("Verdana",0,getSize(operations)));

            return;
        }

        if (e.getSource() == ce)
        {
            labelRes.setText("0");
            return;
        }

        if(e.getSource() == clear)
        {
            operations.removeAll(operations);
            operations.add("0");
            labelOper.setText("0");
            labelRes.setText("0");

            labelOper.setFont(new Font("Verdana",0,getSize(operations)));
            labelRes.setFont(new Font("Verdana",0,getSize(operations)));

            return;
        }

        if(e.getSource() == invers)
        {
            int ultima = operations.size()-1;
            int position = 0;

            for(int i=0;i<operations.size();i++)
            {
                if(isOperation(operations.get(i)))
                {
                    position = i;
                }
            }


            if(position == 0)
            {
                if(operations.get(position).equals("i"))
                {
                    operations.remove(position);
                }
                else
                {
                    operations.add(position, "i");
                }
            }
            else
            {
                if(operations.get(position+1).equals("i"))
                {
                    operations.remove(position+1);
                }
                else
                {
                    operations.add(position+1, "i");
                }

            }

            labelOper.setText(getText(operations));

            return;

        }

        if(!(e.getSource() == clear || e.getSource() == ce || e.getSource() == delet || e.getSource() == equal
             || e.getSource() == invers)) // Verificam daca ii operatie sau numar
        {

            if(isOperation(name) && operations.size() > 0)
            {

                int ultima = operations.size()-1;

                if(isOperation(operations.get(ultima)))   // daca-i operatie
                {
                    operations.set(ultima,name);
                    labelOper.setText(getText(operations));

                }
                else // daca-i numar
                {
                    operations.add(name); // Adaugam cifra in lista
                    labelOper.setText(getText(operations)); // Setam textul label-ului cu operatii
                }
                return;
            }

            operations.add(name);

            if (labelOper.getText().length() < 22) // Ca sa nu iasa inafara ferestrei
            {
                if (labelOper.getText().equals("0"))
                {
                    operations.remove(0);
                    labelOper.setText(getText(operations));
                }
                    else
                {

                    labelOper.setText(getText(operations));
                }
            }

            labelOper.setFont(new Font("Verdana",0,getSize(operations)));
            labelRes.setFont(new Font("Verdana",0,getSize(operations)));

            return;
        }


    }

    public ArrayList<String> changeIToMinus(ArrayList<String> list) {

        String value = "";

        for (int i = 0; i < list.size(); i++)
        {
            value = list.get(i);

            if (value.contains("i"))
            {
                value = value.replace("i", "-");
                list.set(i,value);
            }
        }

        return list;
    }

    public int getSize(ArrayList<String> list)
    {
        int size = 0;

        if(list.size()>14)
        {
            size = 18;
        }
        else
        {
            size = 25;
        }

        return size;
    }

    public String calulation(ArrayList<String> list)
    {
        ArrayList<String> sir  = new ArrayList<String>();

        list = convertTo(list); // Converteste in float
        list = changeIToMinus(list); // Schimba semnul numarului

        float left = 0;
        float right = 0;
        float result = 0;


        for(int i=0;i<arith.size();i++)
        {
            for (int j = 0; j < list.size(); j++)
            {

                if (arith.get(i).equals(list.get(j)) && (arith.get(i).equals("*") || arith.get(i).equals("/")))
                {
                    if(list.get(j).equals("*"))
                    {
                        left = Float.parseFloat(list.get(j-1));
                        right = Float.parseFloat(list.get(j+1));
                        result = left * right;

                        list.set(j,result+"");
                        list.remove(j+1);
                        list.remove(j-1);
                        j--;
                    }
                    else if(list.get(j).equals("/"))
                    {
                        left = Float.parseFloat(list.get(j-1));
                        right = Float.parseFloat(list.get(j+1));
                        result = left / right;

                        list.set(j,result+"");
                        list.remove(j+1);
                        list.remove(j-1);
                        j--;
                    }
                }
            }

            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(j).equals("+")) {
                    left = Float.parseFloat(list.get(j - 1));
                    right = Float.parseFloat(list.get(j + 1));
                    result = left + right;

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                } else if (list.get(j).equals("-")) {
                    left = Float.parseFloat(list.get(j - 1));
                    right = Float.parseFloat(list.get(j + 1));
                    result = (left - right);

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                }
            }

        }


        if(Math.round(Float.parseFloat(list.get(0))) == Float.parseFloat(list.get(0)))
        {
             return Math.round(Float.parseFloat(list.get(0)))+"";
        }
        else
        {
            return list.get(0);
        }
    }

    public ArrayList<String> convertTo(ArrayList<String> list)
    {
        ArrayList<String> finish = new ArrayList<String>();

        String result = ""; // Stocheaza numarul
        int position = 0; // Salveaza pozitia ultemei operatii intalnite


        if(isOperation(list.get(list.size()-1)))
        {
            list.remove(list.size()-1);
        }


        for(int i=0;i<list.size();i++)
        {
            if(isOperation(list.get(i)) || i == 0)
            {
                if(isOperation(list.get(i)))
                finish.add(list.get(i));

                position = i==0 ? i : i+1;

                for(int j=position;j<list.size() && !isOperation(list.get(j));j++)
                {
                    result+=list.get(j);
                }

                finish.add(result);
            }
            result = "";
        }

        list = finish;

        return list;
    }

    public Boolean isOperation(String oper)
    {
        for(String op: arith)
        {
            if(op.equals(oper))
            {
                return true;
            }
        }

        return false;
    }

    public static String getText(ArrayList<String> list)
    {
        String result = "";

        for(String ls:list)
        {

            result += ls.equals("i")?"-":ls;
        }
        return result;
    }

}
