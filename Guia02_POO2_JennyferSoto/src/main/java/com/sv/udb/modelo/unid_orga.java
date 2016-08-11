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
public class unid_orga {
    private int codi_unid_orga;
    private String nomb_unid_orga;
    private String sigl_unid_orga;
    private int codi_unid_orga_supe;
    private String dire_unid_orga;
    private String tele_unid_orga;
    private String fax_unid_orga;
    private String emai_unid_orga;
    private String cont_unid_orga;
    private ubic_geof codi_ubic_geof;
    private String fech_alta;
    private String fech_baja;
    private Blob esta;

    public unid_orga() {
    }

    public unid_orga(int codi_unid_orga, String nomb_unid_orga, String sigl_unid_orga, int codi_unid_orga_supe, String dire_unid_orga, String tele_unid_orga, String fax_unid_orga, String emai_unid_orga, String cont_unid_orga, ubic_geof codi_ubic_geof, String fech_alta, String fech_baja, Blob esta) {
        this.codi_unid_orga = codi_unid_orga;
        this.nomb_unid_orga = nomb_unid_orga;
        this.sigl_unid_orga = sigl_unid_orga;
        this.codi_unid_orga_supe = codi_unid_orga_supe;
        this.dire_unid_orga = dire_unid_orga;
        this.tele_unid_orga = tele_unid_orga;
        this.fax_unid_orga = fax_unid_orga;
        this.emai_unid_orga = emai_unid_orga;
        this.cont_unid_orga = cont_unid_orga;
        this.codi_ubic_geof = codi_ubic_geof;
        this.fech_alta = fech_alta;
        this.fech_baja = fech_baja;
        this.esta = esta;
    }

    public int getCodi_unid_orga() {
        return codi_unid_orga;
    }

    public void setCodi_unid_orga(int codi_unid_orga) {
        this.codi_unid_orga = codi_unid_orga;
    }

    public String getNomb_unid_orga() {
        return nomb_unid_orga;
    }

    public void setNomb_unid_orga(String nomb_unid_orga) {
        this.nomb_unid_orga = nomb_unid_orga;
    }

    public String getSigl_unid_orga() {
        return sigl_unid_orga;
    }

    public void setSigl_unid_orga(String sigl_unid_orga) {
        this.sigl_unid_orga = sigl_unid_orga;
    }

    public int getCodi_unid_orga_supe() {
        return codi_unid_orga_supe;
    }

    public void setCodi_unid_orga_supe(int codi_unid_orga_supe) {
        this.codi_unid_orga_supe = codi_unid_orga_supe;
    }

    public String getDire_unid_orga() {
        return dire_unid_orga;
    }

    public void setDire_unid_orga(String dire_unid_orga) {
        this.dire_unid_orga = dire_unid_orga;
    }

    public String getTele_unid_orga() {
        return tele_unid_orga;
    }

    public void setTele_unid_orga(String tele_unid_orga) {
        this.tele_unid_orga = tele_unid_orga;
    }

    public String getFax_unid_orga() {
        return fax_unid_orga;
    }

    public void setFax_unid_orga(String fax_unid_orga) {
        this.fax_unid_orga = fax_unid_orga;
    }

    public String getEmai_unid_orga() {
        return emai_unid_orga;
    }

    public void setEmai_unid_orga(String emai_unid_orga) {
        this.emai_unid_orga = emai_unid_orga;
    }

    public String getCont_unid_orga() {
        return cont_unid_orga;
    }

    public void setCont_unid_orga(String cont_unid_orga) {
        this.cont_unid_orga = cont_unid_orga;
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

    public Blob getEsta() {
        return esta;
    }

    public void setEsta(Blob esta) {
        this.esta = esta;
    }

    @Override
    public String toString() {
        return nomb_unid_orga;
    }
}
