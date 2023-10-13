package JavaProject.Chart05;

public class referencePassing {
    public static void main(String[] args) {

        //참조 변수
        Circle pizza = new Circle(10);

        increase(pizza);

        //call by reference
        System.out.println(pizza.radius);
    }
    //즉, 기본형 변수는 value 값이 복사되고, 참조형 변수는 reference(주소값)이 복사된다.
    
    //주소값이 복사
    public static void increase(Circle n){
        n.radius++;
    }
}
