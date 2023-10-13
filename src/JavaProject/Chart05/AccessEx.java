package JavaProject.Chart05;

class Sample{
    public int a;
    private int b;
    int c;

}
public class AccessEx {
    public static void main(String[] args) {
        //접근 제한자 
        Sample aa = new Sample();
        aa.a = 10;
//        aa.b = 20;
        aa.c = 30;
    }

}
