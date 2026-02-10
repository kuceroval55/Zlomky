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
    }
}
