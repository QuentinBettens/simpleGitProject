public class Car {

    private final static int NB_ROUES = 4;
    private int NChassis;
    private String Nimma;
    private String color = "red";

    public Car(int NChassis, String nimma, String color) {
        this.NChassis = NChassis;
        Nimma = nimma;
        this.color = color;
    }

    public Car(int NChassis, String nimma) {
        this.NChassis = NChassis;
        Nimma = nimma;
    }

    public static int getNbRoues() {
        return NB_ROUES;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}
