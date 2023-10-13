package JavaProject.Chart04;

public class StudentRunner {
    public static void main(String[] args) {
//        Student stu1 = new Student("Kim",20);
//        Student stu2 = new Student("Lee",21);

        Student stu1 = new Student();
//        stu1.name = "Kim";
//        stu1.age = 20;

        Student stu2 = new Student();
//        stu2.name = "Lee";
//        stu2.age = 21;

        Student stu3 = new Student("Park",22);
        stu3.setName("Hong");
        stu3.setAge(23);
        System.out.println("이름:"+stu3.getName()+"나이:" +
                stu3.getAge());

        //Object클래스의 toString()메소드
        System.out.println(stu1);
        //객체(instance)의 변수명에 저장된 heap 메모리 참조 주소를 toString으로 문자열로 출력
        System.out.println(stu2);
        System.out.println(stu3);
        
    }
}
