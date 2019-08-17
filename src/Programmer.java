import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.StringReader;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory.*;
import javax.swing.border.LineBorder;

public class Programmer extends JPanel implements ActionListener {
    private ArrayList<String> sisteme = new ArrayList<String>();
    private ArrayList<String> operations = new ArrayList<String>();
    private ArrayList<String> arith = new ArrayList<String>();

    String sistemAles ;

    private JLabel NlabelHex = new JLabel("Hex", SwingConstants.LEFT);
    private JLabel NlabelDec = new JLabel("Dec", SwingConstants.LEFT);
    private JLabel NlabelOct = new JLabel("Oct", SwingConstants.LEFT);
    private JLabel NlabelBin = new JLabel("Bin", SwingConstants.LEFT);

    private JLabel labelDec = new JLabel("0", SwingConstants.RIGHT);
    private JLabel labelHex = new JLabel("0", SwingConstants.RIGHT);
    private JLabel labelOct = new JLabel("0", SwingConstants.RIGHT);
    private JLabel labelBin = new JLabel("0", SwingConstants.RIGHT);

    JPanel panelUp;

    JPanel panelDown;

    JButton n0;
    JButton n1;
    JButton n2;
    JButton n3;
    JButton n4;
    JButton n5;
    JButton n6;
    JButton n7;
    JButton n8;
    JButton n9;
    JButton a;
    JButton b;
    JButton ce;
    JButton d;
    JButton e;
    JButton f;


    JButton dec;
    JButton hex;
    JButton oct;
    JButton bin;

    JButton plus;
    JButton minus;
    JButton multiply;
    JButton devide;
    JButton not;
    JButton xor;
    JButton or;
    JButton and;
    JButton delet;
    JButton clear;


    GridBagConstraints c;


    public Programmer() {
        super();
        setLayout(new BorderLayout());

        panelUp = new JPanel();
        panelUp.setLayout(new GridLayout(4, 2));

        panelDown = new JPanel();
        panelDown.setLayout(new GridBagLayout());

        c = new GridBagConstraints();



        //Sistemele
        sisteme.add("DEC");
        sisteme.add("HEX");
        sisteme.add("OCT");
        sisteme.add("BIN");

        //Lista de operatii aritmetice
        arith.add("*");
        arith.add("/");
        arith.add("%");
        arith.add("+");
        arith.add("-");
        arith.add("AND");
        arith.add("OR");
        arith.add("XOR");
        arith.add("NOT");

        panelUp.add(NlabelHex, new GridLayout(1, 1));
        panelUp.add(labelHex, new GridLayout(1, 2));
        panelUp.add(NlabelDec, new GridLayout(2, 1));
        panelUp.add(labelDec, new GridLayout(2, 2));
        panelUp.add(NlabelOct, new GridLayout(3, 1));
        panelUp.add(labelOct, new GridLayout(3, 2));
        panelUp.add(NlabelBin, new GridLayout(4, 1));
        panelUp.add(labelBin, new GridLayout(4, 2));

        labelDec.setFont(new Font("Verdana", Font.PLAIN, 25));
        labelHex.setFont(new Font("Verdana", Font.PLAIN, 25));
        labelOct.setFont(new Font("Verdana", Font.PLAIN, 25));
        labelBin.setFont(new Font("Verdana", Font.PLAIN, 25));

        NlabelDec.setFont(new Font("Verdana", Font.PLAIN, 25));
        NlabelHex.setFont(new Font("Verdana", Font.PLAIN, 25));
        NlabelOct.setFont(new Font("Verdana", Font.PLAIN, 25));
        NlabelBin.setFont(new Font("Verdana", Font.PLAIN, 25));

        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        a = new JButton("A");
        b = new JButton("B");
        ce = new JButton("C");
        d = new JButton("D");
        e = new JButton("E");
        f = new JButton("F");

        dec = new JButton("DEC");
        hex = new JButton("HEX");
        oct = new JButton("OCT");
        bin = new JButton("BIN");

        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        devide = new JButton("/");
        not = new JButton("NOT");
        xor = new JButton("XOR");
        or = new JButton("OR");
        and = new JButton("AND");
        delet = new JButton("\u2190");
        clear = new JButton("Clear");

        buttons();

        hex.addActionListener(this);
        oct.addActionListener(this);
        bin.addActionListener(this);
        dec.addActionListener(this);

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
        a.addActionListener(this);
        b.addActionListener(this);
        ce.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);

        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        devide.addActionListener(this);
        not.addActionListener(this);
        xor.addActionListener(this);
        or.addActionListener(this);
        and.addActionListener(this);
        delet.addActionListener(this);
        clear.addActionListener(this);

