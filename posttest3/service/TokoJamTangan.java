package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.JamTangan;

public class TokoJamTangan {
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
            System.out.println(String.format("%75s", "Data Jam Tangan"));
            System.out.println("====================================================================================================================================================");
            System.out.printf("%-5s | %-20s | %-20s | %-20s | %-20s | %-10s | %-10s%n",
                    "No", "Nama", "Tipe", "Jenis", "Harga", "Jumlah", "Ukuran");
            System.out.println("====================================================================================================================================================");

            int index = 1;
            for (JamTangan jamTangan : daftarJamTangan) {
                System.out.printf("%-5d | %-20s | %-20s | %-20s | %-20d | %-10d | %-10d%n",
                        index, jamTangan.getNama(), jamTangan.getTipe(), jamTangan.getJenis(),
                        jamTangan.getHarga(), jamTangan.getJumlah(), jamTangan.getUkuran());
                index++;
            }
            System.out.println("====================================================================================================================================================");
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
            System.out.println("NOMOR TIDAK ADA");
        }
    }

    public void hapusJamTangan(int index) {
        if (index == 1 && !daftarJamTangan.isEmpty()) {
            daftarJamTangan.remove(0);
            System.out.println("Data jam tangan berhasil dihapus");
        } else if (index >= 1 && index <= daftarJamTangan.size()) {
            daftarJamTangan.remove(index - 1);
            System.out.println("Data jam tangan berhasil dihapus");
        } else {
            System.out.println("NOMOR TIDAK ADAAAA");
        }
    }
    
}
