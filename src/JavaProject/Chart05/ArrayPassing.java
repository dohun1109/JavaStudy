package JavaProject.Chart05;

public class ArrayPassing {
    public static void main(String[] args) {
        //reference variable (참조 변수)
        int[] a = {1,2,3,4,5};

        increase(a);

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]+ " ");

        }
    }
    //call by reference
    public static  void increase(int[] array) {

        for (int i = 0; i < array.length; i++){
            array[i]++;
        }
    }
}
