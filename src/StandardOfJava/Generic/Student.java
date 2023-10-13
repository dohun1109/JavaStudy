package StandardOfJava.Generic;

class SaltClass<E extends Comparable<E>> {

}
public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public static void main(String[] args) {
        SaltClass<Student> a = new SaltClass<>();
        
    }
}

