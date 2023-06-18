package BasicsOFJava.Oops.Practise;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class cake {
    private HashMap<Integer, List<String>> cakedb = new HashMap<Integer, List<String>>();
    private ArrayList<List<String>> orderdb = new ArrayList<>();

    cake() {
        cakedb.put(101, Arrays.asList("Dutch Chocolate cake", "200"));
        cakedb.put(102, Arrays.asList("Irish Coffe Cake", "300"));
        cakedb.put(103, Arrays.asList("Red Velvet Cake", "350"));
        orderdb.add(Arrays.asList("15/06/23", "101", "2", "200"));
        orderdb.add(Arrays.asList("15/06/23", "102", "2", "600"));
        orderdb.add(Arrays.asList("16/06/23", "101", "3", "600"));
        orderdb.add(Arrays.asList("16/06/23", "103", "1", "550"));
        orderdb.add(Arrays.asList("16/06/23", "101", "1", "200"));
    }

    public void getBestCake() {
        HashMap<String, Integer> db = new HashMap<String, Integer>();
        for (List<String> a : orderdb) {
            if (!db.keySet().contains(a.get(1))) {
                int count = Integer.parseInt(a.get(2));
                db.put(a.get(1), count);
            } else {
                int existingCount = db.get(a.get(1));
                int count = Integer.parseInt(a.get(2));
                db.put(a.get(1), existingCount + count);
            }
        }
        int _bestCake = 0;
        for (String s : db.keySet()) {
            if (db.get(s) > _bestCake) {
                _bestCake = Integer.parseInt(s);
            }
        }
        System.out.println("Best selling Cake : " + cakedb.get(_bestCake).get(0));

    }

}

public class bestSellingCake {
    public static void main(String[] args) {
        cake ck = new cake();
        ck.getBestCake();
    }
}
