package StandardOfJava.NestedClass;

public class NestedLocal{

    //로컬 클래스에서의 사용제한

    void outMethod(final int arg1, int arg2) {
        final int var1 = 10;
        int var2 = 1;

        class localClass{
            //final keyword 가 없으면 필드 복사
            
            void method(){
                //final keyword 가 있는경우 method로 복사

                int result = var1 + var2 + arg1 + arg2;
                System.out.println(result);
                System.out.println(this.getClass().getName());
            }
            
        }
        localClass lc  = new localClass();
        lc.method();
    }


    public static void main(String[] args) {
        NestedLocal NL = new NestedLocal();
        NL.outMethod(1,2);


    }
}
