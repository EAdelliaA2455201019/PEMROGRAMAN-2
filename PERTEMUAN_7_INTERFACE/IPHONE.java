/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_INTERFACE;

/**
 *
 * @author adellia
 */
public class IPHONE implements PHONE {

    @Override
    public void powerOn() {
        System.out.println("iPhone menyala...");
    }

    @Override
    public void powerOff() {
        System.out.println("iPhone mati...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume iPhone bertambah...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume iPhone berkurang...");
    }
}
