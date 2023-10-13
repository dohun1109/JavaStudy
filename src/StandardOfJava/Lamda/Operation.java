package StandardOfJava.Lamda;



@FunctionalInterface
public interface Operation<T> {
    T operate(T value1, T value2);


}
