package model;

public class JamTangan {
    private String nama;
    private String tipe;
    private int ukuran;
    private int jumlah;
    private int harga;

    public JamTangan(String nama, String tipe, int ukuran, int jumlah, int harga) {
        this.nama = nama;
        this.tipe = tipe;
        this.ukuran = ukuran;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter methods
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

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Tipe: " + tipe + ", Ukuran: " + ukuran + ", Jumlah: " + jumlah + ", Harga: " + harga;
    }
}
