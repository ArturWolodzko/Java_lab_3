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

        List<Student> studentList= new ArrayList<>();

        Student student= new Student();
        student.imie = "Artur";
        student.nazwiwsko="wołodźko";
        student.wiek=21;
        student.zdał=true;


        Student student1 = new Student();
        student1.imie="bartek";
        student1.nazwiwsko="filipiak";
        student1.wiek=22;
        student1.zdał=false;

        Student student2= new Student();
        student2.imie="stefan";
        student2.nazwiwsko="psikuta";
        student2.wiek=23;
        student2.zdał=false;



    }
}
class Student{
    String imie;
    String nazwiwsko;
    int wiek;
    boolean zdał=true;
}
