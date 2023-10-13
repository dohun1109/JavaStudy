package JavaProject.Chart03;

public class For_EachEx {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int k: arr) sum += k;

        System.out.println("합은 :"+ sum);

        String[] name = {"사과", "배", "바나나","체리","딸기","포도"};
        for (String s: name) System.out.print(s+" ");







    }
}
