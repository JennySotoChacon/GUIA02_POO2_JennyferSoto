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
public class pers_hist {
    private int codi_pers_hist;
    private Pers codi_pers;
    private String nomb_pers;
    private String apel_pers;
    private Blob foto_pers;
    private tipo_pers codi_tipo_pers;
    private ubic_geof codi_ubic_geof;
    private String fech_alta;
    private String fech_baja;
    private int esta;

    public pers_hist() {
    }

    public pers_hist(int codi_pers_hist, Pers codi_pers, String nomb_pers, String apel_pers, Blob foto_pers, tipo_pers codi_tipo_pers, ubic_geof codi_ubic_geof, String fech_alta, String fech_baja, int esta) {
        this.codi_pers_hist = codi_pers_hist;
        this.codi_pers = codi_pers;
        this.nomb_pers = nomb_pers;
        this.apel_pers = apel_pers;
        this.foto_pers = foto_pers;
        this.codi_tipo_pers = codi_tipo_pers;
        this.codi_ubic_geof = codi_ubic_geof;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_pers_hist() {
        return codi_pers_hist;
    }

    public void setCodi_pers_hist(int codi_pers_hist) {
        this.codi_pers_hist = codi_pers_hist;
    }

    public Pers getCodi_pers() {
        return codi_pers;
    }

    public void setCodi_pers(Pers codi_pers) {
        this.codi_pers = codi_pers;
    }

    public String getNomb_pers() {
        return nomb_pers;
    }

    public void setNomb_pers(String nomb_pers) {
        this.nomb_pers = nomb_pers;
    }

    public String getApel_pers() {
        return apel_pers;
    }

    public void setApel_pers(String apel_pers) {
        this.apel_pers = apel_pers;
    }

    public Blob getFoto_pers() {
        return foto_pers;
    }

    public void setFoto_pers(Blob foto_pers) {
        this.foto_pers = foto_pers;
    }

    public tipo_pers getCodi_tipo_pers() {
        return codi_tipo_pers;
    }

    public void setCodi_tipo_pers(tipo_pers codi_tipo_pers) {
        this.codi_tipo_pers = codi_tipo_pers;
    }

    public ubic_geof getCodi_ubic_geof() {
        return codi_ubic_geof;
    }

    public void setCodi_ubic_geof(ubic_geof codi_ubic_geof) {
        this.codi_ubic_geof = codi_ubic_geof;
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

    public int getEsta() {
        return esta;
    }

    public void setEsta(int esta) {
        this.esta = esta;
    }

    @Override
    public String toString() {
        return nomb_pers;
    }
}
