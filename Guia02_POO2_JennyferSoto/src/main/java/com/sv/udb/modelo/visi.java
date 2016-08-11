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
public class visi {
    private int codi_visi;
    private usua codi_usua;
    private Pers codi_pers;
    private pers_hist codi_pers_hist;
    private unid_orga codi_unid_orga_visi;
    private tipo_docu codi_tipo_docu;
    private gafe_iden codi_gafe;
    private luga_acce codi_luga_entr;
    private luga_acce codi_luga_sali;
    private String fech_hora_entr_visi;
    private String fech_hora_sali_visi;
    private String moti_visi;
    private String fech_alta;
    private String fech_baja;
    private Blob esta;

    public visi() {
    }

    public visi(int codi_visi, usua codi_usua, Pers codi_pers, pers_hist codi_pers_hist, unid_orga codi_unid_orga_visi, tipo_docu codi_tipo_docu, gafe_iden codi_gafe, luga_acce codi_luga_entr, luga_acce codi_luga_sali, String fech_hora_entr_visi, String fech_hora_sali_visi, String moti_visi, String fech_alta, String fech_baja, Blob esta) {
        this.codi_visi = codi_visi;
        this.codi_usua = codi_usua;
        this.codi_pers = codi_pers;
        this.codi_pers_hist = codi_pers_hist;
        this.codi_unid_orga_visi = codi_unid_orga_visi;
        this.codi_tipo_docu = codi_tipo_docu;
        this.codi_gafe = codi_gafe;
        this.codi_luga_entr = codi_luga_entr;
        this.codi_luga_sali = codi_luga_sali;
        this.fech_hora_entr_visi = fech_hora_entr_visi;
        this.fech_hora_sali_visi = fech_hora_sali_visi;
        this.moti_visi = moti_visi;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_visi() {
        return codi_visi;
    }

    public void setCodi_visi(int codi_visi) {
        this.codi_visi = codi_visi;
    }

    public usua getCodi_usua() {
        return codi_usua;
    }

    public void setCodi_usua(usua codi_usua) {
        this.codi_usua = codi_usua;
    }

    public Pers getCodi_pers() {
        return codi_pers;
    }

    public void setCodi_pers(Pers codi_pers) {
        this.codi_pers = codi_pers;
    }

    public pers_hist getCodi_pers_hist() {
        return codi_pers_hist;
    }

    public void setCodi_pers_hist(pers_hist codi_pers_hist) {
        this.codi_pers_hist = codi_pers_hist;
    }

    public unid_orga getCodi_unid_orga_visi() {
        return codi_unid_orga_visi;
    }

    public void setCodi_unid_orga_visi(unid_orga codi_unid_orga_visi) {
        this.codi_unid_orga_visi = codi_unid_orga_visi;
    }

    public tipo_docu getCodi_tipo_docu() {
        return codi_tipo_docu;
    }

    public void setCodi_tipo_docu(tipo_docu codi_tipo_docu) {
        this.codi_tipo_docu = codi_tipo_docu;
    }

    public gafe_iden getCodi_gafe() {
        return codi_gafe;
    }

    public void setCodi_gafe(gafe_iden codi_gafe) {
        this.codi_gafe = codi_gafe;
    }

    public luga_acce getCodi_luga_entr() {
        return codi_luga_entr;
    }

    public void setCodi_luga_entr(luga_acce codi_luga_entr) {
        this.codi_luga_entr = codi_luga_entr;
    }

    public luga_acce getCodi_luga_sali() {
        return codi_luga_sali;
    }

    public void setCodi_luga_sali(luga_acce codi_luga_sali) {
        this.codi_luga_sali = codi_luga_sali;
    }

    public String getFech_hora_entr_visi() {
        return fech_hora_entr_visi;
    }

    public void setFech_hora_entr_visi(String fech_hora_entr_visi) {
        this.fech_hora_entr_visi = fech_hora_entr_visi;
    }

    public String getFech_hora_sali_visi() {
        return fech_hora_sali_visi;
    }

    public void setFech_hora_sali_visi(String fech_hora_sali_visi) {
        this.fech_hora_sali_visi = fech_hora_sali_visi;
    }

    public String getMoti_visi() {
        return moti_visi;
    }

    public void setMoti_visi(String moti_visi) {
        this.moti_visi = moti_visi;
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
    
    //Recuerda que no hallaste a que ponerle el toString :P
    
}
