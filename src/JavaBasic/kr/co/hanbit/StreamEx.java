package JavaBasic.kr.co.hanbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

    public static void main(String[] args) {
        List list = new ArrayList<String>();

        list.add("public");
        list.add("static");
        list.add("void");

        //for 문으로 List를 순회

        for (int i = 0; i < list.size(); i++) { //list.size() 는 리스트의 크기를 return
            System.out.println(list.get(i));    //i 번째 요소가 out
        }


        System.out.println("------".repeat(10));
        
        // Stream API
        list.stream().forEach(str -> System.out.println(str));


        //---------------------------------------------------------------------------------------------------------
        System.out.println("------".repeat(10));
        Integer[] integerArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> list1 = Arrays.asList(integerArray);

        List eventList = new ArrayList<Integer>();

        for (int i = 0; i < list1.size(); i++) {
            Integer number =  list1.get(i);
            if (number % 2 == 0) {      //2 로 나눴을 때 나머지가 0이면 2의 배수이다.
                eventList.add(number);
            }
        }

        for (int i = 0; i < eventList.size(); i++) {
            System.out.println(eventList.get(i));
        }

        //Stream API

        List evenList1 = list1.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());
        evenList1.stream().forEach(value -> System.out.println(value));


        //---------------------------------------------------------------------------------------------------------
        //java Stream distinct()
        Integer[] integers = new Integer[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4};
        List<Integer> list2 = Arrays.asList(integers);
        List<Integer> distinctList = list2.stream().distinct().toList();
        distinctList.stream().forEach(value -> System.out.println("value = " + value));

        




    }


}
