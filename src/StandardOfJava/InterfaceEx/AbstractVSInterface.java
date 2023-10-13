package StandardOfJava.InterfaceEx;

public class AbstractVSInterface {



    // Abstract vs Interface
    //위 두 유형 모두 메서드 블록이 있든 없든 선언된
    //메서드의 혼합을 포함할 수 있다.

    //java의 경우 다중 상속을 지원하지 않는다.
    //즉, abstract를 사용할 경우 구현의 강제성과 이러한 것들을 고려했을 때,
    //인터페이스를 사용하는것을 권장한다.
    //그리고, jdk8 version 이후에는 interface의 경우 default modifier 가 추가되어, 새로운 추상메소드?을 추가할 때, 강제적인 구현을 하지않고 기존의 interface의 super()를 통해 접근하여 구현하고 싶은면 구현하고 구현을 안하고 싶다 그러면 부모 interface 에 접근하여 사용가능하다.(다형성 증가)-> 즉, 요약하면 인터페이스에서 메서드 구현이 가능해졌다.

    //1. 인스턴스의 생성 유무 둘다 NO
    //2. 생성자의 유무 ->추상클래스 O 인터페이스 X
    //3. 귀찮..
    


    public static void main(String[] args) {

    }
}
