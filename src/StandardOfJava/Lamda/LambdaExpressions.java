package StandardOfJava.Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressions{

    /**
     *  Local Record Class 는 Static 영역 즉, heap 메모리 영역에 저장됨으로 ClassName 으로 직접 접근이 가능하다. 외부에서
     * @param firstName
     * @param lastName
     */
    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {


        List<String> list = new ArrayList<>(List.of(
                "alpha","bravo","charlie","delta"));
        for (String s : list) {
            System.out.println("s = " + s);
        }

        System.out.println("-------------");
        list.forEach((s) -> System.out.println(s));
        //그냥 변수명만 사용해도되는 이유> 자바는 타입추론이가능하기 때문.
        //그리고 forEach() 문을 통해 하나의 abstractMethod가 존재 하며 return 값이 존재 하기 때문에 람다식 사용가능
        //사실상 하나만 존재한다기 보다는 jdk8 버전 이후 인터페이스 의존성을 낮추기 위해 default 키워드를 통한 메서드를 사용할 수 있게 되었기에 구현체에서 원한다면 변경가능하고 딱히 변경하거나 구현하고싶지 않다 그러면 굳이 다시 오버라이딩해서 구현할 필요가 사라짐으로 의존성이 낮아지게 되었다. 즉, 결론적으로 람다식을 사용할 수 있다는 것이다. 아 그리고 파라미터로 넘길 변수가 하나밖에 없다면 (s)->s 말고 s->s 이런식으로 바로 사용하는 것도 가능하다.
        System.out.println("-------");
        String prefix = "결과 :";
        list.forEach((var myString)->{
            char first = myString.charAt(0);
            System.out.println(prefix + " "+myString + "에서 비교한 부분 -> " + first );
        });


        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
        var result3 = calculator((a, b) -> a.toUpperCase() + " "+b.toUpperCase(),"Ralph" ,"Kramden" );
    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }






}
