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
public class tipo_docu {
    private int codi_tipo_docu;
    private String nomb_tipo_docu;
    private String fech_alta;
    private String fech_baja;
    private Blob esta;

    public tipo_docu() {
    }

    public tipo_docu(int codi_tipo_docu, String nomb_tipo_docu, String fech_alta, String fech_baja, Blob esta) {
        this.codi_tipo_docu = codi_tipo_docu;
        this.nomb_tipo_docu = nomb_tipo_docu;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_tipo_docu() {
        return codi_tipo_docu;
    }

    public void setCodi_tipo_docu(int codi_tipo_docu) {
        this.codi_tipo_docu = codi_tipo_docu;
    }

    public String getNomb_tipo_docu() {
        return nomb_tipo_docu;
    }

    public void setNomb_tipo_docu(String nomb_tipo_docu) {
        this.nomb_tipo_docu = nomb_tipo_docu;
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
        return nomb_tipo_docu;
    }
}
