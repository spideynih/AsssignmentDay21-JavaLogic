package org.example;

public class SwitchCaseExercise {

    public static void main(String[] args) {
        System.out.println("== ASSIGNMENT DAY 21 - TEST CASE SWITCH CASE ==\n");

        testhSwitchLampu();
    }

    static void testhSwitchLampu() {
        System.out.println("1. SWITCH CASE - LAMPU LALU LINTAS");

        String lampu = "Hijau";

        System.out.println("  Warna Lampu: " + lampu);

        switch (lampu) {
            case "Merah":
                System.out.println("LAMPU MERAH - BERHENTI!");
                break;

            case "Kuning":
                System.out.println("LAMPU KUNING - HATI HATI!");
                break;

            case "Hijau":
                System.out.println("LAMPU HIJAU - JALAN!");
                break;

            default:
                System.out.println("LAMPU ERROR - HUBUNGI PETUGAS");
                break;
        }

        System.out.println();
    }
}

