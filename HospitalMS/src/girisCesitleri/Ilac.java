package girisCesitleri;

import java.util.UUID;

public class Ilac {

    String id, ad, envanter;
    
    //Constructor
    public Ilac(String ad, String envanter) {
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.envanter = envanter;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getEnvanter() {
        return envanter;
    }

    public void setEnvanter(String envanter) {
        this.envanter = envanter;
    }
}
