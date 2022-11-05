import javax.swing.*;
import javax.swing.event.*;


class find extends JFrame implements ListSelectionListener{
    String[] things = {"風車菊", "石珀", "緋櫻繡球", "劫波蓮", "小燈草", "琉璃百合", "海靈芝", "聖金蟲"};
    JList<String> jli = new JList<>(things);
    JTextArea jta = new JTextArea("可選擇特產...");

    find(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("原神地區特產");
        setBounds(100, 100, 300, 300);
        setLayout(null); 

        JLabel jla = new JLabel("選擇特產：");
        jla.setBounds(50, 50, 100, 20);
        add(jla);

        // String[] things = {"風車菊", "石珀", "緋櫻繡球", "劫波蓮",
        // "小燈草", "琉璃百合", "海靈芝", "聖金蟲"};
        // JList<String> jli = new JList<>(things);
        jli.addListSelectionListener(this);
        jli.setVisibleRowCount(4);
        JScrollPane jsc = new JScrollPane(jli);

        JPanel jpan = new JPanel();
        jpan.setBounds(100, 30, 100, 100);
        jpan.add(jsc);
        add(jpan);

        //JTextArea jta = new JTextArea("可選擇特產...");
        jta.setBounds(10, 150, 250, 100);
        
        JScrollPane jsc2 = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
         ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsc2.setBounds(10, 150, 250, 100);
        add(jsc2);

        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e){
        String txtShow = "";
        for(String a : jli.getSelectedValuesList()){
            if(a == "風車菊"){
                txtShow += a + " 位於蒙德風起地\n";
            }
            if(a == "石珀"){
                txtShow += a + " 位於璃月琥牢山\n";
            }
            if(a == "緋櫻繡球"){
                txtShow += a + " 位於稻妻鳴神島\n";
            }
            if(a == "劫波蓮"){
                txtShow += a + " 位於須彌雨林\n";
            }
            if(a == "小燈草"){
                txtShow += a + " 位於蒙德低語森林\n";
            }
            if(a == "琉璃百合"){
                txtShow += a + " 位於璃月輕策莊\n";
            }
            if(a == "海靈芝"){
                txtShow += a + " 位於稻妻海域\n";
            }
            if(a == "聖金蟲"){
                txtShow += a + " 位於須彌沙漠\n";
            }
        }
        jta.setText(txtShow);

    }
}

public class week8{
    public static void main(String[] args){
        find f = new find();
    }
}