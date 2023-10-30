package StandardOfJava.Lamda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MiniProject {

    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };


        printWords.accept("Let's split this up into an array");
        System.out.println("----".repeat(4));
        System.out.println("----".repeat(4));
        printWordsLambda.accept("Let's split this up into an array");

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        //System.out.println(everySecondChar.apply("0123456789")); // 이렇게 해도 되지만 OCP 와 DIP 지키고 확장성을 고려하기위해
        //아래와 같이 메소드 선언 -> 이유 : 여러가지로 타입의 다형성이 보장되기 때문 즉, 클라이언트코드를 고치지 않고 비지니스 로직을 수정가능 
        System.out.println(everySecondCharacter(everySecondChar, "01234567890"));
        
                

    }
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }




}
