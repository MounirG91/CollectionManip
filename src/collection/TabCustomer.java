package collection;

import java.util.Scanner;

public class TabCustomer {

    public Customer[] customers;

    public TabCustomer(int n) {
        this.customers = new Customer[n];
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("n= ");
        int n=sc.nextInt();
        TabCustomer tabCustomer=new TabCustomer(n);
        for(int i=0;i<n;i++){
            System.out.println(tabCustomer.customers[i]);
        }

    }
}
