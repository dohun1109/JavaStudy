package StandardOfJava.Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class LambdaExpressions {

    /**
     * Local Record Class 는 Static 영역 즉, heap 메모리 영역에 저장됨으로 ClassName 으로 직접 접근이 가능하다. 외부에서
     *
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
                "alpha", "bravo", "charlie", "delta"));
//        for (String s : list) {
//            System.out.println("s = " + s);
//        }

        System.out.println("-------------".repeat(5));

        list.forEach((s) -> System.out.println(s));
        //그냥 변수명만 사용해도되는 이유> 자바는 타입추론이가능하기 때문.
        //그리고 forEach() 문을 통해 하나의 abstractMethod가 존재 하며 return 값이 존재 하기 때문에 람다식 사용가능
        //사실상 하나만 존재한다기 보다는 jdk8 버전 이후 인터페이스 의존성을 낮추기 위해 default 키워드를 통한 메서드를 사용할 수 있게 되었기에 구현체에서 원한다면 변경가능하고 딱히 변경하거나 구현하고싶지 않다 그러면 굳이 다시 오버라이딩해서 구현할 필요가 사라짐으로 의존성이 낮아지게 되었다. 즉, 결론적으로 람다식을 사용할 수 있다는 것이다. 아 그리고 파라미터로 넘길 변수가 하나밖에 없다면 (s)->s 말고 s->s 이런식으로 바로 사용하는 것도 가능하다.

        list.forEach(System.out::println);  //-> 메소드 참조(::)


        System.out.println("-------".repeat(10));
        String prefix = "결과 :";

        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + "에서 비교한 부분 -> " + first);
        });


        int result = calculator((a, b) -> {
            if (a > b) return a + b;
            else return a * b;
        }, 5, 10);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
        var result3 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");


        // ------------- 자바에서 지원하는 Functional interface 중 Consumer<T> -------
        var cords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}
        );
        cords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("[lat: %.3f lon: %.3f]%n", lat, lng);
        var firstPoint = cords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        System.out.println("-------".repeat(4));
        cords.forEach(s -> processPoint(s[0], s[1], p1));


        System.out.println("-------".repeat(4));
        cords.forEach(s -> processPoint(s[0], s[1], (lat, lng) ->
                System.out.printf("[lat: %.3f lon: %.3f]%n", lat, lng))
        );

        // -------------- Functional interface : Predicate Lambda Expression --------
        // 문자열을 받아 리터럴 텍스트와 같은지(참조 메모리 값이 같은지, 새로 만들어지진 않았는지 ;String 의 immutable) 테스트 Ex
        // s -> s.equalsIgnoreCase("hello") -> boolean 값 return
        list.removeIf(s -> s.equalsIgnoreCase("bravo")); //s 는 String 으로 java 에서 자동 추론된다.
        list.forEach(s -> System.out.println(s));

        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach(s -> System.out.println("s = " + s));

        System.out.println("-----".repeat(4));
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println("s = " + s));

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("------".repeat(4));
        list.forEach(s -> System.out.println("s = " + s));

        String[] emptyStrings = new String[10];
        System.out.println("emptuStrings = " + Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings, "");
        System.out.println("emptyStrings = " + Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> " " + (i + 1) + ". ");
        System.out.println("emptyStrings = " + Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> " " + (i + 1) + ". "
                        + switch (i) {
                    case 0 -> "one";
                    case 1 -> "two";
                    case 2 -> "three";
                    default -> "";

                }
        );
        System.out.println("emptyStrings = " + Arrays.toString(emptyStrings));

        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList = randomlySelectedValues(15, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println("args = " + Arrays.toString(randomList));
        
        
    }


    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
    //로컬 변수로 코드를 생성하고 java가 bool로 추론하도록 해 형식선언을 단순화 한다. -> 람다 표현식으로 단순화 시키겠다.

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count,
                                                  String[] values,
                                                  Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }


}
