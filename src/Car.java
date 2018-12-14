public class Car {

    private int NChassis;
    private String Nimma;
    private final static int NB_ROUES = 4;

    public Car(int NChassis, String nimma) {
        this.NChassis = NChassis;
        Nimma = nimma;
    }

    public int getNChassis() {
        return NChassis;
    }

    public void setNChassis(int NChassis) {
        this.NChassis = NChassis;
    }

    public String getNimma() {
        return Nimma;
    }

    public void setNimma(String nimma) {
        Nimma = nimma;
    }

    public static int getNbRoues() {
        return NB_ROUES;
    }
}
