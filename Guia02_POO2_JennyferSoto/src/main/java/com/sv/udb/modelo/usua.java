/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;
import java.sql.Blob;
/**
 *
 * @author Owner
 */
public class usua {
    private int usua;
    private Pers codi_pers;
    private String acce_usua;
    private String contr_usua;
    private String fech_camb_clav_usua;
    private String fech_alta;
    private String fech_baja;
    private Blob esta;

    public usua() {
    }

    public usua(int usua, Pers codi_pers, String acce_usua, String contr_usua, String fech_camb_clav_usua, String fech_alta, String fech_baja, Blob esta) {
        this.usua = usua;
        this.codi_pers = codi_pers;
        this.acce_usua = acce_usua;
        this.contr_usua = contr_usua;
        this.fech_camb_clav_usua = fech_camb_clav_usua;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getUsua() {
        return usua;
    }

    public void setUsua(int usua) {
        this.usua = usua;
    }

    public Pers getCodi_pers() {
        return codi_pers;
    }

    public void setCodi_pers(Pers codi_pers) {
        this.codi_pers = codi_pers;
    }

    public String getAcce_usua() {
        return acce_usua;
    }

    public void setAcce_usua(String acce_usua) {
        this.acce_usua = acce_usua;
    }

    public String getContr_usua() {
        return contr_usua;
    }

    public void setContr_usua(String contr_usua) {
        this.contr_usua = contr_usua;
    }

    public String getFech_camb_clav_usua() {
        return fech_camb_clav_usua;
    }

    public void setFech_camb_clav_usua(String fech_camb_clav_usua) {
        this.fech_camb_clav_usua = fech_camb_clav_usua;
    }

    public String getFech_alta() {
        return fech_alta;
    }

    public void setFech_alta(String fech_alta) {
        this.fech_alta = fech_alta;
    }

    public String getFech_baja() {
        return fech_baja;
    }

    public void setFech_baja(String fech_baja) {
        this.fech_baja = fech_baja;
    }

    public Blob getEsta() {
        return esta;
    }

    public void setEsta(Blob esta) {
        this.esta = esta;
    }

    @Override
    public String toString() {
        return acce_usua;
    }
}
