import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Scientific extends JPanel implements ActionListener
{
    private JLabel labelOper = new JLabel("0",SwingConstants.RIGHT);
    private JLabel labelRes = new JLabel("0",SwingConstants.RIGHT);

    private ArrayList<String> arith = new ArrayList<String>();
    private ArrayList<String> operations = new ArrayList<String>();

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
    private JButton sin = new JButton("sin");
    private JButton cos = new JButton("cos");
    private JButton tan = new JButton("tan");
    private JButton xn = new JButton("Xn");
    private JButton parL = new JButton("(");
    private JButton parR = new JButton(")");
    private JButton sqrt = new JButton("\u221A");
    private JButton x10n = new JButton("X10n");
    private JButton x2 = new JButton("X2");
    private JButton dot = new JButton(".");

    private JPanel panelUp = new JPanel();
    private JPanel panelDown = new JPanel();

    public Scientific()
    {
        super();
        setLayout(new BorderLayout());

        operations.add("0");

        panelUp.setLayout(new BorderLayout());
        panelDown.setLayout(new GridBagLayout());
        panelUp.add(labelOper,BorderLayout.NORTH);
        panelUp.add(labelRes,BorderLayout.CENTER);

        labelOper.setFont(new Font("Verdana", Font.PLAIN, 25));
        labelRes.setFont(new Font("Verdana", Font.PLAIN, 25));

        //Lista de operatii aritmetice
        arith.add("*");
        arith.add("/");
        arith.add("%");
        arith.add("+");
        arith.add("-");


        //Setam evenimentele
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
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        xn.addActionListener(this);
        parL.addActionListener(this);
        parR.addActionListener(this);
        sqrt.addActionListener(this);
        x10n.addActionListener(this);
        x2.addActionListener(this);

        GridBagConstraints c = new GridBagConstraints();

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
        panelDown.add(sin,c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(cos,c);

        c.gridx = 2;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(tan,c);

        c.gridx = 3;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(xn,c);
//============================================== Al doilea rand
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(parL,c);

        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(parR,c);

        c.gridx = 2;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(sqrt,c);

        c.gridx = 3;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(devide,c);
//============================================== Al treile rand

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(invers,c);

        c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(x10n,c);

        c.gridx = 2;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(x2,c);

        c.gridx = 3;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(multiply,c);
//============================================== Al patrulea rand


        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n7,c);

        c.gridx = 1;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n8,c);

        c.gridx = 2;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n9,c);

        c.gridx = 3;
        c.gridy = 4;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(minus,c);
//============================================== Al patrulea rand

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n4,c);

        c.gridx = 1;
        c.gridy = 5;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n5,c);

        c.gridx = 2;
        c.gridy = 5;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n6,c);

        c.gridx = 3;
        c.gridy = 5;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(plus,c);
//============================================== Al cincilea rand

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n1,c);

        c.gridx = 1;
        c.gridy = 6;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n2,c);

        c.gridx = 2;
        c.gridy = 6;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n3,c);


        c.gridx = 3;
        c.gridy = 6;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(equal,c);
//============================================== Al saselea rand
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n0,c);

        c.gridx = 2;
        c.gridy = 7;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(dot,c);

