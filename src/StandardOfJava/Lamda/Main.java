package StandardOfJava.Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

import static java.util.Arrays.compare;

public class Main {


    record Person(String firstName, String lastName){

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
        
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("김", "가"),
                new Person("홍", "나"),
                new Person("황", "가"),
                new Person("이", "나"),
                new Person("노", "고")
        ));
        //java 10
        //java 10에서 도입된 var는 변수를 선언할 때 타입을 생략할 수 있다, 컴파일러가 타입을 추론한다.
        //그리고 컴파일 타임에 추론하는 것이기 때문에, Runtime 에 추가 연산을 하지 않아 성능에 영향을 주지는 않습니다.
        // 그리고 var는 지역 변수에서만 사용할 수 있다. 또한 컴파일러가 타입을 추론할 수 없는 애매한 상황일 때 컴파일 에러가 발생합니다.
        //Using anonymous class

        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };


//        people.sort(comparatorLastName);

        /**
         *people.sort(new Comparator<Person>() {
         *
         * public int compare(Person o1, Person o2) {
         *
         *  return o1.lastName().compareTo(o2.lastName());
         *
         *             }
         *
         * });
         * 위 코드가 아래의 람다식으로 변환 가능.즉, 매우 간결해 진다.
         */

        
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));


        System.out.println(people);


        /**
         * local interface -> jdk16 버전 이후 부터 선언할 수 있는 내부 인터페이스 이다.
         */
//        @FunctionalInterface -> 오류 ; 이유: 추상메소드가 여러개 이기 때문
        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        /*  Functional Interface -> 단 1개의 추상메소드 만을 가지는 인터페이스를 지칭한다.
         *  자바에서 람다식이 성립하면 하나의 추상메소드만을 가지고 있는 interface 만 람다식으로 변경이 가능하다.
         *  물론 상속 관계 및 다중으로 연결된 인터페이스 등등 모든 구현체에서 구현해야할 추상메소드가 단 1개인
         *  interface 만을 Lambda 로 사용가능하다.
         *  아래와 같은 상황에서 람다식을 쓸수 없는 이유는
         * Java 는 여러개의 추상메소드가 존재할 경우 어떤 추상메소드를 람다로 구현해야하는지 판단할 수 없기 때문이다.
         *  이를 확인하기 위해서 Java Annotation 을 사용할 수 있다.
         * @Functional Interface
         */
        var comparatorMixed = new EnhancedComparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result);    //True-> secondLevel , False -> result 
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };
        people.sort(comparatorMixed);
        System.out.println("people = " + people);


        



    }


















}
