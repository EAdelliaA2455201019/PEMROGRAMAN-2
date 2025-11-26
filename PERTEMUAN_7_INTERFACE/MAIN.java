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
      PHONE RedmiNote13 = new XIAOMI();
      
      PHONE_USER adell = new PHONE_USER(RedmiNote13);
      
      adell.turnOnThePhone();
      
      Scanner input = new Scanner(System.in);
      String aksi = null;
      
      while(true){
          System.out.println("=====APLIKASI INTERFACE=====");
          System.out.println("[1] Nyalakan HP");
          System.out.println("[2] Matikan HP");
          System.out.println("[3] Perbesar Volume");
          System.out.println("[4] Kecilkan Volume");
          System.out.println("[0] Keluar");
          System.out.println("Pilih Aksi");
          
          if(aksi.equals("1")){
              adell.turnOnThePhone();
          }else if(aksi.equals("2")){
              adell.turnOffThePhone();
          }
          else if(aksi.equals("3")){
              adell.makePhoneLouder();
          }
          else if(aksi.equals("3")){
              adell.makePhoneSilent();
          }
          else if(aksi.equals("0")){
                System.exit(0);
          }
          else{
                System.out.println("SALAH WOYYY!");
          }
      }
   }
}

