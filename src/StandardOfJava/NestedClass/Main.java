package StandardOfJava.NestedClass;

public class Main {


}
// - Nested Class (중첩 클래스) 

//1. 맴버 클래스

class A {
    //1. 인스턴스 맴버 클래스
    //인스턴스 멤버 클래스는
    // 인스턴스 필드와 메소드만 선언이 가능하고
    // 정적 필드와 메소드는 선언할 수 없다.
    class B {
        //A 클래스 객체를 생성해야지만 사용할 수 있는 B 중첩클래스
        B() {
        }            // 생성자

        int field1;        // 인스턴스 필드

        void method1() {
        }// 인스턴스 메소드

        //static int field2;    정적 필드(X)
        //static void method(){}정적 메소드(X)


        //외부에서 생성 및 접근 방법
        //A a = new A();    -> A 클래스 인스턴스를 먼저 생성한다.
        //A.B b = a.new B();    -> .(dot) 를 사용하여 B 내부 클래스에 접근
        //b.field1 = 3;     ->  이후에 자유롭게 사용
        //b.method1();
    }

    //2. 정적 맴버 클래스
    static class C {
        //A 클래스로 바로 접근 가능한 정적 C 클래스
        //static 키워드로 선언된 클래스를 말한다.
        // 정적 멤버 클래스는 모든 종류의
        // 필드와 메소드를 선언할 수 있다.
        C() {
        }                    //생성자

        int field1;                //인스턴스 필드
        static int field2;        //정적 필드

        void method1() {
        }        //인스턴스 메소드

        static void method2() {
        }    //정적 메소드

        //A클래스 외부에서 사용방법
        //A클래스 외부에서 정적 멤버 클래스 C를 생성하기 위해서는
        // A를 생성할 필요가 없다.


    }

    //2. 로컬 클래스
    //메소드 내에 선언된 클래스를 로컬(local) 클래스라고 한다.
    // 로컬 클래스는 접근 제한자(public, private) 및 static을 붙일 수 없다.
    // 로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없기 때문이다.
    void method() {
        class D {
            //메소드 내부 클래스 메소드가 실행시에만 사용되고  메소드가 종료되면 사라짐.
            /* 로컬 클래스 */

            D() {
            }                //생성자

            int field1;            //인스턴스 필드

            void method1() {
            }    //인스턴스 메소드


        }
        D d = new D();
        d.field1 = 3;
        d.method1();
        //로컬 클래스는 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용해야한다.
        // 주로 비동기 처리를 위해 스레드 객체를 만들 때 사용한다.

    }
}

