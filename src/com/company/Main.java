package com.company;
/**
 * @author
 * Nama : Joseph Armando Carvallo
 * NIM  : 10117077
 **/

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner baca = new Scanner(System.in);

            Nilai nilai1 = new Nilai();
            System.out.print("Masukan Banyaknya Mahasiswa\t: ");
            nilai1.jumlahSiswa = baca.nextInt();
            nilai1.inputHitungNilai(nilai1.jumlahSiswa, nilai1.nilai);
            System.out.println("Maka Rata-Ratanya\t\t\t\t: " + nilai1.rataRataNilai());

        }
}
