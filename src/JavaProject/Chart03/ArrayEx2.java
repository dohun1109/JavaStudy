package JavaProject.Chart03;

import java.util.Arrays;

public class ArrayEx2 {

    public static void main(String[] args) {

        //arr배열을 2배 확장한 arr1 배열을 만드시오.
        int[] arr = {1,2,3,4,5};
        int[] arr1 ;
        System.out.println("arr[]의 크기:"+arr.length);
        int arr_num = arr.length * 2;

        arr1 = new int[arr_num];
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.arraycopy(arr,0,arr1,5,arr.length);

        System.out.println("arr1[]의 크기:"+arr1.length);
        System.out.println("arr1[] :"+ Arrays.toString(arr1));

    }
}
