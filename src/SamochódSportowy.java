public class SamochódSportowy extends Samochód{
    int moc;
    int iloscWyscigów;

    public SamochódSportowy(String model, String marka, int iloscKol, int spalanie, int iloscDrzwi,int moc , int iloscWyscigów) {
        super(model, marka, iloscKol, spalanie, iloscDrzwi);
        this.moc=moc;
        this.iloscWyscigów=iloscWyscigów;
    }

    public int getMoc() {
        return moc;
    }

    public int getIloscWyscigów() {
        return iloscWyscigów;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public void setIloscWyscigów(int iloscWyscigów) {
        this.iloscWyscigów = iloscWyscigów;
    }

    @Override
    public String toString() {
        return "SamochódSportowy{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", iloscKol=" + iloscKol +
                ", spalanie=" + spalanie +
                " litrów na 100 km " +
                ", iloscDrzwi=" + iloscDrzwi +
                ", moc=" + moc +
                " koni mechanicznych " +
                ", iloscWyscigów=" + iloscWyscigów +
                '}';
    }
}

