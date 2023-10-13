package JavaProject.Chart03;

import java.util.Scanner;

//컴퓨터에서  1~ 100 까지 수를 발생하고 그 발생한 수를 찾는 프로그램.
public class LoopEx {
    public static void main(String[] args) {
        //임의의 수 발생( 0 ~ 0.99999)

        int num = (int)(Math.random()*100+1);//난수 생성

        Scanner scan = new Scanner(System.in);
//        System.out.println(num);
        System.out.print("숫자입력:");
        int s_num = scan.nextInt(); //user가 입력한 수
        int count = 0;              //입력 횟수

        while(true){
            count++;
            if(s_num > num){
                System.out.println("down");
                System.out.print("숫자 입력:");
                s_num = scan.nextInt();
            }else if(num == s_num){
                System.out.println("정답!");
                System.out.println(count+"회 만에 정답입니다.");
                break;
            }
            else {
                System.out.println("up");
                System.out.print("숫자 입력:");
                s_num = scan.nextInt();
            }

        }

    }
}
