package StandardOfJava.UnClassified;

public class StaticInInstance {
    public static int num;
    private int num1;

    public static void method(int num1){
        num = num1;
    }

    public void method2(int member) {
        this.num1 = member;
    }

    //쉽게 생각하면 비 static method 나 variable 에서 static 에 접근하는 것은 괜찮지만
    // static method or variable 에서 비 static variable 이나 method 를 참조하는 것은 안된다.


    


}
