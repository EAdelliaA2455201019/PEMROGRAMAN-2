/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_INTERFACE;

/**
 *
 * @author USER
 */
public class OPPO implements PHONE {

    @Override
    public void powerOn() {
        System.out.println("HP Oppo menyala...");
    }

    @Override
    public void powerOff() {
        System.out.println("HP Oppo mati...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Oppo bertambah...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Oppo berkurang...");
    }
}

