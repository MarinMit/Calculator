
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Help extends JFrame
{
    public Help()
    {
        JFrame frame = new JFrame("HELP");
        frame.setSize(400,600);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(25,1));

        JLabel delet  =new JLabel("Delete : - Șterge ultimul caracter adăugat.");
        JLabel ce  =new JLabel("CE : - Șterge rezultatul calculului.");
        JLabel clear  =new JLabel("Clear : - Șterge continutul tutor campurilor.");
        JLabel invers  =new JLabel("+ - : - Schimbă semnul numărului ");
        JLabel rest  =new JLabel("% : - Returnează restul impărțirii.");
        JLabel cat  =new JLabel("/ : - Returnează câtul împărțirii.");
        JLabel multy  =new JLabel("* : - Semnul înmulțirii.");
        JLabel plus  =new JLabel("+ : - Semnul înmulțirii.");
        JLabel devid  =new JLabel("* : - Semnul înmulțirii.");
        JLabel min  =new JLabel("- : - Semnul înmulțirii.");
        JLabel eqaul  =new JLabel("= : - Afișează rezultatul.");
        JLabel dot  =new JLabel(". : - Virgulă mobilă.");
        JLabel sin  =new JLabel("sin : - Sinus.");
        JLabel cos  =new JLabel("cos : - Cosinus.");
        JLabel tan  =new JLabel("tan : - Tangentă.");
        JLabel xn  =new JLabel("Xn : - 'X' la puterea 'n' (X^n).");
        JLabel parL  =new JLabel("( : - Paranteză rotundă deschisă.");
        JLabel parR  =new JLabel(") : - Paranteză rotundă închisă.");
        JLabel sqrt  =new JLabel("√ : - Radical.");
        JLabel x10n  =new JLabel("X10n : - 'X' înmulțit cu 10 la puterea  'n' (X * 10^n).");
        JLabel x2  =new JLabel("X2 : - 'X' la pătrat (X^2).");
        JLabel dec  =new JLabel("DEC : - Sistemul zecimal.");
        JLabel hex  =new JLabel("HEX : - Sistemul hexazecimal.");
        JLabel oct  =new JLabel("OCT : - Sistemul octal.");
        JLabel bin  =new JLabel("BIN : - Sistemul binar.");

        panel.add(delet);
        panel.add(ce);
        panel.add(clear);
        panel.add(invers);
        panel.add(rest);
        panel.add(cat);
        panel.add(multy);
        panel.add(plus);
        panel.add(devid);
        panel.add(min);
        panel.add(eqaul);
        panel.add(dot);
        panel.add(sin);
        panel.add(cos);
        panel.add(tan);
        panel.add(xn);
        panel.add(parL);
        panel.add(parR);
        panel.add(sqrt);
        panel.add(x10n);
        panel.add(x2);
        panel.add(hex);
        panel.add(dec);
        panel.add(oct);
        panel.add(bin);

        Border br = new LineBorder(new Color(238,238,238),10);

        panel.setBorder(br);
        frame.add(panel);
      //  frame.pack();
        frame.setVisible(true);
    }


}
