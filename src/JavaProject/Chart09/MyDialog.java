package JavaProject.Chart09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog extends JDialog {
    private JTextField tf = new JTextField();
    private JButton btn2 = new JButton("Change");

    MyDialog() {
        this.setTitle("Mydialog Ex2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(200,100);
        this.setVisible(true);
    }

    public void formDesign() {
        this.setLayout(new FlowLayout());
        this.add(tf);
        this.add(btn2);
    }

    public void eventHandler() {
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog.this.setVisible(false);
                String str = getInput();
                DialogEx2.setBtn(str);
                
            }
        });
    }
    //텍스트 필드에 문자열을 입력하는 메소드
    public String getInput() {
        if (tf.getText().length() == 0) {
            return null;
        }else
            return tf.getText();
    }

    public static void main(String[] args) {
        new MyDialog();
    }
}
