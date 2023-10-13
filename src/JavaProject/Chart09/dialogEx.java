package JavaProject.Chart09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialogEx extends JFrame {
    private JButton btn = new JButton("텍스트 변경");
    private JPanel p = new JPanel();
    private JPanel p2 = new JPanel();

    private JTextArea tfm = new JTextArea("안녕하세요 ");

    //다이엘로그 상자
    private MyDialog dialog;

    dialogEx(){
        this.setTitle("다이얼로그 상자");
        dialog = new MyDialog(this, "택스트 변경 ");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(400, 300);
        this.setVisible(true);

    }

    public void formDesign() {
//        this.setLayout(new BorderLayout());    //Frame  layout 생략가능.
        this.add(p, BorderLayout.SOUTH);
        this.add(p2,BorderLayout.CENTER);
        p2.setSize(200,100);
//        p.setLayout(new FlowLayout());         //Panel layout 생략가능.
        p.add(btn);
        p2.add(tfm);
        
    }

    public void eventHandler() {
        // 버튼 클릭시 dialog 출력
        //1. event source search
        //2. event listener create (addActionListener )
        //3.listener 구현
        //4. 이벤트 객체를 넣어준다.     -> 다이러로그 상자가 열림.

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
                
            }
        });

    }

    public static void main(String[] args) {
        new dialogEx();
    }

    //dialog 내부 클래스(내부 클래스로다이얼로그 상자 만들기 )
    class MyDialog extends JDialog{
        private JTextField tf = new JTextField(10);
        private JButton okBtn = new JButton("OK");

        MyDialog(JFrame frame, String title){
            super(frame, title);

            this.dformDesign();
            this.deventHandler();
            this.setSize(200, 100);

        }
        public void dformDesign() {
            this.setLayout(new FlowLayout());
            this.add(tf);
            this.add(okBtn);
        }

        public void deventHandler() {
            okBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //텍스트 필드의 문자열을 메인 프레임 버튼의 문자열로 변경
                    MyDialog.this.setVisible(false);

                    //텍스트 필드에서 문자열을 가져오기
                    String str = dialog.getInput();
//                    btn.setText(str);
                    tfm.setText(str);
                    
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
    }
}
