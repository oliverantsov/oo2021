package ProoviKT;

import java.util.ArrayList;

public class Joogivaat {
    double vaadiRuumala;
    double joogiKogus;
    double uleKogus;
    Jook jook;
    Joogipudel joogiPudel;
    
    public Joogivaat(double vaadiRuumala, double joogiKogus, Jook jook) {
        this.vaadiRuumala = vaadiRuumala;
        this.joogiKogus = joogiKogus;
        this.jook = null;
    }

    public void taidaPudelid(Joogipudel jook){
        double joogiKogus = jook.pudeliMassJoogiga();
        if(joogiKogus + this.joogiKogus > vaadiRuumala && this.jook == null || this.jook == jook.jook){
            this.uleKogus += (this.joogiKogus + joogiKogus) - this.vaadiRuumala;
            this.joogiKogus = this.vaadiRuumala;
            this.jook = jook.jook;
        } else if(joogiKogus + this.joogiKogus < this.vaadiRuumala && this.jook == null || this.jook == jook.jook) {
            this.joogiKogus += joogiKogus;
            jook.jook = null;
            this.jook = jook.jook;
        } else {

        }
    }

    public double kuvaJoogiKogus(){
        return this.joogiKogus;
    }

    public double kuvaUleKogus(){
        return this.uleKogus;
    }

    public ArrayList<Joogipudel> vaadistVillimineJoogipudelitesse(Joogipudel pudel){
        ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();
        for(int i=0; this.joogiKogus > pudel.pudeliMaht; i++){
            this.joogiKogus -= pudel.pudeliMaht;
            this.joogiPudel = new Joogipudel(pudel.pudeliTyyp, pudel.pudeliMaht, pudel.taaraMaksumus, this.jook);
            pudelid.add(joogiPudel);
        }
        return pudelid;
    }
}

/*
2)
    Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. 
    Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). 
    Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse. 
    Koosta töö kontrolliks automaattestid.
*/