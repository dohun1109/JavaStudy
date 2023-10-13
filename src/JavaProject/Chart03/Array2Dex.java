package JavaProject.Chart03;

import java.util.Arrays;

public class Array2Dex {
    public static void main(String[] args) {

        int[][] arr = {{1,2},{3,4},{5,6}};
        //2차원 배열은 첫번째 값만이 중요하다.
        int[][] arr1 = new int[3][2];

        int[][] arr2 = new int[3][];
        int[][] arr3  = {{10},{20,30},{40,50,60}};

        for (int i = 0; i< arr3.length;i++){
            for (int j = 0; j< arr3[i].length; j++){
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(arr3[2][1]);
        System.out.println("30 : "  + arr3[1][1]);







    }
}
