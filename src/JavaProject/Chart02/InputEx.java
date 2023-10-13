package JavaProject.Chart02;

import java.util.Scanner;

public class InputEx {


    public static void main(String[] args) {
        //키보드로부터 입력된 숫자를 화면에 출력하는 프로그램을 작성하시오.
        System.out.print("숫자를 입력하시오 : ");

        //Scanner 입력

        Scanner scan = new Scanner(System.in);
//        int userInput = scan.nextInt(); //scan <-10

        //next() 와 nextLine()의 차이 공백을 받을수 있나없나 차이
//        String str = scan.next();

          String str = scan.nextLine();


        //출력
//        System.out.println("입력된 숫자는 : "+ userInput+ " 입니다");
        System.out.println("입력된 문자는 : "+ str+ " 입니다");

    }
}
