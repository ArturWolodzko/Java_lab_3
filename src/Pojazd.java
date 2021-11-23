public class Pojazd {
    String model;
    String marka;
    int iloscKol;

    Pojazd(String model, String marka, int iloscKol){
        this.model=model;
        this.marka=marka;
        this.iloscKol=iloscKol;
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    public int getIloscKol() {
        return iloscKol;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", iloscKol=" + iloscKol +
                '}';
    }
}
