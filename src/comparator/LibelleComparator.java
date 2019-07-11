package comparator;

import java.util.Comparator;

public class LibelleComparator implements Comparator<Commande> {

    @Override
    public int compare(Commande commande1, Commande commande2) {
        return commande1.getLibelle().compareTo(commande2.getLibelle());
    }
}