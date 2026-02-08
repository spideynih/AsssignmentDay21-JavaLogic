package org.example;

public class IfElseExercise {
    public static void main(String[] args) {
        System.out.println("== ASSIGNMENT DAY 21 - TEST CASE IF ELSE ==\n");

        testSingleIf();
        testIfElse();
        testIfElseIfElse();
        contohNestedIf();
}

    static void testSingleIf() {
        System.out.println("1. SINGLE IF");
        System.out.println("   Cek jam buka restoran");

        int jam = 10;
        System.out.println("   Jam: " + jam);

        if (jam >= 8) {
            System.out.println("   ✓ Resto sudah buka, Selamat Datang!");
        }
        System.out.println();

    }

    static void testIfElse() {
        System.out.println("2. IF-ELSE STATEMENT");
        System.out.println("   Cek jam buka restoran");

        int jam = 21;
        System.out.println("   Jam: " + jam);

        if (jam>= 8 && jam <= 20) {
            System.out.println("   ✓ Resto sudah buka, Selamat Datang!");
        } else {
            System.out.println("   x Mohon maaf resto sudah tutup, silahkan datang lain kali");
        }
        System.out.println();
    }

    static void testIfElseIfElse() {
        System.out.println("3. IF-ELSE IF-ELSE");
        System.out.println("   Tentukan Kode Menu Restoran");

        int kodeMenu = 4;
        System.out.println("   Kode Menu Makanan:" + kodeMenu);
        System.out.println("   Nama Menu: ");

        if (kodeMenu == 1) {
            System.out.println("1 - Pizza");
        } else if (kodeMenu == 2) {
            System.out.println("2 - Pasta");
        } else if (kodeMenu == 3) {
            System.out.println("3 - Steak");
        } else if (kodeMenu == 4) {
            System.out.println("4 - Fries");
        } else {
            System.out.println("x Kode tidak ditemukan pada kategori makanan!");
        }
        System.out.println();

    }

    static void contohNestedIf() {
    System.out.println("4. NESTED IF");
    System.out.println("   Cek Jam Promo Hari ini");

        int waktu = 12;
        System.out.println("Cek jam promo: " + waktu);
        boolean cekPromo = true;

        if (waktu >= 10 && waktu <= 14) {
            if (cekPromo) {
                System.out.println("Promo makan siang tersedia 50%!");
            } else {
                System.out.println("Mohon maaf promo HABIS");
            }
        } else {
            System.out.println("Promo tidak tersedia");
        }
    }
}