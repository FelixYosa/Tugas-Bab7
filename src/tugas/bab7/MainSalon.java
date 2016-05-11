//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainsalon;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int harga = 0, total1 = 0 , total2 = 0;
        String tambah;
        
        //judul dan input nama
        System.out.println("===SALON FELIX===");
        System.out.print("Masukkan Nama : ");
        String nama = in.next();

        //input jenis member
        System.out.println("");
        System.out.println("+++MEMBER+++");
        System.out.println("Premium");
        System.out.println("Gold");
        System.out.println("Silver");
        System.out.println("Biasa");
        System.out.print("Masukkan Jenis Member : ");
        String member = in.next();

        //beli jasa
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| No |      Nama Jasa           |     Harga       |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| 1  | Potong Rambut            | Rp. 25.000      |");
        System.out.println("| 2  | Potong + Cuci Rambut     | Rp. 35.000      |");
        System.out.println("| 3  | Creambath                | Rp. 50.000      |");
        System.out.println("| 4  | Warna Rambut             | Rp. 75.000      |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        do {
            System.out.print("Masukkan nomor jasa : ");
            int Code = in.nextInt();
            if (Code == 1) {
                harga = 25000;
                total1 += harga;
            } else if (Code == 2) {
                harga = 35000;
                total1 += harga;
            } else if (Code == 3) {
                harga = 50000;
                total1 += harga;
            } else if (Code == 4) {
                harga = 75000;
                total1 += harga;
            } else {
                System.out.println("Nomor jasa tidak ada");
            }
            System.out.print("Lagi?(Y/T) : ");
            tambah = in.next();
        } while (tambah.equalsIgnoreCase("Y"));
        
        //beli barang
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| No |    Nama Barang    |    Harga     |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| 1  | Shampoo           | Rp. 30.000   |");
        System.out.println("| 2  | Pewarna Rambut    | Rp. 45.000   |");
        System.out.println("| 3  | Pelembab Rambut   | Rp. 65.000   |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        do {
            System.out.print("Masukkan nomor barang : ");
            int Code = in.nextInt();
            if (Code == 1) {
                harga = 30000;
                total2 += harga;
            } else if (Code == 2) {
                harga = 45000;
                total2 += harga;
            } else if (Code == 3) {
                harga = 65000;
                total2 += harga;
            } else {
                System.out.println("Nomor barang tidak ada");
            }
            System.out.print("Lagi?(Y/T) : ");
            tambah = in.next();
        } while (tambah.equalsIgnoreCase("Y"));
        
        //harga sesuai member
        System.out.println("");
        System.out.println("+++NOTA PEMBELIAN+++");
        if (member.equalsIgnoreCase("Premium")) {
            Premium P1 = new Premium(nama, member, total1, total2);
            System.out.println(P1.getNota());
        } else if (member.equalsIgnoreCase("Gold")) {
            Gold P2 = new Gold(nama, member, total1, total2);
            System.out.println(P2.getNota());
        } else if (member.equalsIgnoreCase("Silver")) {
            Silver P3 = new Silver(nama, member, total1, total2);
            System.out.println(P3.getNota());
        } else if (member.equalsIgnoreCase("Biasa")) {
            Biasa P4 = new Biasa(nama, member, total1, total2);
            System.out.println(P4.getNota());
        }
    }
}
