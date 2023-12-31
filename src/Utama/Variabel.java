/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utama;

/**
 *
 * @author LENOVO
 */
public class Variabel {
    private static String kdUser;
    private static String Username;
    
    public static void setkodeUser(String kdUser) {
        Variabel.kdUser = kdUser;
    }
    
    public static String getkdUser() {
        return kdUser;
    }
    
    public static void setUserLogin(String Username) {
        Variabel.Username = Username;
    }
    
    public static String getUserLogin(){
        return Username;
    }
}


