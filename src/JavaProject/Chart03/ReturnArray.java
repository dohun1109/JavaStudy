package JavaProject.Chart03;

public class ReturnArray {
    int i;
    public void doA(){}
    public int doB(){
        return i;
    }

    static int[] makeArray(){
        int[] temp = new int[4];

        for (int i = 0; i< temp.length; i++){
            temp[i] = i;
        }
        return temp;
    }

    public static void main(String[] args) {
        //static 메소드는 객체(instance)생성 없이 접근이 가능
        //원래 class의 member variable에 접근하려면 instance를 생성해서 접근해야함(encapsulition;캡슐화)
        int[] intArray = makeArray();

        for (int i =0 ; i< intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

    }
}
