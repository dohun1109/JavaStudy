package JavaProject.Chart01;

public class VarEx1 {
    public static void main(String[] args) {
        //type casting(형변환)

        int a = 10;
        byte b = 20;

        //묵시적 형변환(type promotion - 자동으로 형변환, byte -> int), 데이터의 손실x
        a = b;

        //명시적 형변환(type casting - 자동으로 형변환이 일어나지 않고 강제적으로 형변환을 해주어야 한다.
        //즉 큰 타입의 데이터를 작은 타입의 데이터로 변환 ,데이터의 손실이 o

        b = (byte)a;

        //p와 stu 변수는 타입의 크기를 비교할 수 없다.
        Person p = new Person("kim",20,1234);
        Student stu = new Student("Lee",20);

        YNCStudent ystu = new YNCStudent("Kim",20,"영남");

        //부모클래스가 큰 변수이다.
        //stu와 ystu는 크기를 비교할 수 있다. stu > ystu





    }
}
