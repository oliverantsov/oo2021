public class Main {
    public static void main(String[] args) {
        Jook limpaLimonaad = new Jook("Limpa limonaad", 0.99, 1.01);

        Joogipudel limpaVaikePudel = new Joogipudel(500, "Väike", 0.1, limpaLimonaad);
        //Joogipudel limpaKeskminePudel = new Joogipudel(1000, "Keskmine", 0.1, limpaLimonaad);
        //Joogipudel limpaSuurPudel = new Joogipudel(2000, "Suur", 0.1, limpaLimonaad);

        Joogivaat vaikeJoogivaatTyhi = new Joogivaat(3000, 0, null);
        Joogivaat keskmineJoogivaatTyhi = new Joogivaat(6000, 0, null);
        Joogivaat suurJoogivaatTyhi = new Joogivaat(9000, 0, null);
        
        Joogikast kuuspakkJoogikast = new Joogikast("Väike", 6);
        Joogikast keskmineJoogikast = new Joogikast("Keskmine", 12);
        Joogikast kohverJoogikast = new Joogikast("Suur", 24);

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Valitud jook: " + limpaLimonaad.nimetus);
        System.out.println("Valitud joogi liitrihind: " + limpaLimonaad.liitriHind + "€");
        System.out.println("Valitud joogi väikese pudeli (500ml) hind (koos taaraga, mis on 0.1€): " + limpaVaikePudel.pudelJoogigaOmahind() + "€");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Väike joogivaat mahutab jooki " + vaikeJoogivaatTyhi.vaadiRuumala + " milliliitrit");
        System.out.println("Keskmine joogivaat mahutab jooki " + keskmineJoogivaatTyhi.vaadiRuumala + " milliliitrit");
        System.out.println("Suur joogivaat mahutab jooki " + suurJoogivaatTyhi.vaadiRuumala + " milliliitrit");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Kuuspakk joogikast sisaldab endas " + kuuspakkJoogikast.pesadeArv + " pudelit jooki");
        System.out.println("Keskmise suurusega joogikast sisaldab endas " + keskmineJoogikast.pesadeArv + " pudelit jooki");
        System.out.println("Kohver-stiilis joogikast sisaldab endas " + kohverJoogikast.pesadeArv + " pudelit jooki");
        System.out.println("---------------------------------------------------------------------------------");
    }
    
}
