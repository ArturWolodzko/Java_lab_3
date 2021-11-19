


public class Student {
    private Osoba osoba;
    private WydzialEnum wydział;

    Student(){
        this.osoba=new Osoba("artur","wołodźko",21341);
        this.wydział= WydzialEnum.MECHANICZNY;
    }
    Student(Osoba s){
        this.osoba= s;
        this.wydział=WydzialEnum.MECHANICZNY;
    }

    Student(Osoba s , WydzialEnum d){
        this.osoba=s;
        this.wydział=d;
    }

    public Osoba getOsoba(){
        return osoba;
    }

    public WydzialEnum getWydział() {
        return wydział;
    }

    public void setOsoba(Osoba s){
        this.osoba=s;
    }
    public void setWydział(WydzialEnum d){
        this.wydział=d;
    }

    public String toString() {
        System.out.println("imie: "+osoba.getImie());
        System.out.println("nazwisko: "+osoba.getNazwisko());
        System.out.println("indeks: "+osoba.getIndeks());
        System.out.println("wydział: "+ getWydział());
        return "";
    }
}

