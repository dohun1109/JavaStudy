package JavaProject.Chart09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPane extends JFrame implements ActionListener {
    private JButton inputBtn = new JButton("Input Name");
    private JButton confirmBtn = new JButton("Confirm");
    private JButton message = new JButton("Message");

    private JTextField tf = new JTextField(10);

    private JPanel p = new JPanel();
    OptionPane() {
        this.setTitle("팝업 다이얼로그");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(500, 200);
        this.setVisible(true);

    }
    public void formDesign() {
        this.add(p,BorderLayout.NORTH);
        p.add(inputBtn);
        p.add(confirmBtn);
        p.add(message);
        p.add(tf);
        p.setBackground(Color.GRAY);


    }

    public void eventHandler() {
        inputBtn.addActionListener(this);
        confirmBtn.addActionListener(this);
        message.addActionListener(this);
    }

    public static void main(String[] args) {
        new OptionPane();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Input Name")) {
            String name = JOptionPane.showInputDialog("이름을 입력하시오 : ");
            if (name != null){
                tf.setText(name);
            }
        } else if (e.getActionCommand().equals("Confirm")) {
            //확인 다이엘로그 상자 생성
            int result = JOptionPane.showConfirmDialog(null, "계속할 거입니까?", "Confirm",JOptionPane.YES_NO_OPTION);

            //사용자가 선택한 버튼에 따라 무자열 택스트를 필드에 출력
            if (result == JOptionPane.CLOSED_OPTION){
                tf.setText("Just Closed without Selection");
            }else if (result == JOptionPane.YES_NO_OPTION){
                tf.setText("YES");
            }else
                tf.setText("NO");

        } else if (e.getActionCommand().equals("Message")) {
            JOptionPane.showMessageDialog(null,"조심하세요","Message",JOptionPane.ERROR_MESSAGE);

        }
    }
}
