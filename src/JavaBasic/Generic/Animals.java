package JavaBasic.Generic;

public class Animals<T , U> {
    //독립적으로 운용되는 제네릭 메서드
    public <T, U> void printBox(T x, U y){
        //해당 매개변수의 타입을 출력 reflection
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
    }


    public static void main(String[] args) {
        Animals<Integer, Long> box1 = new Animals<>();

        //인스턴스화에 지정된 타입 파라미터 <Integer, Loong>
        box1.printBox(1, 1);

        //하지만 제네릭 메서드에 다른 타입 파라미터를 지정하면 독립적으로 운용된다.
        box1.<String, Double>printBox("hello", 5.55);



    }

    
}
