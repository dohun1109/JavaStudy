package StandardOfJava.Iterator;

import java.util.LinkedList;
import java.util.Scanner;

//LinkedList 로 여행지 추가 예제
//조건1 -> 여행지 명이 중복이 되면 안됨.(대문자 소문자도 같으면 중복으로 인식)
//조건2 -> 거리순으로 정렬되어야함. (추가 되도 정렬 되야함.)
//참고 -> class 를 새로 생성하지 말고 record 를 권장.


record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit,adelaide);
//        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit,new Place("Sydney",0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scan = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {

            if (!iterator.hasPrevious()) { //이전이 없으면 => 즉, 처음이면
                System.out.println("Originating  : " + iterator.next());
                forward = true;
            }
            
            if (!iterator.hasNext()) {  //다음이 없으면 => 즉, 마지막이면
                System.out.println("Originating  : " + iterator.previous());
                forward = false;
            }
            
            
            System.out.print("Enter Value :");
            String menuItem = scan.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
        
    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate :" + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate : " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);  //-> ConcurrentModificationException: 예외 발생 할 수 있음.
                // 방법1 : 'synchronized '키워드를 통해 스레드 동기화                          -> 메서드 동기화, 블록 동기화 
                // 방법 2: 새로운 리스트를 생성하여 요소 복사 
                return;
            }
            matchedIndex++;
        }


        list.add(place);
    }

    private static void printMenu() {
        System.out.println(""" 
               Available actions (select word or letter):
               ( F ) orward
               ( B ) ackwards
               ( L ) ist Places
               ( M ) enu
               ( Q ) uit
               """);

    }
}































