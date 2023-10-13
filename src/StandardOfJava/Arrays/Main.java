package StandardOfJava.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrays = getRandomArrays(10);
        System.out.println(Arrays.toString(arrays));
        System.out.println(System.identityHashCode(arrays));

        //sort
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        System.out.println(System.identityHashCode(arrays));


        //fill
        int[] fillArr = new int[10];
        Arrays.fill(fillArr, 5);
        System.out.println(Arrays.toString(fillArr));

        //binarySearch
        String[] words = new String[]{"hello", "fuck", "awesome", "apple", "binary"};
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        // warning -> binarySearch 는 sort 이후 에 사용해야 한다.
        if (Arrays.binarySearch(words, "apple")>=0) {
            System.out.println("Found apple in the list");
            System.out.println("index : " + Arrays.binarySearch(words, "apple"));
        }

        
    }

    private static int[] getRandomArrays(int len) {
        Random ran = new Random();
        int[] intArr = new int[len];
        for (int i = 0; i < len; i++) {
            intArr[i] = ran.nextInt(100);
            
        }
        return intArr;

    }


}
