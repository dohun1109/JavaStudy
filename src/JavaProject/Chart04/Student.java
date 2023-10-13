package JavaProject.Chart04;

public class Student {
    //클래스에 생성자가 하나도 없으면 기본생성자는 JVM이 자동으로 넣어준다.
    //그러나 사용자정의 생성자가 생성되면 자동으로 넣어주지 않는다.
    //접근 제어자 (제한자) - protected - public - default - private

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //오버라이딩 ; 부모클래스의 메소드를 다시 재정의 하는 것.
    @Override                //상속 -> 자식 클래스가 부모 클래스의 속성을 물려받고, 기능 확장
                             //부모 클래스 : 슈퍼 클래스 , 하위 클래스 ->서브 클래스,수퍼클래스를 재사용 하고, 새로운 특성 추가
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private String name;          //private 로 외부 접근 거부 (encapsulation)
                                //캡슐화 이점 1. 메소드로 멤버변수 접근제어 2.비즈니스 로직 간편화
    private int age;
    //defalt
    //일반적으로 멤버 변수는 private선언
    //데이터를 외부에서 마음대로 조작하지 못하도록 private로 선언
    //외부에서 접근하려면 메소드를 통해 접근해라
    public Student() {
        
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name) {
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }

}
