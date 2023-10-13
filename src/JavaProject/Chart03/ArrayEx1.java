package JavaProject.Chart03;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = arr;

        arr[0] = 100;
        //arr1[0] = ??;

        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr1[0]: " + arr1[0]);

        //arr배열을 arr2배열로 복사
        int[] arr2 = new int[5];
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println("------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        arr[0] = 1000;

        System.out.println("arr[0]값 변경후-----");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("arraycopy()-------");
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
