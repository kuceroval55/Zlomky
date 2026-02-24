package cz.uhk.merapp;

import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.data.Zlomek;

public class MereniApp {
    public static void main(String[] args) {
        var mereni = new Mereni();

        mereni.pridejMereni(new Zlomek(1,2));
        mereni.pridejMereni(new Zlomek(3,5));
        mereni.pridejMereni(new Zlomek(7,4));
        mereni.pridejMereni(new Zlomek(6,9));
        mereni.pridejMereni(new Zlomek(15,4));

        mereni.pridejMereni(11);
        mereni.pridejMereni(10.8);
        mereni.pridejMereni(92.5);

        for (int i = 0; i < mereni.pocet();i++){
            IO.println(mereni.get(i));
        }

        IO.println("Soucet je %f".formatted(mereni.soucet()));
        IO.println("Prumer je %f".formatted(mereni.soucet()));
        Number max = mereni.max();
        if(max instanceof Integer || max instanceof Float){
            IO.println("Maximum je %f".formatted(max));
        }else
            IO.println("Maximum je %s".formatted(max));

        Number min = mereni.min();
        if(max instanceof Integer || max instanceof Float){
            IO.println("Minimum je %f".formatted(min));
        }else
            IO.println("Minimum je %s".formatted(min));
    }
}
