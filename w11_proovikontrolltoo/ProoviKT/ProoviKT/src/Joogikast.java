import java.util.ArrayList;

public class Joogikast{
    String kastiTyyp;
    double kastiHind;
    double kastiMass;
    int pesadeArv;
    int counter;
    Joogipudel pudel;
    public Joogikast(String kastiTyyp, int pesadeArv){
        this.kastiTyyp = kastiTyyp;
        this.pesadeArv = pesadeArv;
    }

    public void lisaVaadistKasti(Joogivaat vaat, Joogipudel pudel){
        this.pudel = pudel;
        ArrayList<Joogipudel> pudelid = vaat.vaadistVillimineJoogipudelitesse(pudel);
        if(pudelid.size() < this.pesadeArv){
            this.pesadeArv -= pudelid.size();
            this.counter += pudelid.size();
        } else {
            this.counter = this.pesadeArv + pudelid.size();
            this.pesadeArv = 0;
        }
    }

    public void lisaPudelidKasti(Joogipudel pudel, int counter){
        if(this.pesadeArv > counter){
            this.pesadeArv -= counter;
            this.counter += counter;
            this.pudel = pudel;
        } else {
            this.pesadeArv = 0;
            this.counter = counter;
        }
    }

    public double kastiHind(){
        this.kastiHind = this.pudel.pudelJoogigaOmahind() * this.pesadeArv;
        return this.kastiHind;
    }

    public double kastiMass(){
        this.kastiMass = this.pudel.pudeliMassJoogiga() * this.pesadeArv;
        return this.kastiMass;
    }
}

/*
3)
    Koosta Joogipudelite Kasti jaoks klass. 
    Väljadeks kastityyp, kastihind, kastimass ning pesade arv (mitu pudelit mahub). 
    Loo käsklused kasti ja sinna kuuluvate pudelite ühise massi ja omahinna arvutamiseks. 
    Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. 
    Koosta automaattestid.
*/