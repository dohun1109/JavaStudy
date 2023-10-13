package StandardOfJava.API_Object_System;

public class main {


    //자바 에서 제공하는 API(Application Programming Interface)
    /* API는 라이브러리(library)라고 부르기도 하는데, 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
    *  이 API는 <JDK설치경로> /jre/lib/rt.jar 에 저장되어있다.
    *  */

    /*  java.lang 패키지   -> 자바 프로그램의 기본적인 크래스를 담고 있는 패키지 이다.
    *   그래서 import 하지 않고 java.lang 에 속한 클래스와 인터페이스를 사용할 수 있다. 
    *   Object -> 자바 클래스의 최상위 클래스로 사용
    *   System -> 표준 입력 장치(키보드)로 부터 데이터를 입력 받을 때 사용, 자바 가상 기계(JVM)를 종료시킬때 사용,
    *   , 쓰레기 수집기(GC ;Garbage Collection)를 실행 요청할 때 사용
    *   Class -> 클래스를 메모리로 로딩할 때 사용  
    *   Math -> 수학 함수를 이용할 때 사용
    *   Wrapper -> 기본 타입의 데이터를 갖는 객체를 만들 때 사용
    *   ,문자열을 기본타입으로 변환할 때 사용
    *   ,입력값 검사에 사용
    *
    * */



    //Object Class
    //클래스 선언시 extends 키워드로 상속하지 않으면 암시적으로 java.lang.Object 클래스를 상속
    //즉, 자바의 모든 클래스는 Object 클래스의 자식이거나 자손클래스이다.
    //Object 는 자바의 최상위 부모 클래스이다.


    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString());

        //java.lang.Object@7e0babb1



        
    }

    
    
}

//객체 비교  equals()
//public boolean equals(Object obj) {...}

class Member{
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        // parameter 가 Object 이므로 모든 객체가 대입될 수 있음을 알수 있다.
        // (자동 타입 변환) 두 객체가 동일한 객체라면 true, 아니라면 false
        if (o instanceof clone) { //instanceof -> 비교 객체가 다른타입이면 false
            clone member  = (clone) o;
            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    //객체 해시코드(hashCode())
    /*  객체 해시코드란 객체를 식별할 하나의 정수 값을 말한다. 객체의 메모리 번지를 이용해서
    *   해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가지고 있다. 논리적 동등 비교시
    *   hashCode() 를 오버라이딩 할 필요성이 있다.
    *
    *   hashCode() 리턴값 비교
    *       같음 -> equals() 리턴값 비교
    *           같음 -> 동등 객체
    *           다름 -> 다른 객체
    *       다름 -> 다른 객체 
    * */



    //객체 문자 정보(toString())
    // 객체의 문자 정보를 리턴한다. 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다.
    // 기본적으로 Object class 의 toString() 은 "클래스명@16진수해시코드" 로 구성된 문자정보를 리턴한다.



    



}
