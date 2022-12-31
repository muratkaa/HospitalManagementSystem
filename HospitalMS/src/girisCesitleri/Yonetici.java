/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girisCesitleri;


public class Yonetici extends Users{
    String unvan;
    public Yonetici(String password, String nameSurname, String role, String tc, String unvan) {
        super(password,nameSurname,role,tc);
        this.unvan = unvan;
    }
}
