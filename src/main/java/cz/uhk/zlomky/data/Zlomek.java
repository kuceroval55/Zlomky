package cz.uhk.zlomky.data;

//alt + insert -- generovani get a set

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {} //default konstruktor

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

    @Override
    public String toString() {
        return String.format("%4d\n________\n%4d",citatel, jmenovatel);
    }
}
