package StandardOfJava.Lamda;



@FunctionalInterface    //단일 추상메소드만을 가지겠다라고 선언 즉, 추가 추상메소드를 생성할 수 없다.
public interface Operation<T> {
    T operate(T value1, T value2);


}
