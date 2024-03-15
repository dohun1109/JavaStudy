package StandardOfJava.NestedClass;

public class Outher {

    int size = 100;
    int price = 5000;
    int nested = 10;
    static int Static_price = 5000;

    //Instance Inner class
    class instanceClass{
        String name = "이상해씨";
        int level = 5;
        int nested = 20;

        static final int cost = 6;

        public void getMember(){
            System.out.println("name = " + name);
            System.out.println("level = " + level);

            System.out.println("size = " + size);
            System.out.println("price = " + price);
            System.out.println("cost = " + cost);

            System.out.println("같은 이름의 멤버를 호출할 때 " + nested);
            System.out.println(Outher.this.nested);
        }

    }

    //static Inner class
    static class staticInnerClass{
        static String name = "이상해씨";
        Integer level = 10;
        Integer level2 = Integer.valueOf(10);


        public static void getStaticMember(){
            // 외부 클래스 인스턴스 멤버 접근 X
            // System.out.println(size);

            //외부 클래스 스택틱 멤버 접근 가능
            System.out.println(Static_price);

            //내부 클래스 멤버도 스태틱 멤버만 접근 가능
            System.out.println(name);
        }
        public void getNoStatic(){
            System.out.println("level = " + level);
        }

    }




    public static void main(String[] args) {
        Outher outher = new Outher();
        Outher.instanceClass instanceClass = outher.new instanceClass();
        instanceClass.getMember();
        System.out.println("----".repeat(10));

        Outher.staticInnerClass staticClass = new Outher.staticInnerClass();
        System.out.println(staticClass.level);

        staticClass.getNoStatic();  // 비 스태틱 메소드
        System.out.println("----".repeat(10));
        Outher.staticInnerClass.getStaticMember(); // 스태틱 메소드


        Integer num1 = Outher.Static_price;
        Integer num2 = Outher.Static_price;
        System.out.println(num1 == num2);

        Outher.staticInnerClass sic1 = new Outher.staticInnerClass();
        Outher.staticInnerClass sic2 = new Outher.staticInnerClass();
        System.out.println(sic1 == sic2);
        System.out.println(sic1.name == sic2.name);
        System.out.println(sic1.level == sic2.level);
        System.out.println(sic1.level2.hashCode() == sic2.level2.hashCode());
        System.out.println(sic1.level2);

        System.out.println("----".repeat(10));
        String str1 = new String("hello");
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "hello";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4); //메모리 캐싱 일어남


    }

}
