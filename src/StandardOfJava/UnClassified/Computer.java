package StandardOfJava.UnClassified;

public class Computer {

    //가변 길이의 매개변수를 갖는 메소드 선언
    int sum(int... values) {
        int sum = 0;    //sum 변수 선언.

        for (int i = 0; i < values.length; i++) {
            sum += values[i];        //매개변수의 값을 sum 에 더함.
        }

        return sum; //합산 결과 return.

        //return 문 뒤에 실행문을 작성할 경우 Unreachable Exception Error 발생.
        // System.out.println(); ->  Unreachable Exception

    }
}
