import cz.uhk.zlomky.data.Zlomek;

public class Main {

    public static void main() {
        IO.println("============== Projekt Zlomky =============="); // Nove v Java 25 se pise jen IO

        Zlomek a = new Zlomek(); //konstruktor bez parametru
        a.setCitatel(1);
        a.setJmenovatel(2);

        var b = new Zlomek(3,4); //var odvozuje typ automaticky

        IO.println(a);
        IO.println(b);

        var soucet = a.plus(b);
        IO.println("Rozdil je %s".formatted(soucet.zkratit()));
        IO.println("Rozdil je %s".formatted(a.minus(b).zkratit()));
        IO.println("Rozdil je %s".formatted(a.krat(b).zkratit()));
        IO.println("Rozdil je %s".formatted(a.deleno(b).zkratit()));

        Zlomek[] pole =  new Zlomek[]{
                new Zlomek(1,3),
                new Zlomek(1,2),
                new Zlomek(6,5),
                new Zlomek(4,3),
                new Zlomek(7,8),
                new Zlomek(13,10),
        };

        Zlomek vyslo = prumer(pole);
        IO.println("Aritmeticky prumer je %s" .formatted(vyslo));
    }

    private static Zlomek prumer(Zlomek[] pole) {
        var soucet = new Zlomek(0,1);
        for  (Zlomek po : pole) {
            soucet = soucet.plus(po);
        }
        //var pocet = new Zlomek(pole.length, 1);
        return soucet.deleno(pole.length);
    }
}
