package JavaProject.Chart04;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오:");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요");
                scan.next();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " +
                sum);
        scan.close();
    }
}
