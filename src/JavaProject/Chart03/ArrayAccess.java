package JavaProject.Chart03;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하세요.: ");
        for (int i = 0; i<5; i++){
            arr[i] = scan.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("가장 큰 수는 :" + max + "입니다.");

    }
}
