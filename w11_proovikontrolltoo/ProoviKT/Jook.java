package ProoviKT;

public class Jook {
    String nimetus = "";
    double liitriHind;
    double eriKaal;
    public Jook(String nimetus, double liitriHind, double eriKaal){
        this.nimetus = nimetus;
        this.liitriHind = liitriHind;
        this.eriKaal = eriKaal;
    }
}

/*
1)
    ##Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. 
    Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. Samuti sees olev Jook, mis võib ka puududa. 
    Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), samuti käsklus sellise komplekti omahinna leidmiseks. 
    Koosta tööks automaattestid.
*/