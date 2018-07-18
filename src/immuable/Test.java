package immuable;

public class Test {
    public static void main(String[] args) {
 /*
        String maChaine = new String("IP-TECH BLOG");
        maChaine.replace("BLOG", "WEBSITE");
        System.out.println(maChaine);

        String ch="IP-TECH BLOG";
        String chReplace=ch.replace("BLOG", "WEBSITE");
        System.out.println(chReplace);

        String maChaine2 = new String("IP-TECH BLOG");
        String maChaineReplace=maChaine2.replace("BLOG", "WEBSITE");
        System.out.println(maChaineReplace);
*/

        Integer monEntier = new Integer(5);
        Integer copieDeMonEntier = monEntier;
        monEntier *= 10;
        System.out.println(copieDeMonEntier);

    }
}

