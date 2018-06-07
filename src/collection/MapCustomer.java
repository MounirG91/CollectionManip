package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCustomer {

    public static void main(String[] args) {

    Map<Integer, Customer> map = new HashMap<>();
    map.put(0,new Customer("Cristiano","Ronaldo","Portugal",32));
    map.put(1,new Customer("Louis","Figo","Portugal",40));
    map.put(2,new Customer("Arturo","Vidal","Chili",30));

    Set<Map.Entry<Integer,Customer>> setMap=map.entrySet();
    Iterator<Map.Entry<Integer,Customer>> iterator=setMap.iterator();
    do {
        Map.Entry<Integer,Customer> entry=iterator.next();
        System.out.println(entry.getKey()+" "+((Customer)entry.getValue()).toString());
    }
    while (iterator.hasNext());
    }

}
