package JavaProject.Chart06.InterfaceEx;
//인터페이스는 상수와 추상메소드만 가진다.
//객체는 생성할 수 없다.
//타입으로만 사용가능
//다형성을 더욱 효과적으로 사용할 수 있다.

import java.sql.SQLOutput;

interface Learnable {
    //String TASK = '배우는 사람';
    public static final String TASK = "배우는 사람";
    //void learn()
    public abstract void learn();
}

interface Teachable {
    String JOB = "가르치는 사람";

    void teach();
}

class Student implements Learnable {
    @Override
    public void learn() {
        System.out.println("학생은 배운다.");
    }
}

class Professor implements Teachable {
    @Override
    public void teach() {
        System.out.println("교수는 학생을 가르친다.");
    }
}
    //자바는 단일 상속을 지원한다.
//그러나 인터페이스는 다중구현이 가능하다. 그래서 다중상속을 효과를 실현한다.
class PostGraduate implements Learnable, Teachable {

    @Override
    public void learn() {
        System.out.println("대학원생은 배운다.");
    }

    @Override
    public void teach() {
        System.out.println("대학원생은 가르치기도 한다.");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {

        Student stu1 = new Student();
        Learnable stu2 = new Student(); //다형성
        Professor pf = new Professor();
        Teachable tpf = new Professor();      //다형성

//        Learnable learn = new Learnable(); 추상클래스는 객체를 생성할수 없듯이 인터페이스도 객체생성이 불가능하다.

        PostGraduate pg = new PostGraduate();
        Learnable lpg = new PostGraduate(); //다형성
        Teachable tpg = new PostGraduate();       //다형성

        stu2.learn();
        lpg.learn();
        pf.teach();
        tpg.teach();


    }
}
