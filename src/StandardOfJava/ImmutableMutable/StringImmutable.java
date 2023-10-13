package StandardOfJava.ImmutableMutable;

public class StringImmutable {
    public static void main(String[] args) {
        String name = "Park";
        StringBuffer nameBuf = new StringBuffer("Park");

        System.out.println("""
                String type : name , 
                StringBuffer type : nameBuf
                String type is Immutable,
                StringBuffer type is mutable.
                """);

        System.out.println("-----------변경 전------------");
        //변경 전
        System.out.println("name :"+name);
        System.out.println("name의 heap주소 :"+System.identityHashCode(name));

        System.out.println("nameBuf :"+nameBuf);
        System.out.println("nameBuf의 heap주소 :"+System.identityHashCode(nameBuf));

        System.out.println("-----------변경 후------------");

        //변경 후
        name = "ParkGaeYoung";
        System.out.println("name :"+name);
        System.out.println("name의 heap주소 :"+System.identityHashCode(name));

        nameBuf.append("GaeYoung");
        System.out.println("nameBuf :"+nameBuf);
        System.out.println("nameBuf의 heap주소 :"+System.identityHashCode(nameBuf));
        System.out.println();


        System.out.println("""
                Immutable 의 경우 객체의 값을 
                변경하면 새로운 객체가 생성된다. 
                왜냐하면 String 의 경우 생성즉시 리터럴이 되기 때문.   
                """);


    }
}
