package JavaBasic.kr.co.hanbit;

import javax.swing.text.html.Option;
import java.util.Optional;

interface A{
    void run();
}
abstract class B implements A{
    @Override
    public void run() {
        System.out.println("추상클래스에 구현된 run");
    }
}

class C extends B {

}


public class OptionalEx {

    private static String getSomeString(){
        return null;
    }

    public static void main(String[] args) {
        String isThisNull = getSomeString();

        // System.out.println(isThisNull.toUpperCase()); -> NullPointerException


        if (null != isThisNull) {
            System.out.println(isThisNull.toUpperCase());
        }

        // 비어있는 Optional return
        Optional<String> isThisNullEmpty = getSomeStringEmpty();
        isThisNullEmpty.ifPresent(str -> System.out.println(str.toUpperCase()));
        //위의 if 문을 통해 null 을 체크하는 메소드와 동일하게 동작한다.


        Optional<String> isThisNullOptional = getSomeStringOptional();
        isThisNullOptional.ifPresent(str -> System.out.println(str.toUpperCase()));

        //안티 패턴 
        Optional<String> str = getSomeStringOptional();
        if (str.isPresent()) {
            System.out.println(str.get().toUpperCase());
        }

        str.ifPresent((string) -> System.out.println(string.toUpperCase()));

        A test = new C();
        test.run();

    }

    public static Optional<String> getSomeStringEmpty(){
        return Optional.empty();    //null을 반환하는 것이 아니라 비어 있는 Optional을 반환한다.
    }

    public static Optional<String> getSomeStringOptional(){
        return Optional.ofNullable("public static void");
    }


}
