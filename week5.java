import javax.swing.*;
import javax.swing.JTextField.*;
import java.awt.event.*;

class calculator extends JFrame implements ActionListener{
    private JPanel panel;
    private JTextField text1;
    private int n;

    calculator(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBounds(100, 100, 300, 400);
        setVisible(true);

        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);

        text1 = new JTextField("");
        text1.setBounds(10, 10, 270, 30);
        panel.add(text1);

        JButton btn1 = new JButton("1");
        btn1.setBounds(20, 60, 70, 50);
        btn1.addActionListener(this);
        panel.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(110, 60, 70, 50);
        btn2.addActionListener(this);
        panel.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(200, 60, 70, 50);
        btn3.addActionListener(this);
        panel.add(btn3);

        JButton btn4 = new JButton("4");
        btn4.setBounds(20, 130, 70, 50);
        btn4.addActionListener(this);
        panel.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(110, 130, 70, 50);
        btn5.addActionListener(this);
        panel.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(200, 130, 70, 50);
        btn6.addActionListener(this);
        panel.add(btn6);

        JButton btn7 = new JButton("7");
        btn7.setBounds(20, 200, 70, 50);
        btn7.addActionListener(this);
        panel.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(110, 200, 70, 50);
        btn8.addActionListener(this);
        panel.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(200, 200, 70, 50);
        btn9.addActionListener(this);
        panel.add(btn9);

        JButton btn0 = new JButton("0");
        btn0.setBounds(110, 270, 70, 30);
        btn0.addActionListener(this);
        panel.add(btn0);

        JButton btn11 = new JButton(" + ");
        btn11.setBounds(20, 270, 70, 30);
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text1.setText(math(text1.getText()));
            }
        });
        panel.add(btn11);

        JButton btn12 = new JButton(" - ");
        btn12.setBounds(20, 310, 70, 30);
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text1.setText(math(text1.getText()));
            }
        });
        panel.add(btn12);

        JButton btn13 = new JButton(" * ");
        btn13.setBounds(200, 270, 70, 30);
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text1.setText(math(text1.getText()));
            }
        });
        panel.add(btn13);

        JButton btn14 = new JButton(" / ");
        btn14.setBounds(200, 310, 70, 30);
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text1.setText(math(text1.getText()));
            }
        });
        panel.add(btn14);

        JButton btn15 = new JButton(" = ");
        btn15.setBounds(110, 310, 70, 30);
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text1.setText(math(text1.getText()));
            }
        });
        panel.add(btn15);
    }

    public void actionPerformed(ActionEvent e){
        JButton name = (JButton)e.getSource();
        text1.setText(text1.getText() + word(name.getText()));
    }

    private String word(String n){
        return n;
    }

    private String math(String m){
        String[] b = m.split(" ");
        int e = Integer.parseInt(b[0]);
        String s = "";
        for(String a : b){
            if(a == "+"){
                int g = n + e;
                s = String.valueOf(g);
            } else if(a == "-"){
                int g = n - e;
                s = String.valueOf(g);
            } else if(a == "*"){
                int g = n * e;
                s = String.valueOf(g);
            } else if(a == "/"){
                float g = n / e;
                s = String.valueOf(g);
            } else {
                s = n;
            }

        }
        return s;
    }
}

public class week5 {
    public static void main(String[] args){
        calculator c1 = new calculator();
    }
}
