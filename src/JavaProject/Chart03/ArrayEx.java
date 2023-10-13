package JavaProject.Chart03;

import java.lang.reflect.Array;

public class ArrayEx {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("a : " + a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);

        //참조형 변수(reference variable) - 실제 값이 있는 곳을 가리키는 정수값이 저장
//        int[] arr = {10,20,30};
        int[] arr = new int[3];


        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+",\t");
        }

    }
}
