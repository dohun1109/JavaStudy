package JavaProject.Chart03;

import java.util.Arrays;

public class IrregularArray {
    public static void main(String[] args) {
        int[][] intArray = new int[4][];
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        for (int i = 0; i< intArray.length; i++){
            for (int j =0 ; j<intArray[i].length; j++){
                intArray[i][j] = (i+1)*10 + j;
            }
        }
        for (int i = 0; i< intArray.length; i++){
            for (int j =0 ; j<intArray[i].length; j++){
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }

//        int[][] arr_Copy = new int[intArray.length][];
//        for (int i = 0; i< intArray.length; i++){
//            System.arraycopy(intArray[i], 0, arr_Copy[i], 0, intArray[i].length);
//        }
//        System.out.println(arr_Copy[0]);
    }
}
