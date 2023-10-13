package StandardOfJava.API_Object_System;


//객체 복사(clone())
/* 객체 복사는 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성하는 것을 말한다.
 *   복사하는 이유는 원본 객체를 안전하게 보호하기 위해서이다. 신뢰하지 않은 영역으로 원복객체를 넘겨
 *   작업할 경우 원본 객체의 데이터가 훼손 될 수 있다. 그러므로 복사된 객체의 데이터가 훼손되더라도
 *   원본 객체는 아무런 영향을 받지 않기 때문에 데이터를 보호할 수 있게 된다.
 *   EX) DTO , record
 * */


//얕은 복사 (this clone) : 단순히 필드값을 복사하는 것을 말한다.
//primitive type : 값 복사
//reference type : 객체의 번지(주소) 복사

// 깊은 복사 (deep clone) : 앝은 복사의 참조타입 필드는 번지만 복사되기 때문에
//원본객체의 필드와 복제 객체의 필드는 같은 객체를 참조한다. 만약 복사된 객체에서 참조객체를
//변경하면 원본 객체도 변경된 객체를 가지게 된다. 깊은 복사란 참조하고 있는 객체도 복제하는 것을 말한다.


import StandardOfJava.UnClassified.Car;

import java.util.Properties;
import java.util.Set;

public class clone implements Cloneable{
    /*  Object 의 clone() 메소드는 자신과 동일한 필드값으 가진 얕은 복사된 객체를 리턴한다.
    이 메소드로 복사를 하려면 원본객체는 반드시 java.lang.Cloneable 인터페이스를 가지고 있어
    야한다.
    * 이유 : 클래스 설계자가 복사를 허용한다는 의도적인 표시를 하기 위해서이다. 
    * Cloneable 인터페이스를 구혀낳지 않으면 ClineNotSupportedException 이 발생해서
    *   복사에 실패한다. clone()은 예외처리가 필요한 메소드이므로 try-catch 구문이 필요하다.
    * */

    public String id;
    public String name;
    public String passwd;
    public int age;
    public boolean adult;

    public int[] scores;
    public Car car;

    public clone(String id, String name, String passwd, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.age = age;
        this.adult = adult;
    }

    public clone getMember() {
        clone cloned = null;
        try {
            cloned = (clone) clone();
            //clone()메소드의 리턴타입은 Object이므로 Member 타입으로 casting
        } catch (CloneNotSupportedException e) {}

        return cloned;
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time/1000/3600 + "시" + time/1000%3600/60 );
        long tiem = System.nanoTime();
        System.out.println(tiem);

        Properties props = System.getProperties();
        Set keys = props.keySet();
        System.out.println(keys);
        System.out.println(System.getProperty("java.specification.version"));
        System.out.println(System.getProperty("sun.jnu.encoding"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("http.nonProxyHosts"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));


        System.out.println(props.getClass().getSimpleName());
    }




}
