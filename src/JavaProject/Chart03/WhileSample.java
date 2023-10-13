package JavaProject.Chart03;

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1");

        int n = scan.nextInt();
        while (true){
            if(n == -1)break;
            sum+=n;
            count++;
            n = scan.nextInt();
        }
        System.out.println("정수의 개수는 :"+count+ "정수의 평균은"+(double)sum/count);

    }
}
