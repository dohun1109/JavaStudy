package JavaProject.Chart05;

import com.sun.jdi.Value;

public class valuePassing {
    public static void main(String[] args) {

        //기본형 변수
        int n = 10;

        //call by value
//        valuePassing vp = new valuePassing();
//        vp.increase(n);
//
//        valuePassing.increase(n);
        
        increase(n);

        System.out.println(n);
    }
    public static void increase(int n){
        n = n + 1;
    }
}
