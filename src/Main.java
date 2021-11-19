import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */




        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */


        Osoba student1 = new Osoba("artur", "wołodzko", 21421);
        Osoba student2 = new Osoba("marek", "kubiak", 54213);
        Osoba student3 = new Osoba("kacper", "medycyn", 24213);
        Osoba student4 = new Osoba("tadeusz", "cylkowski", 12523);
        Osoba student5 = new Osoba("marek", "ziolkowski", 07000);

        Student student1a = new Student(student1, WydzialEnum.FIZYCZNY);
        Student student2a = new Student(student2, WydzialEnum.MECHANICZNY);
        Student student3a = new Student(student3, WydzialEnum.BIOLOGICZNY);
        Student student4a = new Student(student4, WydzialEnum.CHEMICZNY);
        Student student5a = new Student(student5, WydzialEnum.INFORMATYCZNY);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1a);
        studentList.add(student2a);
        studentList.add(student3a);
        studentList.add(student4a);
        studentList.add(student5a);

        for (Student s : studentList
        ) {
            s.toString();
            System.out.println("\n*****************************************\n");

        }

    }


}

