import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Pojazd audi = new Samochód("vw","golf",4,5,4);
        Pojazd audi1 = new SamochódSportowy("golf","vw",4,5,4,216,20);
        Pojazd giant = new Rower("giant","pro",2,21);

       List<Pojazd> pojazdList = new ArrayList<>();
       pojazdList.add(audi);
       pojazdList.add(audi1);
       pojazdList.add(giant);

        System.out.println(audi+"\n");
        System.out.println(audi1+"\n");
        System.out.println(giant+"\n");

    }
}
