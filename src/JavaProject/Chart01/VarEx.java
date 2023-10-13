package JavaProject.Chart01;

import java.sql.SQLOutput;

public class VarEx {
    public static void main(String[] args) {
        //자바의 변수 : 데이터를 담는 그릇, 메모리 공간을 확보
        //1) 기본형 변수(primitive type) - 8
        //2) 참조형 변수(reference type) - 4(class, interface, array, enum)
        //state(data)
        int num = 10;   //기본형   -실제 값이 저장
        //int[] arr = new int[3];     //참조형   -실제값이 있는 곳의 주소값을 저장.
        int[] arr = {10,20,30};

        //behavior(action)
        System.out.println("num: "+num);
        System.out.println("arr: "+arr);
        System.out.println("arr[0]: "+arr[0]);

        //클래스를 만든다는 것을 사용자가 변수의 타입을 만드는 것이다.
        //ex)Student type , stu1 : 객체, 참조변수, 인스턴스
        Student stu1 = new Student("kim",20);
        System.out.println("stu1 :" + stu1);
        System.out.println("stu1 :" + stu1.toString());

        Student stu2 = new Student("Lee",22);
        System.out.println("stu2 :"+stu2.toString());

        byte a = 100;   //-128~ +127
        float b = 10.2f;
        double d = 12.3;

//        a = 13.3; 강제형변환(data손실) type casting
//        a = 300;
        int aa = 300;
        char ch = 'A';
//        ch = "aaa";
        String str = "AAA"; //String type은 java 만 있음.












    }
}
