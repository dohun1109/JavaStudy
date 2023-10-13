package StandardOfJava.UnClassified;

public class SingletonEx {
    public static void main(String[] args) {
        // Singleton obj1 = new Singleton(); -> error

        //정적 메소드를 호출하여 싱글톤 객체를 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        //위의 객체는 같은 객체의 주소를 가리킨다. 여러클래스에서 하나의 객체를 같이 사용가능.
        if (obj1 == obj2) {
            System.out.println("같은 객체의 주소");
        }else
            System.out.println("다른 객체의 주소");
    }
}