        dec.doClick();

        add(panelUp, BorderLayout.NORTH);
        add(panelDown, BorderLayout.CENTER);
    }

    private void buttons() {

//============================================== Randul zero
        c.ipadx = 15;
        c.ipady = 15;
        c.insets = new Insets(1, 1, 1, 1);

        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(dec, c);

        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(hex, c);

        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(oct, c);

        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(bin, c);

        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(clear, c);
//============================================== Primu rand
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(delet, c);


//============================================== Al doilea rand

        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(f, c);

        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(e, c);

        c.gridx = 2;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(d, c);

        c.gridx = 3;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(ce, c);


        c.gridx = 4;
        c.gridy = 2;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(devide, c);

//============================================== Al treile rand


        c.gridx = 0;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n8, c);

        c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n9, c);

        c.gridx = 2;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(a, c);

        c.gridx = 3;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(b, c);


        c.gridx = 4;
        c.gridy = 3;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(multiply, c);

//============================================== Al patrulea rand
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n4, c);

        c.gridx = 1;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n5, c);

        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n6, c);

        c.gridx = 3;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n7, c);

        c.gridx = 4;
        c.gridy = 4;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(minus, c);


//============================================== Al cincilea rand


        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n0, c);

        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 5;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n1, c);

        c.gridx = 2;
        c.gridy = 5;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n2, c);

        c.gridx = 4;
        c.gridy = 5;
        c.fill = GridBagConstraints.BOTH;

        c.gridx = 3;
        c.gridy = 5;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(n3, c);


        c.gridx = 4;
        c.gridy = 5;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        panelDown.add(plus, c);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(e.getSource() == clear)
        {
            operations.removeAll(operations);
            setText(operations);
        }

        if(e.getSource() == delet)
        {
            operations = deleteLast(operations);
            setText(operations);
        }

        if (isSistem(command))
        {

            if (command.equals("HEX"))
            {
                sistemAles = command;
                setEnable();
                operations.removeAll(operations);
                setText(operations);

                setButtonBorder(hex);
                removeButtonBorder(dec);
                removeButtonBorder(oct);
                removeButtonBorder(bin);
            }
            else if (command.equals("DEC"))
            {
                sistemAles = command;
                setEnable();

                a.setEnabled(false);
                b.setEnabled(false);
                ce.setEnabled(false);
                d.setEnabled(false);
                this.e.setEnabled(false);
                f.setEnabled(false);

                operations.removeAll(operations);
                setText(operations);

                setButtonBorder(dec);
                removeButtonBorder(hex);
                removeButtonBorder(oct);
                removeButtonBorder(bin);

            }
            else if (command.equals("BIN"))
            {
                sistemAles = command;
                setEnable();

                a.setEnabled(false);
                b.setEnabled(false);
                ce.setEnabled(false);
                d.setEnabled(false);
                this.e.setEnabled(false);
                f.setEnabled(false);
                n2.setEnabled(false);
                n3.setEnabled(false);
                n4.setEnabled(false);
                n5.setEnabled(false);
                n6.setEnabled(false);
                n7.setEnabled(false);
                n8.setEnabled(false);
                n9.setEnabled(false);


                operations.removeAll(operations);
                setText(operations);

                setButtonBorder(bin);
                removeButtonBorder(hex);
                removeButtonBorder(oct);
                removeButtonBorder(dec);
            }
            else if (command.equals("OCT"))
            {
                sistemAles = command;
                setEnable();

                a.setEnabled(false);
                b.setEnabled(false);
                ce.setEnabled(false);
                d.setEnabled(false);
                this.e.setEnabled(false);
                f.setEnabled(false);
                n8.setEnabled(false);
                n9.setEnabled(false);

                operations.removeAll(operations);
                setText(operations);

                setButtonBorder(oct);
                removeButtonBorder(hex);
                removeButtonBorder(dec);
                removeButtonBorder(bin);
            }

            return;
        }

        if (isOperation(command))
        {
            if(operations.size() > 0)
            {
                int ultima = operations.size() - 1;

                    if (isOperation(operations.get(ultima)))
                    {
                        operations.set(ultima, command);
                    }
                      else
                    {
                        operations.add(command);
                    }

                setText(operations);
            }

            return;
        }

        if (!isOperation(command) && !isSistem(command) && e.getSource() != clear && e.getSource() != delet)
        {
            operations.add(command);

            setText(operations);
            return;
        }

    }

    private ArrayList<String> deleteLast(ArrayList<String> list)
    {
        int ultim = list.size()-1;

        if(ultim>-1)
        {
            list.remove(ultim);
        }

        return list;
    }

    private String calulation(ArrayList<String> list) // efectuiaza calculele
    {
        ArrayList<String> sir  = new ArrayList<String>();

        list = convertTo(list); // Converteste in float

        float left = 0;
        float right = 0;
        String result = "";


        if(sistemAles.equals("HEX"))
        {
            result = calcHex(list);
        }
        else if(sistemAles.equals("DEC"))
        {
            result = calcDec(list);
        }
        else if(sistemAles.equals("OCT"))
        {
            result = calcOct(list);
        }
        else if(sistemAles.equals("BIN"))
        {
            result = calcBin(list);
        }

        return result;
    }

    private String calcDec(ArrayList<String> list)
    {
        ArrayList<String> sir  = new ArrayList<String>();

        list = convertTo(list); // Converteste in float

        int left = 0;
        int right = 0;
        int result = 0;

        for (int i = 0; i < arith.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                if (arith.get(i).equals(list.get(j)) && (arith.get(i).equals("*") || arith.get(i).equals("/"))) {
                    if (list.get(j).equals("*")) {
                        left = Integer.parseInt(list.get(j - 1));
                        right = Integer.parseInt(list.get(j + 1));
                        result = left * right;

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    } else if (list.get(j).equals("/")) {
                        left = Integer.parseInt(list.get(j - 1));
                        right = Integer.parseInt(list.get(j + 1));
                        result = left / right;

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    }
                }
            }

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals("+")) {
                    left = Integer.parseInt(list.get(j - 1));
                    right = Integer.parseInt(list.get(j + 1));
                    result = left + right;

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                } else if (list.get(j).equals("-")) {
                    left = Integer.parseInt(list.get(j - 1));
                    right = Integer.parseInt(list.get(j + 1));
                    result = (left - right);

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                }
            }

        }

        return list.get(0);
    }

    private String calcHex(ArrayList<String> list)
    {


        ArrayList<String> sir  = new ArrayList<String>();

        list = convertTo(list); // Converteste in float

        int left = 0;
        int right = 0;
        int result = 0;
        boolean containOperation = false;

        for (int i = 0; i < arith.size(); i++)
        {
            for (int j = 0; j < list.size(); j++)
            {

                if (arith.get(i).equals(list.get(j)) && (arith.get(i).equals("*") || arith.get(i).equals("/"))) {
                    if (list.get(j).equals("*"))
                    {
                        containOperation = true;
                        left = Integer.parseInt(list.get(j - 1),16);
                        right = Integer.parseInt(list.get(j + 1),16);
                        result = left * right;

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    }
                    else if (list.get(j).equals("/"))
                    {
                        containOperation = true;
                        left = Integer.parseInt(list.get(j - 1),16);
                        right = Integer.parseInt(list.get(j + 1),16);
                        result = left / right;

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    }
                }
            }

            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(j).equals("+"))
                {
                    containOperation = true;
                    left = Integer.parseInt(list.get(j - 1),16);
                    right = Integer.parseInt(list.get(j + 1),16);
                    result = left + right;

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                }
                else if (list.get(j).equals("-"))
                {
                    containOperation = true;
                    left = Integer.parseInt(list.get(j - 1),16);
                    right = Integer.parseInt(list.get(j + 1),16);
                    result = (left - right);

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                }
            }

        }

        if(containOperation)
        {
            return Integer.parseInt(list.get(0)) + "";
        }
        else
        {
            return Integer.parseInt(list.get(0),16) + "";
        }
    }

    private String calcOct(ArrayList<String> list)
    {


        ArrayList<String> sir  = new ArrayList<String>();

        list = convertTo(list); // Converteste in float

        int left = 0;
        int right = 0;
        int result = 0;
        boolean containOpertaion = false;

        for (int i = 0; i < arith.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                if (arith.get(i).equals(list.get(j)) && (arith.get(i).equals("*") || arith.get(i).equals("/"))) {
                    if (list.get(j).equals("*"))
                    {
                        containOpertaion = true;
                        left = Integer.parseInt(list.get(j - 1));
                        right = Integer.parseInt(list.get(j + 1));
                        result = left * right;

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    } else if (list.get(j).equals("/"))
                    {
                        containOpertaion = true;
                        left = Integer.parseInt(list.get(j - 1));
                        right = Integer.parseInt(list.get(j + 1));
                        result = left / right;

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    }
                }
            }

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals("+"))
                {
                    containOpertaion = true;
                    left = Integer.parseInt(list.get(j - 1));
                    right = Integer.parseInt(list.get(j + 1));
                    result = left + right;

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                } else if (list.get(j).equals("-"))
                {
                    containOpertaion = true;
                    left = Integer.parseInt(list.get(j - 1));
                    right = Integer.parseInt(list.get(j + 1));
                    result = (left - right);

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                }
            }

        }

        if(containOpertaion)
        {
            return Integer.parseInt(list.get(0))+"";
        }
        else
        return Integer.parseInt(list.get(0),8)+"";

    }

    private String calcBin(ArrayList<String> list)
    {


        ArrayList<String> sir  = new ArrayList<String>();

        list = convertTo(list); // Converteste in float

        String left = "";
        String right = "";
        int result = 0;

        for (int i = 0; i < arith.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                if (arith.get(i).equals(list.get(j)) && (arith.get(i).equals("*") || arith.get(i).equals("/"))) {
                    if (list.get(j).equals("*")) {
                        left = list.get(j - 1);
                        right = list.get(j + 1);

                        result = multiplyBIn(left, right);

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    }
                    else if (list.get(j).equals("/"))
                    {
                        left = list.get(j - 1);
                        right = list.get(j + 1);

                        result = devideBin(left , right);

                        list.set(j, result + "");
                        list.remove(j + 1);
                        list.remove(j - 1);
                        j--;
                    }
                }
            }

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals("+")) {
                    left = list.get(j - 1);
                    right = list.get(j + 1);


                    result = plusBin(left,right);

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                } else if (list.get(j).equals("-")) {
                    left = list.get(j - 1);
                    right = list.get(j + 1);

                    result = minusBin(left,right);

                    list.set(j, result + "");
                    list.remove(j + 1);
                    list.remove(j - 1);
                    j--;
                }
            }

        }

        return list.get(0);
    }

    private int plusBin(String left,String right)
    {

        int a = Integer.parseInt(left,2);
        int b = Integer.parseInt(right,2);
        String result = "";

        int dec = a+b;

        ArrayList<String> bin = new ArrayList<>();
        while(true)
        {
            if(dec % 2 == 0)
            {
                bin.add(0,"0");
            }
            else
            {
                bin.add(0,"1");
            }

            dec = dec / 2;
            if(dec == 0)
            {
                break;
            }

        }

        for(String str:bin)
        {
            result+= str;
        }

        return Integer.parseInt(result);

    }

    private int minusBin(String left,String right)
    {


        int a = Integer.parseInt(left,2);
        int b = Integer.parseInt(right,2);
        String result = "";

        int dec = a-b;

        ArrayList<String> bin = new ArrayList<>();
        while(true)
        {
            if(dec % 2 == 0)
            {
                bin.add(0,"0");
            }
            else
            {
                bin.add(0,"1");
            }

            dec = dec / 2;
            if(dec == 0)
            {
                break;
            }

        }

        for(String str:bin)
        {
            result+= str;
        }

        return Integer.parseInt(result);

    }

    private int multiplyBIn(String left,String right)
    {

        int a = Integer.parseInt(left,2);
        int b = Integer.parseInt(right,2);
        String result = "";

        int dec = a*b;

        ArrayList<String> bin = new ArrayList<>();
        while(true)
        {
            if(dec % 2 == 0)
            {
                bin.add(0,"0");
            }
            else
            {
                bin.add(0,"1");
            }

            dec = dec / 2;
            if(dec == 0)
            {
                break;
            }

        }

        for(String str:bin)
        {
            result+= str;
        }

        return Integer.parseInt(result);

    }
    private int devideBin(String left,String right)
    {

        int a = Integer.parseInt(left,2);
        int b = Integer.parseInt(right,2);
        String result = "";

        int dec = a/b;

        ArrayList<String> bin = new ArrayList<>();
        while(true)
        {
            if(dec % 2 == 0)
            {
                bin.add(0,"0");
            }
            else
            {
                bin.add(0,"1");
            }

            dec = dec / 2;
            if(dec == 0)
            {
                break;
            }

        }

        for(String str:bin)
        {
            result+= str;
        }

        return Integer.parseInt(result);

    }
    private void setButtonBorder(JButton btn)
    {
        Border br = new LineBorder(new Color(26, 106,168),2);
        btn.setBorder(br);

    }

    private void removeButtonBorder(JButton btn)
    {
        Border br = new LineBorder(new Color(93,133,95));
        btn.setBorder(br);
    }

    private boolean isSistem(String name) {
        for (String str : sisteme) {
            if (name.equals(str)) {
                return true;
            }
        }

        return false;
    }

    private boolean isOperation(String name) {

        for (String str : arith) {
            if (name.equals(str)) {
                return true;
            }
        }

        return false;
    }

    private void setEnable() {
        n0.setEnabled(true);
        n1.setEnabled(true);
        n2.setEnabled(true);
        n3.setEnabled(true);
        n4.setEnabled(true);
        n5.setEnabled(true);
        n6.setEnabled(true);
        n7.setEnabled(true);
        n8.setEnabled(true);
        n9.setEnabled(true);
        a.setEnabled(true);
        b.setEnabled(true);
        ce.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
    }

    private ArrayList<String> convertTo(ArrayList<String> list) //Converteste numerele din "operations" intr-un singur numar
    {
        ArrayList<String> finish = new ArrayList<String>();

        String result = ""; // Stocheaza numarul
        int position = 0; // Salveaza pozitia ultemei operatii intalnite

        for (int i = 0; i < list.size(); i++)
        {
            if ((isOperation(list.get(i)) || i == 0))
            {
                if (isOperation(list.get(i)))
                    finish.add(list.get(i));

                position = i == 0 ? i : i + 1;

                for (int j = position; j < list.size() && !isOperation(list.get(j)); j++)
                {
                             result += list.get(j);
                }


                if (!result.isEmpty())
                {
                    finish.add(result);
                }
                result = "";


            }

        }

        list = finish;

        return list;
    }

    private int getSize(ArrayList<String> list) //returneaza marimea textului
    {
        int size = 0;


        if (list.size() > 14) {
            size = 18;
        } else {
            size = 25;
        }

        return size;
    }

    private String getText(ArrayList<String> list) // returneaza textul din lista - operations
    {
        String result = "";

        if(!list.isEmpty())
        {
                for(String str:list)
                {
                    result+=str;
                }
        }


        return result.isEmpty()?result = "0":result;
    }

    private void setText(ArrayList<String> oper)
    {

        String decimal= "";
        String str = "";

        ArrayList<String> list = new ArrayList<>();

        for(String con:oper)
        {
            list.add(con);
        }

        String curent = getText(list);

        if(!list.isEmpty())
        {
            if (!isOperation(list.get(list.size() - 1)))
            {
                 str = calulation(list);
            }
                else
            {
                list.remove(list.size()-1);
                str = calulation(list);
            }

            if (sistemAles.equals("HEX"))
            {
                labelHex.setText(curent);
                labelDec.setText(str);
                labelOct.setText(decimalToOct(str));
                labelBin.setText(decimalToBin(str));
            }
            else if (sistemAles.equals("DEC"))
            {
                decimal = Integer.parseInt(str, 10) + "";

                labelHex.setText(decimalToHex(decimal));
                labelDec.setText(curent);
                labelOct.setText(decimalToOct(decimal));
                labelBin.setText(decimalToBin(decimal));
            }
            else if (sistemAles.equals("OCT"))
            {
                decimal = Integer.parseInt(str, 8) + "";

                labelHex.setText(decimalToHex(decimal));
                labelDec.setText(decimal);
                labelOct.setText(curent);
                labelBin.setText(decimalToBin(decimal));
            }
            else if (sistemAles.equals("BIN"))
            {
                decimal = Integer.parseInt(str, 2) + "";

                labelHex.setText(decimalToHex(decimal));
                labelDec.setText(decimal);
                labelOct.setText(decimalToOct(decimal));
                labelBin.setText(curent);
            }
        }
        else
        {
            labelHex.setText(decimalToHex("0"));
            labelDec.setText("0");
            labelOct.setText(decimalToOct("0"));
            labelBin.setText(decimalToBin("0"));
        }

    }

    private String decimalToHex(String name)
    {
        String result = "";
        int dec = Integer.parseInt(name);
        ArrayList<String> hex = new ArrayList<>();


        int i = 0;
        while(true)
        {

            if(dec % 16 > 9 || dec % 16 < 17)
            {
                switch (dec%16)
                {
                    case 10:{hex.add(0,"A"); break;}
                    case 11:{hex.add(0,"B"); break;}
                    case 12:{hex.add(0,"C"); break;}
                    case 13:{hex.add(0,"D"); break;}
                    case 14:{hex.add(0,"E"); break;}
                    case 15:{hex.add(0,"F"); break;}
                    default:{hex.add(0,dec % 16+"");}
                }
            }

            dec = dec / 16;
            if(dec == 0)
            {
                break;
            }

            i++;
        }

        for(String str:hex)
        {
            result += str;
        }

        return result;
    }

    private String decimalToOct(String name)
    {
        String result = "";
        int dec = Integer.parseInt(name);
        ArrayList<String> oct = new ArrayList<>();


        int i = 0;
        while(true)
        {

            oct.add(0,dec % 8+"");

            dec = dec / 8;

            if(dec == 0)
            {
                break;
            }

            i++;
        }

        for(String str:oct)
        {
            result += str;
        }

        return result;
    }

    private String decimalToBin(String name)
    {
        String result = "";
        int dec = Integer.parseInt(name);
        ArrayList<String> bin = new ArrayList<>();


        int i = 0;
        while(true)
        {
            if(dec % 2 == 0)
            {
                bin.add(0,"0");
            }
            else
            {
                bin.add(0,"1");
            }

            dec = dec / 2;
            if(dec == 0)
            {
                break;
            }

            i++;
        }

        for(i=bin.size()-1;i>3;i--)
        {
            if((i)%4 == 0)
            {
                bin.add(i,".");
            }
        }

        for(String str:bin)
        {
            result += str;
        }

        return result;
    }
}
