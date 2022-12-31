
package girisCesitleri;

//HASTA UPCASTING
public class Hasta extends Users {
    String sikayet;
    public Hasta(String password, String nameSurname, String role,String tc,String sikayet) {
        super(password, nameSurname, role, tc);
        this.sikayet=sikayet;
    }
    
}
