package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    static final String moiDuMai = "201805";


    public static void main(String[] args) {

        //Liste de String
        List<String> names = Arrays.asList("Mahesh", "Suresh", "Ramesh", "Naresh", "Kalpesh");
        names.forEach(System.out::println);

        /**************************************************/

        //Liste d'objets
        List<Commande> listeCommandes = Arrays.asList(
                new Commande("20180509", 113.12),
                new Commande("20180508", 113.07),
                new Commande("20180507", 356.03),
                new Commande("20180512", 78.94),
                new Commande("20180409", 163.23),
                new Commande("20180429", 982.34),
                new Commande("20180508", 172.89));

        Predicate<Commande> moisDuMai = (Commande commande) -> commande.getNumero().startsWith("201805");

        List < Commande > listeCommandeMoisMai = listeCommandes.stream()
                .filter(moisDuMai)
                .collect(Collectors.toList());

        listeCommandeMoisMai.forEach(System.out::println); //Ne pas oublier d'implémenter la méthode toString dans Commande


        Predicate<Commande> moisAvril = (Commande commande) -> commande.getNumero().startsWith("201804");

        List < Commande > listeCommandeMoisAvril = listeCommandes.stream()
                .filter(moisAvril)
                .collect(Collectors.toList());

        listeCommandeMoisAvril.forEach(System.out::println); //Ne pas oublier d'implémenter la méthode toString dans Commande
    }
}