package JavaProject.Chart06;
//추상 메소드를 가지면 무조건 추상클래스가 된다.
//그러나 추상메소드가 없어도 추상클래스가 될 수 있다. <- ***


abstract class Ramen {
    {
        System.out.println("Ramen");
    }

    //이 클래스를 상속받은 자식클래스에서 추상메소드를 강제로 오버라이딩 시킨다.
    public abstract void doA();                              //추상메소드

    public void doB() {
        System.out.println("Shinramen doB()");
    }
}

public class ShinRamen extends Ramen {
    {
        System.out.println("ShinRamen");
    }

    @Override
    public void doA() {
        System.out.println("ShinRamen doA()");
    }

    public void doC() {
        System.out.println("ShinRamen doC()");
    }

    public static void main(String[] args) {
        //추상클래스는 단독으로 객체를 만들 수 없다.
        //그러나 자식 객체를 만들 때는 만들어 진다.

//        Ramen ramen = new Ramen();
        ShinRamen sr = new ShinRamen();
//        sr.doB();

        Ramen rr = new ShinRamen();  //다형성
        rr.doB();

//        ((ShinRamen) rr).doC();
        ShinRamen srr = (ShinRamen) rr;
        srr.doC();
    }
}
