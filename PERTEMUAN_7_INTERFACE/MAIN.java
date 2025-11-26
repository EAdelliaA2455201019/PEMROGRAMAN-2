/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_7_INTERFACE;

import java.util.Scanner;

/**
 *
 * @author adellia
 */
public class MAIN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih Merk HP:");
        System.out.println("[1] Xiaomi");
        System.out.println("[2] iPhone");
        System.out.println("[3] Samsung");
        System.out.println("[4] Oppo");
        System.out.print("Pilihan: ");

        String pilihHP = input.nextLine();
        PHONE RedmiNote13 = null;

        if ("1".equals(pilihHP)) {
            RedmiNote13 = new XIAOMI();
        } else if ("2".equals(pilihHP)) {
            RedmiNote13 = new IPHONE();
        } else if ("3".equals(pilihHP)) {
            RedmiNote13 = new SAMSUNG();
        } else if ("4".equals(pilihHP)) {
            RedmiNote13 = new OPPO();
        } else {
            System.out.println("Pilihan tidak valid!");
            System.exit(0);
        }

        PHONE_USER adell = new PHONE_USER(RedmiNote13);
        adell.turnOnThePhone();

        while (true) {
            System.out.println("=====APLIKASI INTERFACE=====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");

            String aksi = input.nextLine();

            if ("1".equals(aksi)) {
                adell.turnOnThePhone();
            } else if ("2".equals(aksi)) {
                adell.turnOffThePhone();
            } else if ("3".equals(aksi)) {
                adell.makePhoneLouder();
            } else if ("4".equals(aksi)) {
                adell.makePhoneSilent();
            } else if ("0".equals(aksi)) {
                System.exit(0);
            } else {
                System.out.println("SALAH WOYYY!");
            }
        }
    }
}
