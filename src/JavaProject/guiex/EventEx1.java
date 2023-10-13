package JavaProject.guiex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Event 처리 - OK버튼을 클릭하면 반응하도록 하는 것
*   1) Event : 마우스 클릭
*   2) Event : JButton -> btn
*
* 1. OK 버튼을 클릭할 때 발생하는 이벤트를 처리하기 위해서는
*   1)OK 버튼에 이벤트(여기서는 ActionEvent)를 들을 수 있도록 이벤트 Listener를 달아주어야한다.
*       즉, 이벤트를 인지학 처리 할 수 있도록 해준다. btn.addActionListener(??);
*   2) ?? 에 이벤트 객체를 넣어준다.
*
* 2. 이벤트 객체를 만들어 주는 방법은 -> 이벤트 리스너를 구현해서 객체를 만들어 준다.
* 이벤트 리스너를 구현하는 방법
*   1) 익명중첩클래스로 구현하는 방법
*   2) 프레임 자체에 리스너를 구현하는 방법
*   3) 프레임 자체에 리스너를 구현하는 방법
*   4) Adapter 클래스로 구현.
* */
public class EventEx1 extends JFrame {
    private  JButton btn = new JButton("OK");
    EventEx1(){
        this.setTitle("Event");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(300,200);
        this.setVisible(true);
    }
    public void formDesign(){
        this.setLayout(new FlowLayout());
        this.add(btn);

    }
    public void eventHandler(){
        //1. 이벤트 소스 찾기 -> btn
        //2. 이벤트 소스에 귀를 달아 준다. btn.addXXListener();
        //3. 이벤트 리스너를 구현하여 객체를 넣어준다.

        //이벤트 리스너 구현 - 1. 악명중첩클래스
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.getText().equals("OK")){
                    btn.setText("버튼 클릭");
                    btn.setBackground(Color.yellow);
                }
                else{
                    btn.setText("OK");
                    btn.setBackground(Color.red);
                }
            }
        });
    }

    public static void main(String[] args) {
        new EventEx1();
    }
}
