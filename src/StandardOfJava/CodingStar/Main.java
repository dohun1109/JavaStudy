package StandardOfJava.CodingStar;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();


        System.out.println("input1 = " + input1);
        System.out.println("input2 = " + input2);


        List<Integer> Combination = new ArrayList<>();
        String num = String.valueOf(input1);
        int[] digits = new int[num.length()];

        for(int i = 0; i<digits.length; i++ ) {
            digits[i] = Character.getNumericValue(num.charAt(i));
        }

        System.out.println(Arrays.toString(digits));
        

    }

    


    
    
}




