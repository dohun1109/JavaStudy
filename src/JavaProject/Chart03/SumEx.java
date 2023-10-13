package JavaProject.Chart03;

public class SumEx {

    public static void main(String[] args) {

        int oddSum = 0;     //홀수 합
        int evenSum = 0;    //짝수 합
        int totalSum = 0;   //총합
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            totalSum += i;
//
//            if (i % 2 == 0) {
//                evenSum += i;
//            } else {
//                oddSum += i;
//            }
//
//            System.out.println("홀수 합:"+ oddSum);
//            System.out.println("짝수 합:"+ evenSum);
//            System.out.println("총합 :"+totalSum);
//        }

        for( int i = 1; i<= 10; i++){
            System.out.println(i);
            totalSum += i;
            System.out.println("총합 :"+totalSum);

            if (i%2 == 0){
                evenSum += i;
                System.out.println("짝수 합:"+ evenSum);
                continue;
            }
            oddSum += i;
            System.out.println("홀수 합:"+ oddSum);

        }

    }
}
