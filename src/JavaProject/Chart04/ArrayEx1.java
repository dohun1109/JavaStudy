package JavaProject.Chart04;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //배열 2배 확장
        int[] arr1 = new int[arr.length*2];

        for (int i = 0; i<arr.length;i++){
            arr1[i] = arr[i];
        }
        System.out.println("arr:"+ Arrays.toString(arr));
        System.out.println("arr1:"+Arrays.toString(arr1));

    }
}
