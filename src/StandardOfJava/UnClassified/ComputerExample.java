package StandardOfJava.UnClassified;

public class ComputerExample {

    public static void main(String[] args) {
        Computer com = new Computer();

        System.out.println(com.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //배열로 매개변수 넘기기
        System.out.println(com.sum(new int[]{1,2,3,4,5,6,7,8,9,10}));
        
    }
}
