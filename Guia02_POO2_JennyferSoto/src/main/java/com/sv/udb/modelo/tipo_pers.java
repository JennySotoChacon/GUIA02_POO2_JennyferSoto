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
public class tipo_pers {
    private int codi_tipo_pers;
    private String nomb_tipo_pers;
    private String fech_alta;
    private String fech_baja;
    private Blob esta;

    public tipo_pers() {
    }

    public tipo_pers(int codi_tipo_pers, String nomb_tipo_pers, String fech_alta, String fech_baja, Blob esta) {
        this.codi_tipo_pers = codi_tipo_pers;
        this.nomb_tipo_pers = nomb_tipo_pers;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_tipo_pers() {
        return codi_tipo_pers;
    }

    public void setCodi_tipo_pers(int codi_tipo_pers) {
        this.codi_tipo_pers = codi_tipo_pers;
    }

    public String getNomb_tipo_pers() {
        return nomb_tipo_pers;
    }

    public void setNomb_tipo_pers(String nomb_tipo_pers) {
        this.nomb_tipo_pers = nomb_tipo_pers;
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
        return nomb_tipo_pers;
    }
    
    
    
}
