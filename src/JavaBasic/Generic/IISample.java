package JavaBasic.Generic;

public interface IISample<T> {
    public void addElement(T t, int index);

    public T getElement(int index);
}
interface IAdd<T>{
    public T add(T x, T y);
}
class IFruitBox<T> {
    public T addBox(T x, T y){
        return x;
    }
    public static <T> T addBoxStatic(T x, T y){
        return x;
    }
}
class SampleT<T> implements IISample<T>{
    private T[] arrays;

    public SampleT() {
        arrays = (T[]) new Object[10];
    }

    @Override
    public void addElement(T element, int index) {
        arrays[index] = element;
    }

    @Override
    public T getElement(int index) {
        return arrays[index];
    }

    public static void main(String[] args) {
        SampleT<String> sample = new SampleT<>();
        sample.addElement("This is String", 5);
        System.out.println(sample.getElement(5));

        //제네릭을 통해 람다 함수의 타입을 결정
        IAdd<Integer> o = (x, y) -> x + y; //파라미터 x 와 y 그리고 반환형 타입이 int 형(type casting in Wrapper class)으로 설정
        int result = o.add(10, 20);
        System.out.println("result = " + result);

        System.out.println(IFruitBox.<Integer>addBoxStatic(1,2).getClass().getSimpleName());
        System.out.println(IFruitBox.<String>addBoxStatic("안녕", "잘가").getClass().getSimpleName());// 메서드의 제네릭 타입 생략

        

    }
}


