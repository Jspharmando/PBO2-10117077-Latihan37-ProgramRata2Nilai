package com.company;

/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

import java.util.Scanner;

public class Nilai {
    public int jumlahSiswa;
    public double rataRata;
    public double jumlahNilai;
    public double nilai;

    public void inputHitungNilai(int jumSiswa, double Nilai){
        int i = 1;
        Scanner baca = new Scanner(System.in);
        while (i <= jumSiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i + "\t\t\t: ");
            Nilai = baca.nextDouble();
            jumlahNilai = jumlahNilai + Nilai;
            i = i + 1;
        }
        System.out.println("");

    }
    public double rataRataNilai(){

        return rataRata = jumlahNilai / jumlahSiswa;
    }
}
