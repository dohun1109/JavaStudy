package StandardOfJava.API_Object_System;

import StandardOfJava.UnClassified.Car;

public class ClassEx {

    public static void main(String[] args) {
        Car car = new Car();
        Class c = car.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println(c.getPackage().getName());

        try{
            Class c2 = Class.forName("StandardOfJava.UnClassified.Car");
            System.out.println(c2.getName());
            System.out.println(c2.getSimpleName());
            System.out.println(c2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
