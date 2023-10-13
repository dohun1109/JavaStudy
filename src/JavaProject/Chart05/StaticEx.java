package JavaProject.Chart05;

import java.util.Scanner;

public class StaticEx {
    int n;                            //member variable   : 각 객체마다 고유의 값을 가진다.
    static int m;                     //static variable : 모든 객체가 공유된다.

    public void doA(){}
    public static void doB(){}


    public static void main(String[] args) {

        m = 100;
//        StaticEx.m = 100;
//        n = 1111;         --> 각 각의 객체마다 고유하므로 instance variable 메소드로 불러들여야 한다.(즉,객체를 통해 접근해야함)
//        doA();
        doB();          //static method 는 class 명으로 접근이 가능하다.
        

        StaticEx ss = new StaticEx();
        ss.n = 10;
        System.out.println("ss.m :" + m);
        System.out.println("ss : " + ss.n);

        StaticEx ss1 = new StaticEx();
        ss1.n = 20;
        ss1.m = 200;
        System.out.println("ss.m :" + ss1.m);
        System.out.println("ss1 : " + ss1.n);
        System.out.println("ss.m :" + m);

        //임의의 수 발생 0 ~ 99999
        Math.random();           //static method  ,즉, 클래스 명으로 접근가능.

        Scanner scan = new Scanner(System.in);  //general method, 객체(instance)를 통해 접근만 가능.

        int arr = scan.nextInt();

    }
}
