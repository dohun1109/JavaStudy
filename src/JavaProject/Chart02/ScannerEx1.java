package JavaProject.Chart02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.print("문자열을 입력하시오: ");
//
//        String str = scan.nextLine();
//
//
//        String[] arr = str.split(" ");
//        for (int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        System.out.print("날짜을 입력하시오: ");
//        String str2 = scan.nextLine();
//        String[] arr1 = str2.split("/");
//        for (int i = 0; i<arr1.length; i++){
//            System.out.println(arr1[i]);
//        }


        //StringTokenizer
        //int countTokens() -> 분리한 토큰의 개수 리턴
        //boolean hasMoreTokens() -> 다음토큰이 있으면 true리턴
        //int nextToken() -> 다음 토큰 리턴
        System.out.println("문자를 입력하시오");
        String str3 = scan.nextLine();
        StringTokenizer st = new StringTokenizer(str3,",");
        int i = 1;
        while(st.hasMoreTokens()){
            System.out.println(i++ + "번째 문자열은"+st.nextToken());
        }
    }
}
