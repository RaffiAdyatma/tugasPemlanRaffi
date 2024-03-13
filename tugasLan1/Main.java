// Raffi Adyatma
// SI-A

package tugasLan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        
        //deklarasi arraylist untuk obyek mahasiswa dan scanner
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        Scanner input = new Scanner(System.in);

        // untuk pengulangan, jika next = false maka program akan berakhir
        boolean next = true;
        while (next) {
            // menambahkan objek mahasiswa ke arraylist
            mhs.add(new Mahasiswa());

            // mhs.size()-1 bertujuan untuk mendapatkan index dari mahasiswa yang ingin ditambahkan sekarang
            System.out.print("masukkan nim\t: ");
            mhs.get(mhs.size()-1).addNIM(input.nextLine());

            System.out.print("masukkan nama\t: ");
            mhs.get(mhs.size()-1).addNama(input.nextLine());

            System.out.print("masukkan alamat\t: ");
            mhs.get(mhs.size()-1).addAlamat(input.nextLine());

            System.out.println("tambah lagi?  y/t");
            String tambah = input.nextLine();

            if (tambah.toUpperCase().equals("T")) {
                next = false;
            }
        }
        System.out.println("\n==================================");
        for (int i=0; i<mhs.size(); i++) {
            System.out.println(mhs.get(i).getNIM() + " | " + mhs.get(i).getNama() + " | " + mhs.get(i).getAlamat());
        }

        input.close();        

    }
}