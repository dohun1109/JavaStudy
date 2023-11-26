package StandardOfJava.multiThread;

public class SumThread extends Thread {

    private long sum = 0;

    public long getSum() {
        return sum;
    }
    
    

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum += i; // 각 반복에서 i의 값을 sum에 더
            if (i == 100) {
                interrupt();
            }
        }
    }
}
