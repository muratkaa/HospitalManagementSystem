/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointment;

import java.util.UUID;

/**
 *
 * @author murat
 */
public class RandevuModel {
    public RandevuModel(String relatedDoctorId, String relatedPatient, String Date) {
        this.appointmentId = UUID.randomUUID().toString();
        this.relatedDoctorId = relatedDoctorId;
        this.relatedPatient = relatedPatient;
        this.Date = Date;
    }
    String appointmentId;
    String relatedDoctorId;
    String relatedPatient;
    String Date;

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getRelatedDoctorId() {
        return relatedDoctorId;
    }

    public void setRelatedDoctorId(String relatedDoctorId) {
        this.relatedDoctorId = relatedDoctorId;
    }

    public String getRelatedPatient() {
        return relatedPatient;
    }

    public void setRelatedPatient(String relatedPatient) {
        this.relatedPatient = relatedPatient;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
}
