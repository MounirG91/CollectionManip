package exception;

public class Ville {
    String nomVille, nomPays;
    int nbreHabitant;
    static int nbreInstance;

    public Ville() {
    }

    public Ville(String pNom, int pNbre, String pPays) throws  NombreHabitantException, NomVilleException
    {
        if(pNom.length() < 3)
            throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);

        if(pNbre < 0)
            throw new NombreHabitantException(pNbre);

        else
        {
            nbreInstance++;
            nomVille = pNom;
            nomPays = pPays;
            nbreHabitant = pNbre;
        }
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nomVille='" + nomVille + '\'' +
                ", nomPays='" + nomPays + '\'' +
                ", nbreHabitant=" + nbreHabitant +
                '}';
    }

    /*
    public static void main(String[] args){
        Ville v = null;
        try {
            v = new Ville("Re", -12000, "France");
        }
        //Gestion de plusieurs exceptions différentes
        catch (NombreHabitantException | NomVilleException e2){
            System.out.println(e2.getMessage());
        }
        finally{
            if(v == null)
                v = new Ville();
        }
        System.out.println(v.toString());
    }*/


    public static void main(String[] args){
        Ville v = null;
        try {
            v = new Ville("Re", -12000, "France");
        }
        //Gestion de plusieurs exceptions différentes
        catch (NombreHabitantException e){
            System.out.println(e.getMessage());
        }

        catch (NomVilleException e){
            System.out.println(e.getMessage());
        }

        finally{
            if(v == null)
                v = new Ville();
        }
        System.out.println(v.toString());
    }




}
