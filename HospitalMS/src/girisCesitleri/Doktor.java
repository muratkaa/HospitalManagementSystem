/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girisCesitleri;

//DOKTOR UPCASTING
public class Doktor extends Users{
    String bolum;
    public Doktor(String password, String nameSurname, String role, String tc,String bolum) {
        super(password, nameSurname, role, tc);
        this.bolum=bolum;
    }

    public String getBolum() {
        return bolum;
    }
    
}
