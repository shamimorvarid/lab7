import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
public class CalculatorGUI {
    JFrame calcFrame;
    public CalculatorGUI() {
        calcFrame = new JFrame();
        calcFrame.setTitle("Aut Calculator");
        calcFrame.setSize(350,350);
        calcFrame.setLocation(100,200);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea display = new JTextArea(3,10);
        display.setEditable(false);
        display.setFont(new Font("Arial",14,14));
        display.setMaximumSize(new Dimension(340,10));

        JTextArea display1 = new JTextArea(3,10);
        display1.setEditable(true);
        display1.setFont(new Font("Arial",14,14));
        display1.setMaximumSize(new Dimension(340,10));

        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(340,10));
        scrollPane.setLocation(50,20);

        JScrollPane scrollPane1 = new JScrollPane(display1);
        scrollPane1.setPreferredSize(new Dimension(340,10));
        scrollPane1.setLocation(50,20);

        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setSize(200,200);
        keyboardPanel.setLocation(10,150);
        keyboardPanel.setLayout(new GridLayout(5,4));

        JPanel keyboardPanel1 = new JPanel();
        keyboardPanel1.setSize(200,200);
        keyboardPanel1.setLocation(10,150);
        keyboardPanel1.setLayout(new GridLayout(5,6));

        calcFrame.add(keyboardPanel);
        calcFrame.add(keyboardPanel1);

        JButton n = new JButton();
        n.setText("n");
        keyboardPanel1.add(n);

        JButton c = new JButton();
        c.setText("C");
        keyboardPanel.add(c);

        JButton c1 = new JButton();
        c1.setText("C");
        keyboardPanel1.add(c1);

        JButton ce = new JButton();
        ce.setText("CE");
        keyboardPanel.add(ce);

        JButton ce1 = new JButton();
        ce1.setText("CE");
        keyboardPanel1.add(ce1);

        JButton mod = new JButton();
        mod.setText("%");
        keyboardPanel.add(mod);

        JButton mod1 = new JButton();
        mod1.setText("%");
        keyboardPanel1.add(mod1);

        JButton sumBtn = new JButton();
        sumBtn.setText("+");
        keyboardPanel.add(sumBtn);

        JButton sumBtn1 = new JButton();
        sumBtn1.setText("+");
        keyboardPanel1.add(sumBtn1);

        JButton sin = new JButton();
        sin.setText("sin");
        keyboardPanel1.add(sin);

        JButton np = new JButton();
        np.setText("Np");
        keyboardPanel1.add(np);

        for(int i=9;i>0;i--){
            if(i==6){
                JButton minos = new JButton();
                minos.setText("-");
                keyboardPanel.add(minos);
                JButton minos1 = new JButton();
                minos1.setText("-");
                keyboardPanel1.add(minos1);
                JButton tan = new JButton();
                tan.setText("tan");
                keyboardPanel1.add(tan);
                JButton fact = new JButton();
                fact.setText("n!");
                keyboardPanel1.add(fact);
            }
            if(i==3){
                JButton multiplied = new JButton();
                multiplied.setText("*");
                keyboardPanel.add(multiplied);
                JButton multiplied1 = new JButton();
                multiplied1.setText("*");
                keyboardPanel1.add(multiplied1);
                JButton exp = new JButton();
                exp.setText("exp");
                keyboardPanel1.add(exp);
                JButton pow = new JButton();
                pow.setText("^");
                keyboardPanel1.add(pow);
            }
            JButton btn = new JButton();
            JButton btn1 = new JButton();
            btn.setText("" + i);
            btn1.setText("" + i);
            keyboardPanel.add(btn);
            keyboardPanel1.add(btn1);
        }
        JButton Division = new JButton();
        Division.setText("/");
        keyboardPanel.add(Division);

        JButton Division1 = new JButton();
        Division1.setText("/");
        keyboardPanel1.add(Division1);

        JButton log = new JButton();
        log.setText("log");
        keyboardPanel1.add(log);

        JButton radical = new JButton();
        radical.setText("√");
        keyboardPanel1.add(radical);

        JButton btn = new JButton();
        btn.setText("()");
        keyboardPanel.add(btn);

        JButton btn1 = new JButton();
        btn1.setText("()");
        keyboardPanel1.add(btn1);

        JButton zeroBtn = new JButton();
        zeroBtn.setText("0");
        keyboardPanel.add(zeroBtn);

        JButton zeroBtn1 = new JButton();
        zeroBtn1.setText("0");
        keyboardPanel1.add(zeroBtn1);

        JButton dot = new JButton();
        dot.setText(".");
        keyboardPanel.add(dot);

        JButton dot1 = new JButton();
        dot1.setText(".");
        keyboardPanel1.add(dot1);

        JButton doBtn = new JButton();
        doBtn.setText("=");
        keyboardPanel.add(doBtn);

        JButton doBtn1 = new JButton();
        doBtn1.setText("=");
        keyboardPanel1.add(doBtn1);

        JButton shift = new JButton();
        shift.setText("shift");
        keyboardPanel1.add(shift);

        JPanel standard = new JPanel();
        standard.setLayout(new BoxLayout(standard,BoxLayout.PAGE_AXIS));
        standard.add(scrollPane);
        standard.add(keyboardPanel);

        JPanel scientific = new JPanel();
        scientific.setSize(200,200);
        scientific.setLayout(new BoxLayout(scientific,BoxLayout.PAGE_AXIS));
        scientific.add(scrollPane1);
        scientific.add(keyboardPanel1);

        JTabbedPane tab = new JTabbedPane();
        tab.add("standard calculator",standard);
        tab.add("scientific calculator",scientific);
        calcFrame.add(tab);
    }

    public void show(){
        calcFrame.setVisible(true);
    }

}
