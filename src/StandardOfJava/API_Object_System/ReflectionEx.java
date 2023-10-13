package StandardOfJava.API_Object_System;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {

    //Reflection 은 Class 객체를 이용해서 클래스의 생성자, 필드, 메소드 정보를 알아내는 것을 말한다.
    public static void main(String[] args) {

        Person p1 = new Person("test", "id", 10, 20);
        Class c = p1.getClass();
        System.out.println(c.getName());

        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor con : constructors) {
            System.out.println(con.getName());
        }
        
        Field[] field = c.getDeclaredFields();
        for(Field f: field){
            System.out.println(f.getType().getSimpleName()+" "+ f.getName());
        }
        Method[] methods = c.getDeclaredMethods();
        for(Method m : methods){

            System.out.println(m.getName()+"(");
            Class[] params = m.getParameterTypes();
            System.out.println(")");

        }







    }

}
