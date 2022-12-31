/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appointment;

import java.util.ArrayList;

/**
 *
 * @author murat
 */
public interface RandevuInterface {
    void randevuOlustur(RandevuModel appInput);
    void randevuSil(String appointId);
    void randevuGuncelle(String appointId,RandevuModel newModel);
}
