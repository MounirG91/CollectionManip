package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String [] args){

     List<Commande> commandeList= Arrays.asList(
             new Commande("20180509", 113.12),
             new Commande("20180508", 113.07),
             new Commande("20180507", 356.03),
             new Commande("20180512", 78.94),
             new Commande("20180409", 163.23),
             new Commande("20180429", 982.34),
             new Commande("20180429", 982.34),
             new Commande("20180508", 172.89));


     //filtrer les mois de Mai distinct 4
        System.out.println("\n filtrer les mois de Mai distinct 4");
        List<Commande> commandesMai=commandeList.stream().filter(x->x.getNumero().startsWith("201805")).distinct().collect(Collectors.toList());
        commandesMai.forEach(System.out::println);


     //count sur les mois d'Avril distinct 2
        System.out.println("\n count sur les mois d'Avril distinct 2");
        Predicate<Commande> predicate=(Commande commande)->commande.getNumero().startsWith("201804");
        List commandesAvril=commandeList.stream().filter(predicate).distinct().collect(Collectors.toList());
        commandesAvril.forEach(System.out::println);

     //max sur toutes les commandes
        System.out.println("\n max sur toutes les commandes");
        Commande maxCommande=commandeList.stream().max((x1,x2)->(int)(x1.getMontant()-x1.getMontant())).get();
        System.out.println(maxCommande.toString());


     //trier la liste des commandes
        System.out.println("\n trier la liste des commandes");
        List sortedCommandeList=commandeList.stream().sorted((x1,x2)->(int)(x1.getMontant()-x2.getMontant())).collect(Collectors.toList());
        sortedCommandeList.forEach(System.out::println);


      //trier la liste des commandes avec limit = 2
        System.out.println("\n trier la liste des commandes avec limit = 2");
        List sortedCommandeListLimited=commandeList.stream().sorted((x1,x2)->(int)(x1.getMontant()-x2.getMontant())).limit(2).collect(Collectors.toList());
        sortedCommandeListLimited.forEach(System.out::println);
    }
}
