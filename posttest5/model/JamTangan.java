package model;

public abstract class JamTangan {
    private final String nama;
    private final String tipe;
    private final int ukuran;
    private final int jumlah;
    private final int harga;
    private final String jenis;

    public JamTangan(String nama, String tipe, int ukuran, int jumlah, int harga, String jenis) {
        this.nama = nama;
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.jumlah = jumlah;
        this.harga = harga;
        this.jenis = jenis;
    }

    public abstract String getJenis();

    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }

    public int getUkuran() {
        return ukuran;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }
}
