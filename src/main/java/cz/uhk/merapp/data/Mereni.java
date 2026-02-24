package cz.uhk.merapp.data;

import java.util.ArrayList;
import java.util.List;

public class Mereni {
    //atribut agregace s Number 1zN
    private List<Number> data = new ArrayList<Number>();

    public void pridejMereni(Number m){
        data.add(m); //delegace
    }

    public Number get(int index){
        return data.get(index);
    }

    public int pocet (){
        return data.size();
    }

    public int size() {
        return data.size();
    }

    public Number soucet(){
        Number soucet = 0; //int nebo Integer
        for(var cislo : data){
            soucet = soucet.doubleValue() + cislo.doubleValue();
        }
        return soucet;
    }

    public Number prumer(){
        return soucet().doubleValue() / data.size();
    }

    public Number max(){
        Number max = data.get(0);
        for(var c : data){
            if(c.doubleValue() > max.doubleValue()){
                max = c;
            }
        }
        return max;
    }

    public Number min() {
        Number min = data.get(0);
        for (var cislo : data) {
            if (cislo.doubleValue() < min.doubleValue()) {
                min = cislo;
            }
        }
        return min;
    }
}
