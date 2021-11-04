import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        List<Student> studentList = new ArrayList<>();

        Student student = new Student();
        student.imie = "Artur";
        student.nazwiwsko = "wołodźko";
        student.wiek = 21;
        student.zdał = true;
        studentList.add(student);


        student = new Student();
        student.imie = "bartek";
        student.nazwiwsko = "filipiak";
        student.wiek = 22;
        student.zdał = false;
        studentList.add(student);

        student = new Student();
        student.imie = "stefan";
        student.nazwiwsko = "psikuta";
        student.wiek = 23;
        student.zdał = false;
        studentList.add(student);

        student=new Student();
        student.imie="maciej";
        student.nazwiwsko="nowicki";
        student.wiek=21;
        student.zdał=true;
        studentList.add(student);

        List<Samochod> samochodList=new ArrayList<>();

        Samochod samochod=new Samochod();
        samochod.marka="volkswagen";
        samochod.model="golf mk2";
        samochod.drzwi=5;
        samochod.poj= 1.6;
        samochodList.add(samochod);

        samochod=new Samochod();
        samochod.marka="volkswagen";
        samochod.model="transporter T3";
        samochod.drzwi=3;
        samochod.poj=1.9;
        samochodList.add(samochod);





        for (Student s : studentList) {
            System.out.println("\nimię: " + s.imie + "\nnaziwsko: " + s.nazwiwsko + "\nwiek: " + s.wiek + "\nczy zdał: " +
                    (s.zdał));
        }

        for(Samochod p : samochodList){
            System.out.println("\nmarka: " + p.marka + "\nmodel: " + p.model +"\nilość drzwi: " +p.drzwi +"\npojemność: "+ p.poj);
        }


    }
}

class Student {
    String imie;
    String nazwiwsko;
    int wiek;
    boolean zdał = true;
}
class Samochod{
    String marka;
    String model;
    double poj;
    int drzwi;

}


