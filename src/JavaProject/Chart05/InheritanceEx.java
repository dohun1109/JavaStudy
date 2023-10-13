package JavaProject.Chart05;

class Person {
    private int weight;
    int age;
    protected int height;      //같은 페키지 자식 클래스 에서만 호출가능.
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}
class Student extends Person{
    public void set(){
        age = 30;
        name = "홍길동";
        height = 175;
        //weight = 90;
        setWeight(99);
    }
}

public class InheritanceEx {
    public InheritanceEx(int i) {
    }

    public static void main(String[] args) {
           Student s = new Student();
           s.set();
    }
}
