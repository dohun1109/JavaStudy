package StandardOfJava.Generic;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Query> {

    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    }

//    public List<T> getMatches(String field, String value) {
//
////        List<T> matches = new ArrayList<>();
////        for (var item : items) {
////            if (item.matchFieldValue(field, value)) {
////                matches.add(item);
////            }
////        }
//
//        return  matches;
//    }


}
