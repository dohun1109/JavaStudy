package StandardOfJava.Generic.Comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d : compareTo = %d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }

        System.out.println("----".repeat(15));

        // a.compareTo(b)
        // a 와 b 를 비교 해서
        // a 기준 a 가 b 보다 작다 return -1
        // a 기준 a 가 b 보다 크다 return 1
        // a 기준 a 가 b 와 같다 return 0

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s : compareTo = %d%n", banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));



        /*  String compareTo 비교기
        *  String 에서 처음오는 문자의 대소 비교 (char)형태 이고 아스키코드로 변환해서 number 의 대소비교를 하는 형태
        * 즉, 비교할 때는 a.compareTo(b) 라고 할 떄에 a - b 의 형태로 값을 계한수 return 하게 된다 .
        *
        * sort() -> 위 와 같이 String 을 정렬하면
        * 각 String 의 첫문자를 아스키코드 표에서 10진수 형태의 숫자를 비교하여 작은순으로 정렬 하게 된다. 이에 대한 예제로 아래에 표시
        * */

        System.out.println("A: " + (int) 'A' + " " + "a: " + (int)'a');
        System.out.println("B: " + (int) 'B' + " " + "b: " + (int)'b');
        System.out.println("P: " + (int) 'P' + " " + "p: " + (int)'p');
        System.out.println("b - p => "+(int)'b' + " - "+(int)'p' + " = "+ ((int)'b'- (int)'p'));
        System.out.println("b - B => "+(int)'b' + " - "+(int)'B' + " = "+ ((int)'b'- (int)'B'));


        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Ann"), new Student("Tim")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        //사용자 생성 클래스 등 참조 유형에서 Primitive type 으로 어떻게 이루어 져있는지 정의 되지 않은 상태에서 비교하게 되면 오류가 발생한다 . 이를 위해서 Comparable interface 를 implements 해야 한다. 


        System.out.println("result =  " + tim.compareTo(new Student("TIM")));
        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
        
    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name); 
    }
}

class Student implements Comparable<Student>{

    private static int LAST_ID = 1000;
    private static Random random = new Random();
    String name;

    private int id;
    protected double gpa;
    
    public Student(String name) {

        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
         
    }

//    @Override
//    public int compareTo(Object o) {  //매개변수 형식 오류 -> 뒤에서 설명 
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
