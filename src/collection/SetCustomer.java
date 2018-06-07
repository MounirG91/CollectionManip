package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCustomer {

    public static void main(String[] args) {
        //HashSet collection
        Set<Customer> setCollectionCustomer = new HashSet<Customer>();
        setCollectionCustomer.add(new Customer("Cristiano","Ronaldo","Portugal",32));
        setCollectionCustomer.add(new Customer("Louis","Figo","Portugal",40));
        setCollectionCustomer.add(new Customer("Arturo","Vidal","Chili",30));

        for (Customer customer:setCollectionCustomer){
            System.out.println(customer.toString());
        }

        System.out.println("********************************");

        Iterator<Customer> iterator=setCollectionCustomer.iterator();
        while (iterator.hasNext()){
           System.out.println(((Customer)iterator.next()).toString());
        }

    }
}
