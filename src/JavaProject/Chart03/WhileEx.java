package JavaProject.Chart03;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        int sum = 0;
        //-1이 입력될때까지 입력된 수의 합을 구하시오.
        Scanner scan =new Scanner(System.in);
        System.out.println("숫자를 입력하시오: ");

        //반복의 횟수가 정해져 있지 않으므로 while loop
        while(true){
            int userInput = scan.nextInt();

            if(userInput == -1) break;
            sum += userInput;
        }
        System.out.println("sum : "+ sum);


    }
}
