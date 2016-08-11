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
public class ubic_geof {
    private int codi_ubic_geof;
    private String nomb_ubic_geof;
    private int codi_ubic_geof_supe;
    private String fech_alta;
    private String fech_baja;
    private Blob esta;

    public ubic_geof() {
    }

    public ubic_geof(int codi_ubic_geof, String nomb_ubic_geof, int codi_ubic_geof_supe, String fech_alta, String fech_baja, Blob esta) {
        this.codi_ubic_geof = codi_ubic_geof;
        this.nomb_ubic_geof = nomb_ubic_geof;
        this.codi_ubic_geof_supe = codi_ubic_geof_supe;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_ubic_geof() {
        return codi_ubic_geof;
    }

    public void setCodi_ubic_geof(int codi_ubic_geof) {
        this.codi_ubic_geof = codi_ubic_geof;
    }

    public String getNomb_ubic_geof() {
        return nomb_ubic_geof;
    }

    public void setNomb_ubic_geof(String nomb_ubic_geof) {
        this.nomb_ubic_geof = nomb_ubic_geof;
    }

    public int getCodi_ubic_geof_supe() {
        return codi_ubic_geof_supe;
    }

    public void setCodi_ubic_geof_supe(int codi_ubic_geof_supe) {
        this.codi_ubic_geof_supe = codi_ubic_geof_supe;
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
        return nomb_ubic_geof;
    }
}
