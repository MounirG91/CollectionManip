package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCommande {


    public static void main(String[] args){
        Commande commande1 = new Commande("Commande number 1", (float) 1025.3);
        Commande commande2 = new Commande("Commande number 2", (float) 521.3);
        Commande commande3 = new Commande("Commande number 3", (float) 8068.2);
        Commande commande4 = new Commande("Commande number 4", (float) 989.6);
        List<Commande> commandeList = Arrays.asList(commande1, commande2, commande3, commande4);
        Collections.sort(commandeList);
        commandeList.forEach(System.out::println);


        System.out.println("/n");

        LibelleComparator libelleComparator = new LibelleComparator();
        Collections.sort(commandeList, libelleComparator);
        commandeList.forEach(System.out::println);

    }

}
