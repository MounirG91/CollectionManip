import java.util.*;

public class ListCustomer {

    public static void main(String [] args){


        int value;
        try {
            value=Integer.parseInt(args[0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("no argument");
            e.printStackTrace();
            return;
        } catch(NumberFormatException e) {
            value=0;
        }
        System.out.println("value "+value);

        System.out.println("********************************");

        //ArrayList collection
        List<Customer> arrayListCustomer=new ArrayList<Customer>();
        arrayListCustomer.add(new Customer("Cristiano","Ronaldo","Portugal",32));
        arrayListCustomer.add(new Customer("Louis","Figo","Portugal",40));
        arrayListCustomer.add(new Customer("Arturo","Vidal","Chili",30));
        arrayListCustomer.add(3,new Customer("Zizou","Zidane","Chili",37));
        for (Customer customer:arrayListCustomer){
            System.out.println(customer.toString());
        }

        System.out.println("********************************");

        //LinkedList collection
        List<Customer> linkedListCustomer=new LinkedList<Customer>();
        ((LinkedList<Customer>) linkedListCustomer).addFirst(new Customer("Cristiano","Ronaldo","Portugal",32));
        ((LinkedList<Customer>) linkedListCustomer).addLast(new Customer("Louis","Figo","Portugal",40));
        linkedListCustomer.add(new Customer("Arturo","Vidal","Chili",30));
        for (Customer customer:linkedListCustomer){
            System.out.println(customer.toString());
        }

        System.out.println("********************************");

        //Vector Collection
        Vector<Customer> vectorCustomer=new Vector<Customer>();
        vectorCustomer.addElement(new Customer("Cristiano","Ronaldo","Portugal",32));
        vectorCustomer.add(new Customer("Louis","Figo","Portugal",40));
        vectorCustomer.add(2,new Customer("Arturo","Vidal","Chili",30));
        for (Customer customer:vectorCustomer){
            System.out.println(customer.toString());
        }

        System.out.println("********************************");

        Iterator<Customer> iterator=vectorCustomer.iterator();
        while (iterator.hasNext()){
            System.out.println(((Customer)iterator.next()).toString());
        }


    }
}
