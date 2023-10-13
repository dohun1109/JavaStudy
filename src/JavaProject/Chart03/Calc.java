package JavaProject.Chart03;

public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;


        for (int i= 0; i< args.length; i++){
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("망령행 라인으로 입력된 수의 합 : "+ sum);
    }
}
