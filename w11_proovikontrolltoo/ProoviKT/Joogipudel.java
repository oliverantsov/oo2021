package ProoviKT;

public class Joogipudel {
    double pudeliMaht;
    String pudeliTyyp = "";
    double taaraMaksumus;
    Jook jook;

    public Joogipudel(double pudeliMaht, String pudeliTyyp, double taaraMaksumus, Jook jook) {
        this.pudeliMaht = pudeliMaht;
        this.pudeliTyyp = pudeliTyyp;
        this.taaraMaksumus = taaraMaksumus;

        if(jook == null){
            this.jook = new Jook(null, 0, 0);
        } else {
            this.jook = jook;
        }
    }

    public double pudeliMassJoogiga() {
        double eriKaal = jook.eriKaal;
        if(jook.nimetus == null){
            double pudeliMassJoogiga = 0;
            return pudeliMassJoogiga;
        } else {
            double pudeliMassJoogiga = eriKaal * pudeliMaht;
            return pudeliMassJoogiga;
        }
    }

    public double pudelJoogigaOmahind() {
        double joogiHind = jook.liitriHind * (pudeliMaht / 1000);
        double koguHind = joogiHind + taaraMaksumus;
        return koguHind;
    }
}

/*
1)
    ##Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. 
    ##Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. Samuti sees olev Jook, mis võib ka puududa. 
    Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), samuti käsklus sellise komplekti omahinna leidmiseks. 
    Koosta tööks automaattestid.
*/