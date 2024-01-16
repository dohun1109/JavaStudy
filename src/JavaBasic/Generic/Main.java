package JavaBasic.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;


class Unit{
    public void attack(){
        System.out.println("유닛공격");
    }
}
class Zealot extends Unit{
    int test = 10;
    public void attack(){
        System.out.println(test + "찌르기");
    }
    public void teleportation(){
        System.out.println("프로토스 워프");
    }
}

class Fruit {}
class Apple extends Fruit{}
class Banana extends Fruit{}
class FruitBox<T>{
    List<T> fruits = new ArrayList<>();

    public void add(T fruit){
        fruits.add(fruit);

    }
}
class MultiFruitBox<T , U>{
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana) {
        apples.add(apple);
        bananas.add(banana);
    }
}

class Sample<T> {
    private T num;
    public Sample(T integer) {
        this.num = integer;
    }

    public T getNum() {
        return num;
    }
}
public class Main {
    public static void main(String[] args) {
        // 제네릭 타입 매개변수에 정수 타입을 할당
        FruitBox<Integer> intBox = new FruitBox<>();
        // 제네릭 타입 매개변수에 실수 타입을 할당
        FruitBox<Double> douBox = new FruitBox<>();
        // 제네릭 타입 매개변수에 문자열 타입을 할당
        FruitBox<String> strBox = new FruitBox<>();
        //클래스도 넣어줄 수 있다.
        FruitBox<Apple> clsBox = new FruitBox<>();

        /* 타입 파라미터 생략
         * jdk1.7 버전 부터 new 생성자 부분까지 타입을 지정해주지 않아도 된다. 제네릭 나름대로 타입 추론을 해서 생략된 곳에 넣어주기 때문
         * 그리고, 제네릭에서 할당 받을 수 있는 타입은 Reference type 뿐이다. 즉, int, double 형 같은 자바 원시타입(Raw type)을 제네릭 타입 파라미터로 넘길 수 없다. 즉, Wrapper 클래스가 이러한 이유로 사용된다. Wrapper class 로 넘겨주게 되면 내부에서 자동으로 언박싱되어 원시 타입으로 이용된다.
         */

        intBox.add(123);
        douBox.add(13.2345);
        strBox.add("Dump");


        Unit unit = new Zealot();
        unit.attack();

        FruitBox<Fruit> box = new FruitBox<>();


        // 제네릭 타입은 다형성 원리가 그대로 적용된다.
        box.add(new Fruit());
        box.add(new Apple());
        box.add(new Banana());
        System.out.println(box.fruits);

        MultiFruitBox<Apple, Banana> box2 = new MultiFruitBox<>();
        box2.add(new Apple(), new Banana());
        box2.add(new Apple(), new Banana());
        System.out.println("box2.apples , box2.bananas = " + box2.apples + box2.bananas);


        // LinkedList<String> 을 원소로서 저장하는 ArrayList
        ArrayList<LinkedList<String>> list = new ArrayList<>();


        LinkedList<String> node1 = new LinkedList<>();
        node1.add("aa");
        node1.add("bb");

        LinkedList<String> node2 = new LinkedList<>();
        node2.add("11");
        node2.add("22");

        list.add(node1);
        list.add(node2);
        System.out.println("list = " + list);


        /* 타입 파라미터 기호 네이밍
        * 지금 까지 제네릭 기호를 <T> 로 써서 표현했지만, 사실 명시적인 방법만 있을분 문법적으로 정해진 것은 아니다. 다만 우리가 for문을 사용할 때 루프 변수르 i로 지정하듯이, 제네릭 표현 변수를 T로 표현한다. 그리고 2번째,3번째는 for문의 i,j,k 처럼 T,S,U 이런식으로 나아간다.
        *
        * <T> : 타입
        * <E> : 요소(Element) ex)List
        * <K> : 키(Key) , ex) Map<k,v>
        * <V> : 리턴 값, 또는 매핑된 값
        * <N> : 숫자(Numberic)
        * <S, U, V> : 2,3,4
        */

        /* 컴파일 타임에 타입 검사를 통해 예외 방지
        * 자바에서 제네릭 (Generic)은 자바1.5에 추가된 스펙이다. 그래서 JDK1.5 이전에는 여러 타입을 다루기위해 인수나 반환값으로 Object 타입을 사용했다. 하지만 Object로 타입을 선언할 경우 Object 객체르 다시 원하는 타입으로 일일히 타입변환을 해야하며, 런타임 에러가 발생할 가능성도 존재하게 된다.
        */



        //new Sample<Integer>() 인스턴스만 저장하는 배열을 나타냄
         Sample<Integer>[] arr1 = new Sample[3];

        arr1[0] = new Sample<>(10);
        arr1[1] = new Sample<>(30);
        arr1[2] = new Sample<>(20);
//        for (Sample<Integer> integerSample : arr1) {
//            System.out.print(integerSample.getNum() + " ");
//        }
        Arrays.stream(arr1).forEach(Sample -> System.out.print(Sample.getNum()+" "));

        



    }

}
