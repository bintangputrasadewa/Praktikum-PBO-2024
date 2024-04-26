package model;

public class JamAnalog extends JamTangan {
    private final String tipeMesin;

    public JamAnalog(String nama, String tipe, int ukuran, int jumlah, int harga, String tipeMesin) {
        super(nama, tipe, ukuran, jumlah, harga, "Analog");
        this.tipeMesin = tipeMesin;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    @Override
    public String getJenis() {
        return "Analog";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipe Mesin: " + tipeMesin;
    }
}
