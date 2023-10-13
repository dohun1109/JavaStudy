package JavaProject.Chart09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPaneEx extends JFrame {
    private JPanel p = new JPanel();
    private JTextField tf = new JTextField(10);
    private JButton input = new JButton("Input Name");
    private JButton confirm = new JButton("confirm");
    private JButton message = new JButton("message");
    
    public OptionPaneEx(){
        this.setTitle("옵션팬 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(500,300);
        this.setVisible(true);
    }

    public void formDesign() {
        this.add(p, BorderLayout.NORTH);
        p.add(input);
        p.add(confirm);
        p.add(message);
        p.add(tf);
        p.setBackground(Color.LIGHT_GRAY);
        
    }

    public void eventHandler() {

        input.addActionListener(e -> {
            //입력 다이엘로그 생성
            String name = JOptionPane.showInputDialog("이름을 입력하시오.");
            if (name != null) {
                tf.setText(name);
            }
        });
        confirm.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(null, "계속할것 입니까?", "confirm", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.CLOSED_OPTION) {
                tf.setText("Just Closed without Selection");
            }else if (result == JOptionPane.YES_OPTION){
                tf.setText("YES");
            }else
                tf.setText("No");
        });
        message.addActionListener(e -> JOptionPane.showMessageDialog(null,"조심하세요","message",JOptionPane.ERROR_MESSAGE));
                                    
    }

    public static void main(String[] args) {
        new OptionPaneEx();
    }
}
