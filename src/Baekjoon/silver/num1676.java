package Baekjoon.silver;

import java.util.Scanner;

public class num1676 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int count = 0;
        //팩토리얼 0의 개수를 구하는 문제
        // 팩토리얼에서 뒤에 0이 나오려면  소인수 분해 시 2 와 5의 곱셈으로
        // 이루어 져야만 한다. 그럼으로 팩토리얼 소인수 분해표를 보면 2와 5의 결합의 갯수가 즉
        // 뒤에서 부터 0의 개수 이다 . 그러나 2의 경우 팩토리얼에서 무조건 적으로  5보다 많으므로 5의 개수가
        // 팩토리얼 뒤 0의 개수라고 볼수 있다.
        


        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }
        System.out.println(count);
    }
}
