/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_2;

/**
 *
 * @author adellia
 */

public class USER_BOT               {
    
    String namaBot;
    String namaUser;
    String topServers;
    String topFriends;
    String topTracks;
    
    // Konstruktor: harus sama dengan nama class
    public USER_BOT(String namaBot, String namaUser, String topServers, String topFriends, String topTracks) {
        this.namaBot = namaBot;
        this.namaUser = namaUser;
        this.topServers = topServers;
        this.topFriends = topFriends;
        this.topTracks = topTracks; //this: deklarasi object
    }
    
    public void tampilkanTopServers() {
        System.out.println("Top Servers"  + " : " + topServers);
    }
    
    public void tampilkanTopFriends() {
        System.out.println("Top Friends" + " : " + topFriends);
    }
    
    public void tampilkanTopTracks() {
        System.out.println("Top Tracks " + " : " + topTracks);
    }
    
    public void tampilkanSemua() {
        System.out.println("===== DATA PENGGUNAAN BOT =====");
        System.out.println("Nama Bot   : " + namaBot);
        System.out.println("Username   : " + namaUser);
        tampilkanTopServers();
        tampilkanTopFriends();
        tampilkanTopTracks();
    }
}
