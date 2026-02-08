package org.example;

public class LoopingExercise {

    public static void main(String[] args) {
        System.out.println("== ASSIGNMENT DAY 21 - TEST CASE LOOPING ===\n");

        testforLoop();
        testwhileDoLoop();
        testforEachLoop();
    }

    static void testforLoop() {
        System.out.println("1. FOR LOOP (++) - ANTRIAN PASIEN DOKTER GIGI");

        for (int a = 0; a < 6; a++) {
            System.out.println("Panggilan Nomor Antrian: " + (a + 1));
        }
        System.out.println("Pasien diharapkan masuk ke ruangan");

        System.out.println("\n2. FOR LOOP (---) - COUNT DOWN TAHUN BARU");
        for (int a = 10; a >= 1; a--) {
            System.out.println("Hitung mundur: " + a);
        }
        System.out.println("HAPPY NEW YEAR!!!");
        System.out.println();
    }

    static void testwhileDoLoop() {
        System.out.println("3. WHILE LOOP - ISI BENSIN");

        int i = 1;
        while (i <= 3) {
            System.out.println("Pengisian Bensin = " + i + " Liter");
            i++;
        }
        System.out.println("Bensin Terisi Sesuai");

        System.out.println("\n4. DO-WHILE LOOP - ISI AIR MINUM");

        int c = 1;
        do {
            System.out.println("Air terisi = " + c + " Liter");
            c++;
        } while (c <= 2);
        System.out.println("Air Terisi Penuh");
        System.out.println();
    }

    static void testforEachLoop() {
        System.out.println("5. FOR EACH LOOP - KOTA JABODETABEK");

        String[] kota = {"Jakarta", "Bogor", "Depok", "Tangerang", "Bekasi"};

        for (String item : kota) {
            System.out.println(item);
        }
        System.out.println("Berikut merupakan daftar kota JABODETABEK");
        System.out.println();
    }
}
