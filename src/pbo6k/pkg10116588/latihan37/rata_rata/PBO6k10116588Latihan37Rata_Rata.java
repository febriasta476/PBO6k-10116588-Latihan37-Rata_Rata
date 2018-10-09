/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan37.rata_rata;

import java.util.Scanner;

/**
 *
 * @author Indra F
 * Nama                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan Rata-Rata nilai
 */
public class PBO6k10116588Latihan37Rata_Rata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyak mahasiswa : ");    
        int jumlah = scanner.nextInt();

        Penilaian penilaian = new Penilaian(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai Mahasiswa ke-"+ (i+1) + " : ");    
            penilaian.setNilai(i, scanner.nextInt());
        }

        penilaian.averagePenilaian();

    }
    
}
