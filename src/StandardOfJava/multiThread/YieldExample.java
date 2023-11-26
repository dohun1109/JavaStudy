package StandardOfJava.multiThread;

public class YieldExample {


    public static void main(String[] args) {


        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            workThreadA.work = false;
        }
                                                                 

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            workThreadB.work = true;
        }

        
        


    }
}
