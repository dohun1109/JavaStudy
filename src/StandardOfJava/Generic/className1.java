package StandardOfJava.Generic;


//제네릭 클래스 2가지 제네릭 타입 사용 예제
public class className1<K, V> {

    private K first;
    private V second;


    void set(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }


    public static void main(String[] args) {

        className1<String, Integer> a = new className1<>();

        a.set("첫번째 제네릭 저장", 12345);

        System.out.println("first data -> " + a.getFirst());
        System.out.println("first type -> " + a.getFirst().getClass().getName());

        System.out.println("second data -> " + a.getSecond());
        System.out.println("second type -> " + a.getSecond().getClass().getName());


    }
}
