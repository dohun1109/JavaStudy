package JavaProject.Chart04;

import java.util.Arrays;
import java.util.Scanner;

// 입력된 수의 합을 구하기(-1이 입렫되면 종료)
public class WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput = 0;
        int sum = 0;
        int[] arr = new int[5];

        int index = 0;

        while (true) {
            System.out.print("숫자 입력>");
            userInput = scan.nextInt();
            if (userInput == -1)break;

            //현재 배열의 범위를 벗어난 경우
            if (index == arr.length){
                int[] temp = new int[arr.length*2]; // 배열 2배 확장

                // 임시 배열에 내용을 복사
                for (int i = 0; i< arr.length;i++){
                    temp[i] = arr[i];
                }
                //임시 배열을 원래 배열로 바꿔치기
                arr = temp;
        }
            arr[index++] = userInput;
        }
            for (int i = 0; i<arr.length;i++){
                sum += arr[i];
            }
            System.out.println("배열"+ Arrays.toString(arr));
            System.out.println("입력된 수의 합은 "+ sum);
            System.out.println(" 평균"+(double) sum / index);



    }

}
