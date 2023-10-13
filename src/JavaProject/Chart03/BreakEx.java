package JavaProject.Chart03;

public class BreakEx {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                //return; //현재 실행되는 main 쓰레드를 반환.
                //break;  //현재 실행된느 loop를 종료
                continue; //현재 loop를 건너띄고 다음 반복문 실행.
            System.out.println(i);
        }//end for
        System.out.println("loop종료");
    }
}
