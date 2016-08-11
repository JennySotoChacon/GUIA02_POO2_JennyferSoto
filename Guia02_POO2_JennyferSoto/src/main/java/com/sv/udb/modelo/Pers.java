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
public class Pers {
    private int codi_pers;
    private String nomb_pers;
    private String apel_pers;
    private Blob foto_pers;
    private tipo_pers codi_tipo_pers;
    private String gene_pers;
    private String fech_naci_pers;
    private String dui_pers;
    private String nit_pers;
    private String tipo_sang_pers;
    private ubic_geof codi_ubic_geof;
    private String fech_alta;
    private String fech_baja;
    private int esta;

    public Pers() {
    }

    public Pers(int codi_pers, String nomb_pers, String apel_pers, Blob foto_pers, tipo_pers codi_tipo_pers, String gene_pers, String fech_naci_pers, String dui_pers, String nit_pers, String tipo_sang_pers, ubic_geof codi_ubic_geof, String fech_alta, String fech_baja, int esta) {
        this.codi_pers = codi_pers;
        this.nomb_pers = nomb_pers;
        this.apel_pers = apel_pers;
        this.foto_pers = foto_pers;
        this.codi_tipo_pers = codi_tipo_pers;
        this.gene_pers = gene_pers;
        this.fech_naci_pers = fech_naci_pers;
        this.dui_pers = dui_pers;
        this.nit_pers = nit_pers;
        this.tipo_sang_pers = tipo_sang_pers;
        this.codi_ubic_geof = codi_ubic_geof;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_pers() {
        return codi_pers;
    }

    public void setCodi_pers(int codi_pers) {
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

    public String getGene_pers() {
        return gene_pers;
    }

    public void setGene_pers(String gene_pers) {
        this.gene_pers = gene_pers;
    }

    public String getFech_naci_pers() {
        return fech_naci_pers;
    }

    public void setFech_naci_pers(String fech_naci_pers) {
        this.fech_naci_pers = fech_naci_pers;
    }

    public String getDui_pers() {
        return dui_pers;
    }

    public void setDui_pers(String dui_pers) {
        this.dui_pers = dui_pers;
    }

    public String getNit_pers() {
        return nit_pers;
    }

    public void setNit_pers(String nit_pers) {
        this.nit_pers = nit_pers;
    }

    public String getTipo_sang_pers() {
        return tipo_sang_pers;
    }

    public void setTipo_sang_pers(String tipo_sang_pers) {
        this.tipo_sang_pers = tipo_sang_pers;
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