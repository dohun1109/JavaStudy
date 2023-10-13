package StandardOfJava.UnClassified;

public class InstanceOfEx {
    //main() method 에서 바로 호출하기위해 static method 선언
    public static void personInfo(Person person){
        System.out.println("name" + person.name);
        person.walk();

        //person reference Object Student type check!

//        if (person instanceof Student) {
//            //Student object type casting
//            Student stu = (Student) person;
//            //Student object 만 가지고 있는 필드 및 메소드 사용
//            System.out.println("studentNo" + stu.studentNo);
//            stu.study();
//        }

        //person 이 참고하는 객체가 Student type 경우
        // student 변수에 대입 (type promotion)
        //Java 12 version 부터 사용가능
        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        //Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출

        Person p2 = new Student("김길동", 10);
        personInfo(p2);

        
    }
}
