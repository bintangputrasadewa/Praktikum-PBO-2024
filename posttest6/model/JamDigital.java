package model;

public class JamDigital extends JamTangan {
    private final String tipeDisplay;

    public JamDigital(String nama, String tipe, int ukuran, int jumlah, int harga, String tipeDisplay) {
        super(nama, tipe, ukuran, jumlah, harga, "Digital");
        this.tipeDisplay = tipeDisplay;
    }

    public String getTipeDisplay() {
        return tipeDisplay;
    }

    @Override
    public String getJenis() {
        return "Digital";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipe Display: " + tipeDisplay;
    }
}
