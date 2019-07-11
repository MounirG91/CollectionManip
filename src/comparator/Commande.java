package comparator;

public class Commande implements  Comparable<Commande>{

    private String libelle;

    private Float montant;

    public Commande() {
    }

    public Commande(String libelle, Float montant) {
        this.libelle = libelle;
        this.montant = montant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "libelle='" + libelle + '\'' +
                ", montant=" + montant +
                '}';
    }

    @Override
    public int compareTo(Commande commande) {
       if (this.montant > commande.getMontant()) return 1;
       else if (this.montant < commande.getMontant()) return -1;
       else return 0;
    }


}
