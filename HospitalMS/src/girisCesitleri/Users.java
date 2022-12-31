package girisCesitleri;

import java.util.UUID;

public class Users {

    //properties
    String id, password, nameSurname, role,tc;
    int tel;

   

    //Constructor
    public Users(String password, String nameSurname, String role, String tc) {
        this.id = UUID.randomUUID().toString();
        this.password = password;
        this.nameSurname = nameSurname;
        this.role = role;
        this.tc = tc;

    }

    //setter
    public void setPassword(String password) {
        this.password = password;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    //getter
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getRole() {
        return role;
    }

    public String getTc() {
        return tc;
    }

}
