import java.util.ArrayList;
import java.util.Scanner;

class JamTangan {
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

    @Override
    public String toString() {
        return "Nama: " + nama + ", Tipe: " + tipe + ", Ukuran: " + ukuran + ", Jumlah: " + jumlah + ", Harga: " + harga;
    }
}

class TokoJamTangan {
    private ArrayList<JamTangan> daftarJamTangan;

    public TokoJamTangan() {
        daftarJamTangan = new ArrayList<>();
    }

    public boolean isEmpty() {
        return daftarJamTangan.isEmpty();
    }

    public int size() {
        return daftarJamTangan.size();
    }

    public void tambahJamTangan(JamTangan jamTangan) {
        daftarJamTangan.add(jamTangan);
        System.out.println("Data jam tangan berhasil ditambahkan.");
    }

    public void lihat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (daftarJamTangan.isEmpty()) {
            System.out.println("DATA JAM TANGAN TIDAK TERSEDIA");
            sc.nextLine(); 
        } else {
            System.out.println(String.format("%45s", "Data Jam Tangan"));
            System.out.println("=================================================================================");
            System.out.printf("%-5s | %-20s | %-20s | %-10s | %-10s | %-10s%n", 
                                "No", "Nama", "Tipe", "Harga", "Jumlah", "Ukuran");
            System.out.println("=================================================================================");
    
            int index = 1;
            for (JamTangan jamTangan : daftarJamTangan) {
                System.out.printf("%-5d | %-20s | %-20s | %-10d | %-10d | %-10d%n",
                                    index, jamTangan.getNama(), jamTangan.getTipe(), 
                                    jamTangan.getHarga(), jamTangan.getJumlah(), jamTangan.getUkuran());
                index++;
            }
            System.out.println("=================================================================================");
            sc.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
    

    public void updateJamTangan(int index, JamTangan jamTangan) {
        if (index >= 0 && index < daftarJamTangan.size()) {
            daftarJamTangan.set(index, jamTangan);
            System.out.println("Data jam tangan berhasil diperbarui");
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void hapusJamTangan(int index) {
        if (index >= 0 && index < daftarJamTangan.size()) {
            daftarJamTangan.remove(index);
            System.out.println("Data jam tangan berhasil dihapus");
        } else {
            System.out.println("Index tidak valid.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        TokoJamTangan tokoJamTangan = new TokoJamTangan();

        int pilihan = 0;
        while (pilihan != 5) {

            System.out.println("=================================");
            System.out.println("|              Menu             |");
            System.out.println("=================================");
            System.out.println("1. Tambah Jam Tangan");
            System.out.println("2. Lihat Semua Jam Tangan");
            System.out.println("3. Update Jam Tangan");
            System.out.println("4. Hapus Jam Tangan");
            System.out.println("5. Exit");

            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Silahkan Masukkan Data Jam Tangan !");
                    System.out.print("Nama Jam Tangan: ");
                    String nama = sc.nextLine();

                    System.out.print("Tipe Jam Tangan: ");
                    String tipe = sc.nextLine();

                    System.out.print("Ukuran: ");
                    int ukuran = sc.nextInt();

                    System.out.print("Harga: ");
                    int harga = sc.nextInt();

                    System.out.print("Jumlah: ");
                    int jumlah = sc.nextInt();
                    tokoJamTangan.tambahJamTangan(new JamTangan(nama, tipe, ukuran, jumlah, harga));
                    sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;

                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    if (tokoJamTangan.isEmpty()) {
                        System.out.println("Data Jam Tangan masih kosong \nSilahkan isi terlebih dahulu");
                        sc.nextLine();
                    } else {
                        tokoJamTangan.lihat();
                    }
                    break;

                case 3:
                    if (tokoJamTangan.isEmpty()) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Data Jam Tangan masih kosong. Tidak ada yang bisa diupdate");
                        sc.nextLine();
                    } else {
                        tokoJamTangan.lihat();
                        System.out.print("Masukkan nomor yg mau diganti: ");
                        int indexUpdate = sc.nextInt();
                        sc.nextLine();
                
                        if (indexUpdate >= 1 && indexUpdate <= tokoJamTangan.size()) {
                            System.out.print("Nama: ");
                            String namaUpdate = sc.nextLine();
                
                            System.out.print("Tipe: ");
                            String tipeUpdate = sc.nextLine();
                
                            System.out.print("Ukuran: ");
                            int ukuranUpdate = sc.nextInt();
                
                            System.out.print("Harga: ");
                            int hargaUpdate = sc.nextInt();
                
                            System.out.print("Jumlah: ");
                            int jumlahUpdate = sc.nextInt();
                
                            tokoJamTangan.updateJamTangan(indexUpdate - 1, new JamTangan(namaUpdate, tipeUpdate, ukuranUpdate, jumlahUpdate, hargaUpdate));
                        } else {
                            System.out.println("Nomor tidak ada");
                            sc.nextLine();
                        }
                    }
                    break;

                case 4:
                    if (tokoJamTangan.isEmpty()) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Data Jam Tangan masih kosong \nTidak ada yang bisa dihapus");
                        sc.nextLine();
                    } else {
                        System.out.print("Index data yang ingin dihapus: ");
                        int indexHapus = sc.nextInt();
                        tokoJamTangan.hapusJamTangan(indexHapus);
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih sudah menjalankan program ini kawan!");
                    break;

                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Pilihan tidak valid \nSilakan pilih lagi");
                    sc.nextLine();
                    break;
            }
        }
        sc.close();
    }
}