package JavaProject.Chart05;



class A{
    public void doA(){
        System.out.println("A class doA()");
    }
    public void doB(){
        System.out.println("A class doB()");
    }
}
class B extends A{
    //오버라이딩 : 자식메소드에서 부모의 메소드를 재정의 하는것을 오버라이딩 이라고 한다.
    public void doA(){
        System.out.println("B class doA()");
    }
    public void doC(){
        System.out.println("B class doC()");
    }
}
class C {}

public class OverridingEx {
    public static void main(String[] args) {
        A ap = new A();
        ap.doA();

        C cp = new C();

        B bp = new B(); //먼저 자기 자신내부에서 찾고 없다면 부모클래스에서 찾는다. 즉, A클래스 doB()가 실해된다.
        bp.doB();
        bp.doA();       //이러한 경우, 자신 내부에서 먼저 찾기 때문에 B class doA()가 실행됨.

        A aap = new B();    //다형성(polymorphism) - 부모클래스로 자식 객체를 생성(표현)
        aap.doA();          //자기 자신 내부에서 먼저 찾기 때문에 내부 메소드 실행.
        aap.doB();          //자신에게 없으니 당연히 부모 클래스 메소드 실행
//        aap.doC();          //A class에 없는 새로운 기능이므로 바로는 호출불가.

        B bbp = (B)aap;     //type Casting 을 통해 접근가능
        bbp.doC();

        int a = 10;
        byte b = 20;

        a = b;          //byte -> int 자동 형변환(type promotion)
        b = (byte)a;    //int -> byte 명시적 형변환(type casting) - 자동으로 형변환이 일어나지 않는다. 그래서 강제적으로 형변환을 해주어야한다.


    }
}
