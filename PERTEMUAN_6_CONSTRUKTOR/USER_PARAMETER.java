/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_6_CONSTRUKTOR;

/**
 *
 * @author adellia
 */
public class USER_PARAMETER {
    public String username;
    public String password;
    
    public USER_PARAMETER (String username, String password){
        this.username = username;
        this.password = password;
    }
}
class DEMO_CONSTRUKTOR{
    public static void main(String[] args) {
        USER_PARAMETER petani = new USER_PARAMETER ("petanikode", "kopi");
        System.out.println("Username : " + petani.username);
        System.out.println("UPassword :" + petani.password);
    }
}
