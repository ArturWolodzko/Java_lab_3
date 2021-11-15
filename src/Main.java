import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Punkt punktA= new Punkt(7);
        punktA.toString();

        Punkt punkt= new Punkt(1,2);
        punkt.toString();
        System.out.println(punkt);

        punkt.setX(3);
        punkt.setY(4);
        punkt.setZ(5);
        punkt.toString();
        System.out.println(punkt);


        punkt.GetX();
        punkt.GetY();
        punkt.GetZ();








        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

    }
}
