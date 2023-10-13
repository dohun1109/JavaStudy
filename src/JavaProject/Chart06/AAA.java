package JavaProject.Chart06;

//추상 메소드가 없어도 추상클래스가 된다.
//추상클래스의 용도
//설계와 구현을 분리한다.
// 슈퍼 클래스에서는 개념을 정의 하고 각각의 서브클래스에서는 행위를 기술 .
class BBB extends AAA {
    //추상클래스를 상속받은 클래스도 추상클래스가 될 수 있다. 꼭 상속받은 클래스가 일반클래스일 필요는 없다.
    int x = 200;

    public void doA() {
        System.out.println("BBB doA()");
    }

    public void doB() {
        System.out.println("BBB doB()");
    }
}

public abstract class AAA {

    int x = 10;

    public void doA() {
        System.out.println("AAA doA()");
    }


    public static void main(String[] args) {
        //추상 클래스는 단독으로는 객체를 생성 할 수 없다.
        AAA aap = new BBB();             //다형성 -부모 클래스로 자식 객체를 생성.
        ((BBB) aap).doB();

        aap.doA();  //오버라이딩으로 객체를 생성한 경우 메소드는 자식의 메소드가 실행
        System.out.println(aap.x); //다형성으로 객체를 생성한 경우 필드는 부모 클래스의 멤버가 실행.


        
        //자바는 클래스를 만드는 것이다.

        //클래스 -> 추상클래스 -> 인터페이스

        //클래스는 필드와 메소드로 구성

        //추상클래스는 필드와 메소드로 구성되는데 추상메소드를 가진다.
        //오버라이딩을 강제로 구현하기 위함

        //인터페이스는 상수와 추상메소드로만 구성된다.
        // -다형성을 더욱 효율적으로 구현하게 해준다.


    }
}