//============================================== Al patrulea rand

        add(panelUp, BorderLayout.NORTH);
        add(panelDown, BorderLayout.CENTER);


    }

    public void actionPerformed(ActionEvent e)
    {

        String name = ((JButton)e.getSource()).getActionCommand(); // extragem textul butonului

        if(e.getSource() == equal) // Returneaza rezultatul calculului
        {
            labelRes.setText(calulation(operations));

            return;
        }

        if(e.getSource() == delet) // Sterge ultimul caracter
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

        if (e.getSource() == ce) // Sterge rezultatul calculului
        {
            labelRes.setText("0");
            return;
        }

        if(e.getSource() == clear) // Sterge rezultatul calculului si linia cu operatii
        {
            operations.removeAll(operations);
            operations.add("0");
            labelOper.setText("0");
            labelRes.setText("0");

            labelOper.setFont(new Font("Verdana",0,getSize(operations)));
            labelRes.setFont(new Font("Verdana",0,getSize(operations)));

            return;
        }


        if(e.getSource() == sin || e.getSource() == cos || e.getSource() == tan || e.getSource() == sqrt || e.getSource() == invers)
        {
            oper(e.getActionCommand());
            return;
        }
        if(e.getSource() == xn || e.getSource() == x2 || e.getSource() == x10n)
        {
            if(e.getSource() == x2)
            {
                operations.add("X2");
            }
            else if(e.getSource() == xn)
            {
                operations.add(xn.getActionCommand());
            }
            else if(e.getSource() == x10n)
            {
                operations.add("*");
                operations.add(x10n.getActionCommand());
            }

            labelOper.setText(getText(operations));
            return;
        }

        if(!(e.getSource() == clear || e.getSource() == ce || e.getSource() == delet || e.getSource() == equal
                || e.getSource() == invers)) // Verificam daca ii operatie sau numar
        {
            int ultima = operations.size()-1;

            if(isOperation(name) && operations.size() > 0)
            {
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
            labelRes.setFont(new Font("Verdana", 0, getSize(operations)));
            return;
        }


    }


    public void oper(String name)
    {
        int ultima = operations.size()-1;
        int position = 0;

        name = name.equals("+ -")?"inv":name;

        for(int i=0;i<operations.size();i++)
        {
            if(isOperation(operations.get(i)))
            {
                position = i;
            }
        }

        if(position == 0)
        {
            if(operations.get(position).equals(name))
            {
                operations.remove(position);
            }
            else
            {
                operations.add(position,name);
            }
        }
        else
        {
            try
            {
                if (operations.get(position+1).equals(name))
                {
                    operations.remove(position+1);
                }
                    else
                {
                    operations.add(position+1, name);
                }
            }
            catch (IndexOutOfBoundsException e)
            {

            }
        }
        labelOper.setText(getText(operations));

    }

    public ArrayList<String> changeIT(ArrayList<String> list) {

        String value = "";

        for (int i = 0; i < list.size(); i++)
        {
            value = list.get(i);

            if (value.contains("inv"))
            {
                value = value.replace("inv", "-");
                list.set(i,value);
                continue;
            }
            else
            if(value.contains("X2"))
            {
                value = value.replace("X2","^2");
                list.set(i,value);
                continue;
            }
            else
            if(value.contains("Xn"))
            {
                value = value.replace("Xn","^");
                list.set(i,value);
                continue;
            }
            else if(value.contains("X10n"))
            {
                value = value.replace("X10n","10^");
                list.set(i,value);
                continue;
            }

        }

        return list;
    } // schimba un substring in altul

    public int getSize(ArrayList<String> list) //returneaza marimea textului
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

    public String calulation(ArrayList<String> list) // efectuiaza calculele
    {
        ArrayList<String> sir  = new ArrayList<String>();

        list = convertTo(list); // Converteste in float
        list = ExcludParanteze(list);
        list = changeIT(list); // Schimba semnul numarului
               atithmetic(list);




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

    public ArrayList<String> trim(ArrayList<String> list)
    {
        if(isOperation(list.get(list.size()-1)))
        {
            list.remove(list.size()-1);
            labelOper.setText(getText(list));
        }

        return list;
    }

    public ArrayList<String> convertTo(ArrayList<String> list) //Converteste numerele din "operations" intr-un singur numar
    {
        ArrayList<String> finish = new ArrayList<String>();

        String result = ""; // Stocheaza numarul
        int position = 0; // Salveaza pozitia ultemei operatii intalnite

        list = trim(list); // Daca ultimul caracter este operatie, il sterge

        for(int i=0;i<list.size();i++)
        {
            if((isOperation(list.get(i)) || i == 0))
            {
                if(isOperation(list.get(i)))
                    finish.add(list.get(i));

                position = i==0 ? i : i+1;

                for(int j=position;j<list.size() && !isOperation(list.get(j));j++)
                {
                    if(list.get(j).equals("("))
                    {
                        finish.add(list.get(j));
                        continue;
                    }
                    else if(list.get(j).equals(")"))
                    {
                        if(j == list.size()-1)
                        {
                            finish.add(result);
                                       result = "";
                            finish.add(list.get(j));
                            break;
                        }
                        finish.add(result);
                        finish.add(list.get(j));
                        result = "";
                        continue;
                    }
                    result+=list.get(j);
                }


                if(!result.isEmpty())
                {
                    finish.add(result);
                }
                result = "";


            }

        }

        list = finish;

        return list;
    }

    public Boolean isOperation(String oper) // verifica daca un caracter este operatie
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

    public static String getText(ArrayList<String> list) // returneaza textul din lista - operations
    {
        String result = "";

        for(String ls:list)
        {
            if(ls.equals("inv"))
            {
                result+= "-";
            }
            else if(ls.equals("X2"))
            {
                result+="^2";
            }
            else if(ls.equals("Xn"))
            {
                result+= "^";
            }
            else if(ls.equals("X10n"))
            {
                result+= "10^";
            }
            else
            {
                result+= ls;
            }

        }
        return result;
    }

    public ArrayList<String> atithmetic(ArrayList<String> list) {

        String str = "";

        for(int i=0;i<list.size();i++)
        {
            str = list.get(i);
                  if (str.startsWith("sin"))
            {
                      str = Math.sin(Double.parseDouble(str.substring(3)))+"";
            }
                  else if (str.startsWith("cos"))
            {
                      str = Math.cos(Double.parseDouble(str.substring(3)))+"";
            }
                  else if (str.startsWith("tan"))
            {
                      str = Math.tan(Double.parseDouble(str.substring(3)))+"";
            }
                  else if(str.startsWith("√"))
            {
                      str = Math.sqrt(Double.parseDouble(str.substring(1)))+"";
            }
                  else if(str.contains("^"))
            {

                    String nr[] = str.split("\\^");
                    str = Math.pow(Double.parseDouble(nr[0]),Double.parseDouble(nr[1]))+"";
            }

            list.set(i,str);
        }

        return list;
    } // sin,cos,tan,Xn,X2

    public ArrayList<String> ExcludParanteze(ArrayList<String> list)
    {
        int position = 0;
        String value = "";
        ArrayList<String> quik = new ArrayList<String>();


         for(int i=0;i<list.size();i++)
         {
            value = list.get(i);

             if (value.equals("("))
             {
                position = i;
             }
             else  if(value.equals(")"))
             {

                 for(int j=position+1;j<i;j++)
                 {
                    quik.add(list.get(j));
                 }

                 list.set(position,calulation(quik));

                 for(int j=position+1;j<=i;j++)
                 {
                    list.remove(position+1);
                 }

                 position = 0;
                 i = 0;
             }
             quik.removeAll(quik);
         }

        return list;
    }
}
