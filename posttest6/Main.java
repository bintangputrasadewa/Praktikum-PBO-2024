import java.util.Scanner;
import service.TokoJamTangan;

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

                    // System.out.print("Jumlah: ");
                    int jumlah = TokoJamTangan.inputInteger(sc, "Jumlah: ");
                    sc.nextLine();

                    System.out.println("Jenis Jam Tangan:");
                    System.out.println("1. Analog");
                    System.out.println("2. Digital");
                    System.out.print("Pilih jenis (1/2): ");
                    int jenis = sc.nextInt();
                    sc.nextLine();

                    switch (jenis) {
                        case 1:
                            System.out.print("Tipe Mesin: ");
                            String tipeMesin = sc.nextLine();
                            tokoJamTangan.tambahJamTangan(nama, tipe, ukuran, jumlah, harga, "Analog", tipeMesin);
                            break;
                        case 2:
                            System.out.print("Tipe Display: ");
                            String tipeDisplay = sc.nextLine();
                            tokoJamTangan.tambahJamTangan(nama, tipe, ukuran, jumlah, harga, "Digital", tipeDisplay);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid");
                            break;
                    }
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
                
                            System.out.println("Jenis Jam Tangan:");
                            System.out.println("1. Analog");
                            System.out.println("2. Digital");
                            System.out.print("Pilih jenis (1/2): ");
                            int jenisUpdate = sc.nextInt();
                            sc.nextLine();
                
                            switch (jenisUpdate) {
                                case 1:
                                    System.out.print("Tipe Mesin: ");
                                    String tipeMesinUpdate = sc.nextLine();
                                    tokoJamTangan.updateJamTangan(indexUpdate - 1, namaUpdate, tipeUpdate, ukuranUpdate, jumlahUpdate, hargaUpdate, "Analog", tipeMesinUpdate);
                                    break;
                                case 2:
                                    System.out.print("Tipe Display: ");
                                    String tipeDisplayUpdate = sc.nextLine();
                                    tokoJamTangan.updateJamTangan(indexUpdate - 1, namaUpdate, tipeUpdate, ukuranUpdate, jumlahUpdate, hargaUpdate, "Digital", tipeDisplayUpdate);
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid");
                                    break;
                            }
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
                        System.out.print("Nomor data yang ingin dihapus: ");
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
