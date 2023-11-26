package StandardOfJava.multiThread;

import javax.naming.Name;

public class WorkThread extends Thread{


    //필드
    public boolean work = true;

    //생성자

    public WorkThread(String name) {

        setName(name);  // -> Thread name setter Thread를 상복 받았기 때문에 사용가능
    }


    //method
    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + ": 작업처리");
            } else {
                Thread.yield();
            }
        }
    }
}
