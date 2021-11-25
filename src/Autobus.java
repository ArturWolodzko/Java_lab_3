public class Autobus extends Samochód{

    int iloscMiejsc;
    String expres ;


    public Autobus(String marka, String model, int iloscKol, int spalanie, int iloscDrzwi,int iloscMiejsc,boolean czyPosiada) {
        super(marka, model, iloscKol, spalanie, iloscDrzwi);
        this.iloscMiejsc=iloscMiejsc;
        if (czyPosiada==true){
            this.expres="posiada";
        }else {
            this.expres="nie posiada";
        }

        }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public String isExpres() {
        return expres;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public void setExpres(String expres) {
        this.expres = expres;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", iloscKol=" + iloscKol +
                ", spalanie=" + spalanie +
                ", iloscDrzwi=" + iloscDrzwi +
                "iloscMiejsc=" + iloscMiejsc +
                ", expres=" + expres +
                '}';
    }
}
