package JavaProject.Chart04;


//예외 : Exception 프로그램 실행중에 예기치 못한 상황으로 프로그램이 정상종료가 되지 않는 경우
//예외 처리 : 1) try/catch 2) 예외를 전가하는 방법 : throws
public class ExceptionEx {
    public static void main(String[] args) {

        try {
            int[] arr = new int[3];

            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;    // 여기서 프로그램 죽여버린다.(exception) 실행중에 발생
            // 예외 발생하면 예외를 처리해 주는 곳 catch(){}
            System.out.println(" 정상종료");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("배열 오류 ");
        }



    }
}
