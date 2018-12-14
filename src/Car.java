public class Car {

    private final static int NB_ROUES = 4;
    private int NChassis;
    private String Nimma;
    private String Color = "red";

    public Car(int NChassis, String nimma, String color) {
        this.NChassis = NChassis;
        Nimma = nimma;
        this.Color = color;
    }

    public Car(int NChassis, String nimma) {
        this.NChassis = NChassis;
        Nimma = nimma;
    }

    public static int getNbRoues() {
        return NB_ROUES;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
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
