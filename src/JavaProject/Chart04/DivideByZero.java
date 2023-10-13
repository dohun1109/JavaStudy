package JavaProject.Chart04;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;   //나뉨수
        int divisor;    //나눗수

        while(true){
            System.out.print("나뉨수를 입력하시오:");
            dividend = scanner.nextInt();
            System.out.print("나눗수를 입력하시오:");
            divisor = scanner.nextInt();
            try {
                System.out.println(dividend + "를" + divisor + "로 나누면 몫은" + dividend / divisor + " 입니다.");
                break;  //정상적인 나누기 완료후 while벗어나기

            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println(" 숫자 0으로 나눌수 없습니다.");
            }
        }
            scanner.close();



    }
}
