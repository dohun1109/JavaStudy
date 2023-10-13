package JavaProject.Chart09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//  잘못 만듬..
public class DialogEx2 extends JFrame {

    private JPanel p = new JPanel();
    private static JButton btn = new JButton("Ex2btn");
    private MyDialog da = new MyDialog();

    DialogEx2(){
        this.setTitle("DialogEx2 example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(250, 200);
        this.setVisible(true);
    }

    public void formDesign() {
        this.add(p, BorderLayout.CENTER);
        p.add(btn);
    }

    public static void setBtn(String text) {
        btn.setText(text);
    }

    public void eventHandler() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                da.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        new DialogEx2();
    }
}
