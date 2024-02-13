import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
    static JLabel label;
    Screen(){
        init();
        settings();
    }
    public void init(){
        JButton get = new JButton("get");
        get.setBounds(0,0,100,50);
        get.addActionListener(new Listener());

        label = new JLabel();
        label.setText("api here");
        label.setBounds(0,30,500,270);

        add(get);
        add(label);
    }
    public void settings(){
        setSize(1250,300);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Api getter");
    }
    public static void use(){
        label.setText(ApiExample.getFromApi());
    }
}
class Listener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Screen.use();
    }
}
