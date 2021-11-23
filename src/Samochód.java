public class Samochód extends Pojazd{
    int spalanie;
    int iloscDrzwi;

    public Samochód(String marka, String model, int iloscKol,int spalanie,int iloscDrzwi) {
        super(model, marka, iloscKol);
        this.iloscDrzwi=iloscDrzwi;
        this.spalanie=spalanie;

    }

    public int getSpalanie() {
        return spalanie;
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setSpalanie(int spalanie) {
        this.spalanie = spalanie;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    @Override
    public String toString() {
        return "Samochód{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", iloscKol=" + iloscKol +
                ", spalanie=" + spalanie +
                ", iloscDrzwi=" + iloscDrzwi +
                '}';
    }
}
