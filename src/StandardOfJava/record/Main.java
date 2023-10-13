package StandardOfJava.record;

import StandardOfJava.record.student;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            student s = new student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/09/1985",
                    "Java MasterClass");
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        student pojoStudent = new student("S92306", "Ann",
                "05/09/1985", "Java Master Class");
        LPAStudent recordStudent = new LPAStudent("S92307", "Bill",
                "05/09/1985", "Java Master Class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName()+" is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name()+" is taking " + recordStudent.classList());






    }

    
}
