package JavaBasic.Generic;

public class Sample2<T> {
    private T value; //멤버 변수 value의 type은 T다.

    //T 타입의 값 val을 반환한다.
    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }


    public static void main(String[] args) {

        //정수형을 다루는 제네릭 클래스
        Sample2<Integer> s1 = new Sample2();
        s1.setValue(1);

        Sample2<Double> s2 = new Sample2<>();
        s2.setValue(1.12312);

        Sample2<String> s3 = new Sample2<>();
        s3.setValue("test String");

        System.out.println("s1.getValue() +\" \"+s2.getValue()+\" \"+s3.getValue() = " + s1.getValue() +" "+s2.getValue()+" "+s3.getValue());


    }
}
