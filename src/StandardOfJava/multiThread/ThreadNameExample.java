package StandardOfJava.multiThread;

public class ThreadNameExample {


    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName() + "실행");
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        
                    }

                }
            };
            threadA.setName("threadA-"+i);
            threadA.start();
        }

        Thread chatThread = new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+ "실행");
                try{
                    Thread.sleep(5000);
                } catch (Exception e) {
                }

            }
        };
        chatThread.setName("chat-thread");
        chatThread.start();


    }
}
