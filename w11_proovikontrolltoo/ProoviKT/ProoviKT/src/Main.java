public class Main {
    Jook limpaLimonaad = new Jook("Limpa limonaad", 0.99, 1.01);

    Joogipudel limpaVaikePudel = new Joogipudel(500, "Väike", 0.1, limpaLimonaad);
    Joogipudel limpaKeskminePudel = new Joogipudel(1000, "Keskmine", 0.1, limpaLimonaad);
    Joogipudel limpaSuurPudel = new Joogipudel(2000, "Suur", 0.1, limpaLimonaad);

    Joogivaat vaikeJoogivaatTyhi = new Joogivaat(3000, 0, null);
    Joogivaat keskmineJoogivaatTyhi = new Joogivaat(6000, 0, null);
    Joogivaat suurJoogivaatTyhi = new Joogivaat(9000, 0, null);
    
    Joogikast kuuspakkJoogikast = new Joogikast("Väike", 6);
    Joogikast keskmineJoogikast = new Joogikast("Keskmine", 12);
    Joogikast kohverJoogikast = new Joogikast("Suur", 24);
}
