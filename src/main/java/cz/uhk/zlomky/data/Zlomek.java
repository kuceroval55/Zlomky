package cz.uhk.zlomky.data;

//alt + insert -- generovani get a set

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {
        citatel = 0;
        jmenovatel = 1;
    } //default konstruktor

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    //selektory = gettry
    public int getJmenovatel() {
        return jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    //modifikatory = settry
    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    public Zlomek plus(Zlomek druhy){
        int cit = citatel * druhy.jmenovatel + druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek minus(Zlomek druhy){
        int cit = citatel * druhy.jmenovatel - druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek krat(Zlomek druhy){
        int cit = citatel * druhy.citatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek deleno(Zlomek druhy){
        int cit = citatel * druhy.jmenovatel;
        int jm = jmenovatel * druhy.citatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek deleno(int num) {
        return deleno(new Zlomek(num, 1));
    }

    public Zlomek zkratit (){
        var delitel = nsd(citatel, jmenovatel);
        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }

    private int nsd(int a,int b){
        if (a < b) {
            var prom = a;
            a = b;
            b = prom;
        }
        // a > b
        int zb;
        do{
            zb = a % b;
            a = b;
            b = zb;
        }while (zb != 0);

        return a;
    }

    @Override
    public String toString() {
        return citatel + "/" + jmenovatel; // String.format("%4d\n________\n%4d",citatel, jmenovatel);
    }
}
