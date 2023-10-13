package JavaProject.Chart05;


public class StudentEx {
    static int serialNum = 1000;
    int StudentID;
    String name;

    @Override
    public String toString() {
        return "StudentEx{" +
                "StudentID=" + StudentID +
                ", name='" + name + '\'' +
                '}';
    }

    public StudentEx(String name){
        StudentID = serialNum;
        serialNum++;
        this.name = name;
    }



    public static void main(String[] args) {
        StudentEx st1 = new StudentEx("김길동");
        StudentEx st2 = new StudentEx("이길동");
        StudentEx st3 = new StudentEx("홍길동");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
