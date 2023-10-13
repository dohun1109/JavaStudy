package StandardOfJava.UnClassified;

public class Singleton {
    //싱글톤 패턴

    //private 접근권한을 갖는 정적 필드 생성
    private static Singleton singleton = new Singleton();

    //private 권한을 갖는 생성자 선언
    private Singleton() {

    }


    //public 접근 권한을 가지는 정적메소드 선언
    static Singleton getInstance() {
        return singleton;
    }
}
