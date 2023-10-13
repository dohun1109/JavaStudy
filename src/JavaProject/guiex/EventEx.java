package JavaProject.guiex;

import javax.swing.*;
import java.awt.*;
//자바의 GUI 프로그래밍은 2단계로 나누어 처리한다.
//1. 폼 디자인
//  1) 프레임 생성(JFrame을 상속 받아서 )
//  2) 필요한 컴포넌트를 선언한다.
//  3) 배치관리자를 지정한다.
//  4) 컴포넌트를 배치한다.
//2. 이벤트 처리
//  1)이벤트 소스를 결정한다.
//  2)이벤트 소스가 이벤트를 들을 수 있도록 귀를 달아 준다.
//  3) 이벤트 객체를 생성하기 위해 이벤트 리스너를 구현한다.
//  4) 이벤트 객체를 생성한다.


public class EventEx extends JFrame {
    private JButton btn  = new JButton("OK");

    EventEx(){
        this.setTitle("GUI 프로그램");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();      //폼 디자인
        this.eventHandler();    //이벤트 처리
        this.setSize(300, 200);
        this.setVisible(true);

    }

    public void formDesign(){
        this.setLayout(new FlowLayout());
        this.add(btn);
    }
    public void eventHandler(){

    }

    public static void main(String[] args) {
        System.out.println("asldjalsk");

        new EventEx();
    }
}
