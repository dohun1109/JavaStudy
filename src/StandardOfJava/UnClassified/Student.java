package StandardOfJava.UnClassified;

public class Student extends Person{
    //field
    public int studentNo;

    //생성자 선언
    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    //메소드 선언
    public void study(){
        System.out.println("공부를 합니다");
    }

    
}
