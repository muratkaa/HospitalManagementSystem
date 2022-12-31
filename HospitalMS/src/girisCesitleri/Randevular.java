
package girisCesitleri;


public class Randevular {
    String bolum,sikayet,ad,tarih;

    public Randevular(String bolum, String sikayet, String ad, String tarih) {
        this.bolum = bolum;
        this.sikayet = sikayet;
        this.ad = ad;
        this.tarih = tarih;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSikayet() {
        return sikayet;
    }

    public String getAd() {
        return ad;
    }

    public String getTarih() {
        return tarih;
    }

    public void setSikayet(String sikayet) {
        this.sikayet = sikayet;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
    
}
