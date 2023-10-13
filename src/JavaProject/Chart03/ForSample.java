package JavaProject.Chart03;

public class ForSample {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i<= 10; i++){    //1부터 10까지 반복
            sum += i;
            System.out.print(i);  //더하는 수 출력

            if(i<=9){// 1~9까지는 '+'출력
                System.out.print("+");

            }else {
                System.out.print("=");    //'='출력하고
                System.out.println(sum);    // 덧셈결과 출력
            }

        }
    }
}
