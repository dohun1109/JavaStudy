package StandardOfJava.UnClassified;

public class AbstractMethod {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        //매개변수의 다형성
        animalSound(new Dog());     //자동 타입 변환
        animalSound(new Cat());
        // Animal animal = new Dog();   -> 다형성, type Promotion
        

        
    }

    public static void animalSound(Animal animal) {
        animal.sound();         // Overriding 된 메소드 호출
    }
}
