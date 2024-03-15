package JavaBasic;


class test1<T, U> {

    public static <T, U> void printTest(T x, U y) {
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
    }

}

public class test<T> {

    public T addTest(T x, T y) {
        return x;
    }

    public static <T> T addTestStatic(T x, T y) {
        return x;
    }




    public static void main(String[] args) {
        test.<Integer>addTestStatic(1, 2);
        test.<String>addTestStatic("안녕", "잘가");

        //위 의 호출에서 컴파일러가 제네릭 타입에 들어갈 데이터 타입을 argument 로 타입추론 가능하기때문에 생략가능.
        Integer value = test.addTestStatic(1, 2);   //이렇게
        System.out.println("value = " + value);
        
       //Generic method 의 경우 독립적으로 운영되는데, 처음 제네릭클래스를 인스턴스화 하면, 클래스 타입 파라미터가 전달된 arg 에 따라 타입이 정해지게 된다. 그런데 만일 제네릭 메소드를 호출할 때 직접 파라미터를 다르게 지정해주거나, 다른 타입의 데이터를 파라미터로 넘기게 된다면 독립적인 타입을 가진 제네릭 메서드를 사용하게 된다.

        
        //독립적인 운용 Ex
        test1<Integer, Long> case1 = new test1<>();

        //인스턴스화 되어 지정된 타입
        case1.printTest(1, 1);


        //하지만 제네릭 메서드에 다른 타입 파라미터를 지정하면 독립적으로 운영
        test1.printTest("hello", 5.55);




        
    }

}
