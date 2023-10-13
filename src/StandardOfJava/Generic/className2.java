package StandardOfJava.Generic;


//제한된 Generic && wild Card

/* extends T : 상한 경계 ( 최상위 가 T로 지정된다 즉, T 와 T의 자식까지)
*  super T : 하한 경계 (T 와 T의 부모 타입 만 가능)
* <?> : 와일드 카드(Wild card)
* */




public class className2 <K extends Number>{
    /*
    * <K extends T>	// T와 T의 자손 타입만 가능 (K는 들어오는 타입으로 지정 됨)
    * <K super T>	// T와 T의 부모(조상) 타입만 가능 (K는 들어오는 타입으로 지정 됨)
    * <? extends T>	// T와 T의 자손 타입만 가능
    * <? super T>	// T와 T의 부모(조상) 타입만 가능
    * <?>  // 모든 타입 가능. <? extends Object>랑 같은 의미
    * */

    public static void main(String[] args) {

        className2<Double> a1 = new className2<>(); //ok
//        className2<String> a2 = new className2<String>(); //error!
        //Bound mismatch -> 
    }


    //    <K super B>	// B와 A타입만 올 수 있음
    //<K super E>	// E, D, A타입만 올 수 있음
    //<K super A>	// A타입만 올 수 있음

    //<? super B>	// B와 A타입만 올 수 있음
    //<? super E>	// E, D, A타입만 올 수 있음
    //<? super A>	// A타입만 올 수 있음


    //대표적으로 해당 객체가 업캐스팅이 될 필요가 있을 때 사용한다.
    //예를 들어 '과일' 이라는 클래스가 있고 이 클래스를 각각 상속받는 '사과','딸기' 클래스가 있다고 해보자. 이 떄 각각의 사과와 딸기는 종류가 다르지만, 둘 다 과일로 보고 자료를 조작해야 될 수도 있다. (예를 들면 목록을 뽑는다거나) 그럴 때 '사과'를 '과일'로 캐스팅 해야 하는데, 과일이 상위 타입이므로 업캐스팅을 해야한다. 이때 쓸 수 있는게 super 이다.

    //좀더 현실성 있는거로는 제네릭 타입에 대한 객체 비교가 있다.
    //public class className <E extends Comparable<? super E>> {...}

    //SaltClass 로 
    
    
}

