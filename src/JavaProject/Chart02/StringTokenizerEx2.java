package JavaProject.Chart02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        //StringTokenizer 2+3+5+66+88+323
        Scanner scan = new Scanner(System.in);

        System.out.println("더할 문자열을 입력하시오(공백으로 띄우시오):");
        String str = scan.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int sum = 0;
        while (st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("입력한 수의 합은 :"+sum);

    }
}
