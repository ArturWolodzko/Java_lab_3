public class Rower  extends Pojazd{
    int iloscBiegow;

    public Rower(String model, String marka, int iloscKol,int iloscBiegow) {
        super(model, marka, iloscKol=2);
        this.iloscBiegow=iloscBiegow;
    }

    public int getIloscBiegow() {
        return iloscBiegow;
    }

    public void setIloscBiegow(int iloscBiegow) {
        this.iloscBiegow = iloscBiegow;
    }

    @Override
    public String toString() {
        return "Rower{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", iloscKol=" + iloscKol +
                ", iloscBiegow=" + iloscBiegow +
                '}';
    }
}
