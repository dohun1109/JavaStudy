package JavaProject.Chart03;

import java.util.Scanner;

public class GugudarEx {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("구구단 단시작:");
        int k = scan.nextInt();
        System.out.print("구구단 끝:");
        int t = scan.nextInt();


        for (int i = 1; i<= 9; i++){
            try{
                if(k>t){
                    System.out.println("시작이 끝보다 큰수이면 안됨.");
                    break;
                }
            }catch (Exception e){

            }

            for (int j = k; j<= t; j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
