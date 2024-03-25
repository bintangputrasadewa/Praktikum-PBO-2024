package model;

public class JamAnalog extends JamTangan {
    private String tipeMesin;

    public JamAnalog(String nama, String tipe, int ukuran, int jumlah, int harga, String tipeMesin) {
        super(nama, tipe, ukuran, jumlah, harga, "Analog");
        this.tipeMesin = tipeMesin;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void setTipeMesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipe Mesin: " + tipeMesin;
    }
}
