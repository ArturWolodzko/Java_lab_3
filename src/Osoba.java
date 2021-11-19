public class Osoba {

    private String imie, nazwisko;

    private Integer indeks;

    Osoba() {
        this.imie = "artur";
        this.nazwisko = "wołodzko";
        this.indeks = 21521;
    }

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = 0;
    }

    Osoba(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public Integer getIndeks(){
        return indeks;
    }

    public void setImie(String imie){
        this.imie=imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    public void setIndeks(int indeks){
        this.indeks=indeks;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks=" + indeks +
                '}';
    }
}
