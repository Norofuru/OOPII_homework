import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame{
    private JPanel panel;
    int i ;

    myFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("圖片顯示器");
        setBounds(10, 10, 500, 500);

        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(new BorderLayout(10, 10));

        ImageIcon img1 = new ImageIcon("C:\\Users\\angel\\Desktop\\繪\\插圖3701.png");
        ImageIcon img2 = new ImageIcon("C:\\Users\\angel\\Desktop\\繪\\插圖2301.png");
        ImageIcon img3 = new ImageIcon("C:\\Users\\angel\\Desktop\\繪\\無標題201.png");

        ImageIcon[] pic = {img1, img2, img3};

        JLabel name = new JLabel(pic[i].toString(), JLabel.CENTER);
        panel.add(name, BorderLayout.NORTH);

        JLabel picture = new JLabel(pic[i]);
        panel.add(picture,BorderLayout.CENTER);

        JPanel we = new JPanel();
        JButton left = new JButton("上一張");
        left.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 0){
                    JOptionPane.showMessageDialog(null, "沒有圖了", "沒有圖了", JOptionPane.OK_OPTION);
                } else {
                    i--;
                    picture.setIcon(pic[i]);
                    name.setText(pic[i].toString());
                }
                
            }
        });
        we.add(left);
        panel.add(we, BorderLayout.WEST);

        JPanel ri = new JPanel();
        JButton right = new JButton("下一張");
        right.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 2){
                    JOptionPane.showMessageDialog(null, "沒有圖了", "沒有圖了", JOptionPane.OK_OPTION);
                } else {
                    i++;
                    picture.setIcon(pic[i]);
                    name.setText(pic[i].toString());
                }
                
            }
        });
        ri.add(right);
        panel.add(ri, BorderLayout.EAST);

        setVisible(true);
    }
}

public class week6 {
    public static void main(String[] args){
        myFrame f = new myFrame();
    }
}
