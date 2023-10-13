package StandardOfJava.LinkedList;


import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> PlaceToVisit = new LinkedList<>();
        var PlaceToVisit = new LinkedList<String>();

        PlaceToVisit.add("Sydney");
        PlaceToVisit.add(0, "Canberra");
//        System.out.println(PlaceToVisit);


        addMoreElement(PlaceToVisit);
        System.out.println(PlaceToVisit);

//        removeElements(PlaceToVisit);
//        System.out.println(PlaceToVisit);

//        gettingElements(PlaceToVisit);
//        System.out.println(PlaceToVisit);
//
//        printItinerary1(PlaceToVisit);
//        printItinerary2(PlaceToVisit);
//        printItinerary3(PlaceToVisit);
//        printItinerary4(PlaceToVisit);
//          testIterator(PlaceToVisit);
        testListIterator(PlaceToVisit);
        
    }
    private static void addMoreElement(LinkedList<String> list) {
        //list
        list.addLast("Hobart");
        list.addFirst("Darwin");


        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //Stack Methods
        list.push("Alice Springs");


        
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();  //remove first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();  //remove first element
        System.out.println(s2 + " was removed");


        String s3 = list.removeLast();  //remove first element
        System.out.println(s3 + " was removed");


        // Queue / Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed");
        System.out.println(list);

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");
        System.out.println(list);

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");
        System.out.println(list);

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);


        //Stack / removes first element
        String p4 = list.poll();
        System.out.println(p4 + " was removed");
        
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First Element  = "+  list.getFirst());
        System.out.println("Last Element = " + list.getLast());


        System.out.println("Darwin is at position : " + list.indexOf("Darwin"));
        System.out.println("Melbourne is a position : " + list.lastIndexOf("Melbourne"));

        //Queue retrieval methods
        System.out.println("Element from element() = " + list.element());


        //Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element form peekLast() = " +
                list.peekLast());
        

        
    }

    public static void printItinerary1(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previous = list.getFirst();
        for (String town : list) {
            System.out.println("--> Form : " + previous + " to " + town);
            previous = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    //Iterator 정방향
    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previous = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From :" + previous + " to " + town);
            previous = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    //Iterator 역방향
    public static void printItinerary4(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getLast());
        ListIterator<String> iterator = list.listIterator(list.size()-1);
        String previous = list.getLast();
        while (iterator.hasPrevious()) {
            var visit = iterator.previous();
            System.out.println("--> From :" + previous + " to " + visit);
            previous = visit;
        }
        System.out.println("Trip ends at " + list.getFirst());
        

    }

    private static void testIterator(LinkedList<String> list) {
        //iterator 의 경우 remove 할 때 유용하다
        var iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
//                list.remove();   -> ConcurrentModificationException : 순회중인 대상을 수정시 Exception
            }
        }
        System.out.println(list);
        
    }

    private static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
        
    }
    

}                   
                   