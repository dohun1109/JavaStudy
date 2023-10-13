package StandardOfJava.Generic;


/*제네릭 의 장점
 * 1. 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
 * 2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없다. 즉, 관리하기가 편하다.
 * 3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.
 *
 * <T> : type
 * <E> : Element
 * <K> : Key
 * <V> : value
 * <N> : Number
 *
 * */

public class className<E> {
    private E element;  //제네릭 타입 변수

    void set(E element) {          //제네릭 파라미터 메소드
        this.element = element;
    }

    E get() {   //제네릭 반환 메소드
        return element;
    }

    /*
     * public <T> T genericMethod(T o)
     * {
     *   // 제네릭 메소드...
     * }
     *
     *
     * [접근 제어자] <제네릭타입> [반환타입] [메소드명]([제네릭타입] [파라미터])
     * {
     * 	// 텍스트
     * }
     * */

    <T> T genericMethod(T o) { //-> 인반적인 메소드 선언방식과 다른 이유 !!! static 용으로 만들어 졌기 때문 이유는 아래 .
        return o;
    }
    //즉, 클래스에서 지정한 제네릭 유형과 별도록 method 에서 독립적으로 제네릭 유형을 선언하여 쓸 수 있다.

    /* 그럼 위와 같은 방식이 왜 필요한가? 바로 '정적 메소드로 선언할 때 필요'하기 때문이다 .
    * 제네릭은 유형을 외부에서 지정해준다. 즉, 해당 클래스 객체가 인스턴스화
    * 될때, <> 사이에 있는 파라미터로 넘겨준 타입으로 지정된다는 뜻이다.
    *

    * 하지만 static 은 무엇인가? 정적이라는 뜻이다. static 변수, static 함수 등이 있다. 
    * 기본적으로 static 이 붙은 것들은 기본적으로 프로그램 실행시 객체의 인스턴스화가 진행되기 이전에 heap 메모리에 이미 올라가 있다.
    * 이 말은 객체 생성을 통해 접근할 필요 없이 이미 메모리에 올라가 있기 때문에 className 을 통해 바로 쓸 수있다는 것이다.
    * 그런데, 반대로 생각해보면 static method 는 객체가 생성되기 이전에 메모리에 올라가는데 type 을 어디서 얻어올 수 있을까?
    * 일반적인 [타입] [메소드명] [(파라미터)] {} 이런 형태일 경우
    * 객체가 생성되기 전에 클래스이름으로 접근할 수는 있으나 유형을 지정할 방법이 없어 에러가 발생한다.
    *
    * 그로인해서, 제네릭이 사용되는 메소드를 정적메소드로 두고 싶은 경우 제네릭 클래스와 독립적인 제네릭이 사용되어야 한다.
    *
    * */

    //아래 메소드의 E type 은 제네릭 클래스의 E 타입고 다른 독립적인 타입이다.
    static <E> E genericMethod1(E o) {
        return o;
    }

    static <T> T genericMethod2(T o) {
        return o;
    }



    public static void main(String[] args) {

        className<String> a = new className<>();
        className<Integer> b = new className<>();

        a.set("10");
        b.set(10);


        System.out.println("a data -> " + a.get());
        System.out.println("a E type -> " + a.get().getClass().getName());  //반환된 변수 타입 출력

        System.out.println("b data -> " + b.get());
        System.out.println("b E type -> " + b.get().getClass().getName());  //반환된 변수 타입 출력

        //generic method Integer
        System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());
        //generic method String
        System.out.println("<T> returnType : " + a.genericMethod("abcd").getClass().getName());
        //generic method className b
        System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());


        //static generic Method
        System.out.println("<E> returnType : " + className.genericMethod1(3).getClass().getName());
        System.out.println("<E> returnType : " + className.genericMethod1("ABCD").getClass().getName());
        System.out.println("<T> returnType : " + className.genericMethod2(a).getClass().getName());
        System.out.println("<T> returnType : " + className.genericMethod2(3.0).getClass().getName());

        //보다 시피 제네릭 메소드는 제네릭 클래스 타입과 별도로 지정된다는 것을 볼 수 있다. <> 안에 타입을 파라미터로 보내 제네릭 타입을 지정해주는 것. 이 것이 제네릭 프로그래밍이다.


        //그런데 이런 의문이 들 수 있다. " 아니 그러면 특정 범위만 허용하고 나머지 타입은 제한 할 수 없나요?" 라느 얘기가 나오기 마련이다. 당연히 가능하다!!!


        
    }


}
