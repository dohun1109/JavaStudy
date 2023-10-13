package JavaProject.guiex;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;






//프레임 자체에 구현

public class test extends JFrame implements ActionListener {
    private JButton btn = new JButton("OK");

    test(){
        this.setTitle("EventEx1 - 프레임 자체에 구현");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(300,200);
        this.setVisible(true);
    }

    public void formDesign() {
        //this.setLayout(new BorderLayout());
        this.add(btn);

    }
    public void eventHandler() {

        btn.addActionListener(this);
    }

    public static void main(String[] args) {
        new test();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("OK")) {
            btn.setText("버튼클릭");
            btn.setBackground(Color.yellow);
        }
        else {
            btn.setText("OK");
            btn.setBackground(Color.red);
        }


    }

}

