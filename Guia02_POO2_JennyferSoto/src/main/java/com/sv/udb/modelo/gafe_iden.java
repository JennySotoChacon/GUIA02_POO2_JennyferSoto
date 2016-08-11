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
public class gafe_iden {
    private int codi_gafe_iden;
    private String nomb_gafe_iden;
    private String nume_tipo_gafe;
    private tipo_gafe codi_tipo_gafe;
    private String fech_alta;
    private String fech_baja;
    private Blob esta;

    public gafe_iden() {
    }

    public gafe_iden(int codi_gafe_iden, String nomb_gafe_iden, String nume_tipo_gafe, tipo_gafe codi_tipo_gafe, String fech_alta, String fech_baja, Blob esta) {
        this.codi_gafe_iden = codi_gafe_iden;
        this.nomb_gafe_iden = nomb_gafe_iden;
        this.nume_tipo_gafe = nume_tipo_gafe;
        this.codi_tipo_gafe = codi_tipo_gafe;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_gafe_iden() {
        return codi_gafe_iden;
    }

    public void setCodi_gafe_iden(int codi_gafe_iden) {
        this.codi_gafe_iden = codi_gafe_iden;
    }

    public String getNomb_gafe_iden() {
        return nomb_gafe_iden;
    }

    public void setNomb_gafe_iden(String nomb_gafe_iden) {
        this.nomb_gafe_iden = nomb_gafe_iden;
    }

    public String getNume_tipo_gafe() {
        return nume_tipo_gafe;
    }

    public void setNume_tipo_gafe(String nume_tipo_gafe) {
        this.nume_tipo_gafe = nume_tipo_gafe;
    }

    public tipo_gafe getCodi_tipo_gafe() {
        return codi_tipo_gafe;
    }

    public void setCodi_tipo_gafe(tipo_gafe codi_tipo_gafe) {
        this.codi_tipo_gafe = codi_tipo_gafe;
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
        return nomb_gafe_iden;
    }
}
