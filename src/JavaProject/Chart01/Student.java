package JavaProject.Chart01;

//클랫의 용도
//1)객체(instance)를 만드는 도구
//2)사용자정의 타입
public class Student extends Object{
    //member data(state)
    private String name;
    private int age;

    //behavior(action)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //오버라이딩 -부모클래스의 메소드를 재정의

    public String toString(){
     return name+age;
    }


}
