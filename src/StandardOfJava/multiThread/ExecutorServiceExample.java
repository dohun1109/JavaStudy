package StandardOfJava.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        //스레드 풀 생성
        System.out.println("스레드 풀 생성");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //작업 생성과 처리 요청
        System.out.println("작업 처리중 ");


        System.out.println("스레드 풀 즉시 종료 (return -> 처리되지 않은 대기 큐 상태 작업들");
        //스레드풀 종료
        executorService.shutdownNow();
        System.out.println("종료");

        
    }



}
