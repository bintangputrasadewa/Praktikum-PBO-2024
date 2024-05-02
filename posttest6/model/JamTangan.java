package model;

public abstract class JamTangan implements Penjualan {
    private final String nama;
    private final String tipe;
    private int ukuran;
    private int jumlah;
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

    // Implementing Penjualan interface methods
    @Override
    public void beliBarang(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Error: Jumlah pembelian tidak valid");
            return;
        }
        this.jumlah += jumlah;
        System.out.println(jumlah + " barang berhasil dibeli.");
    }

    @Override
    public void jualBarang(int jumlah) {
        if (jumlah < 0 || jumlah > this.jumlah) {
            System.out.println("Error: Jumlah penjualan tidak valid");
            return;
        }
        this.jumlah -= jumlah;
        System.out.println(jumlah + " barang berhasil dijual.");
    }
}
