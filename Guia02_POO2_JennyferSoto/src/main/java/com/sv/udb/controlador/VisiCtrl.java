/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.gafe_iden;
import com.sv.udb.modelo.luga_acce;
import com.sv.udb.modelo.Pers;
import com.sv.udb.modelo.tipo_docu;
import com.sv.udb.modelo.tipo_gafe;
import com.sv.udb.modelo.tipo_pers;
import com.sv.udb.modelo.ubic_geof;
import com.sv.udb.modelo.unid_orga;
import com.sv.udb.modelo.usua;
import com.sv.udb.modelo.visi;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Owner
 */
public class VisiCtrl {
    public List<visi> consTodo()
    {
        List<visi> resp = new ArrayList<>();
        Connection cn = new Conexion().getConn();
        try
        {
            String consulta =   "Select * from visi inner join usua on visi.CODI_USUA = usua.CODI_USUA \n" +
                                "inner join pers on pers.CODI_PERS = visi.CODI_PERS \n" +
                                "inner join unid_orga on visi.CODI_UNID_ORGA_VISI = unid_orga.CODI_UNID_ORGA \n" +
                                "inner join tipo_docu on tipo_docu.CODI_TIPO_DOCU = visi.CODI_TIPO_DOCU\n" +
                                "inner join gafe_iden on gafe_iden.CODI_GAFE_IDEN = visi.CODI_GAFE\n" +
                                "inner JOIN luga_acce as h on h.CODI_LUGA_ACCE = visi.CODI_LUGA_ENTR\n" +
                                "inner join luga_acce on luga_acce.CODI_LUGA_ACCE = visi.CODI_LUGA_SALI";
            PreparedStatement cmd = cn.prepareStatement(consulta);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                /*resp.add(new visi(rs.getInt(1), 
                new usua(rs.getInt(16), new Pers(rs.getInt(17), null, null, null, null, null, null, null, null, null, null, null, null), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getBlob(23)),
                new Pers(rs.getInt(24), rs.getString(25), rs.getString(26), new tipo_pers(rs.getInt(27), null, null, null, null), rs.getString(28), rs.getString(29), rs.getString(30), rs.getString(31), rs.getString(32), new ubic_geof(rs.getInt(33), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getString(14), rs.getBlob(15)), rs.getString(34), rs.getString(35), rs.getBlob(36)), 
                rs.getInt(2), 
                new unid_orga(rs.getInt(37),rs.getString(38),rs.getString(39),rs.getInt(40),rs.getString(41),rs.getString(42),rs.getString(43),rs.getString(44),rs.getString(45), new ubic_geof(rs.getInt(46),rs.getString(15),rs.getInt(16),rs.getString(17),rs.getString(18), rs.getBlob(19)),rs.getString(47), rs.getString(48), rs.getBlob(49)), 
                new tipo_docu(rs.getInt(50),rs.getString(51),rs.getString(52),rs.getString(53), rs.getBlob(54)), 
                new gafe_iden(rs.getInt(55), rs.getString(56), rs.getString(57), 
                new tipo_gafe(rs.getInt(58), rs.getString(59), rs.getString(60), rs.getString(61), rs.getBlob(62)), rs.getString(59), rs.getString(60), rs.getBlob(61)), 
                new luga_acce(rs.getInt(62), rs.getString(63), rs.getString(64), rs.getString(65), rs.getBlob(66)), 
                new luga_acce(rs.getInt(67), rs.getString(68), rs.getString(69), rs.getString(70), rs.getBlob(71)), 
                rs.getString(10), 
                rs.getString(11), 
                rs.getString(12), 
                rs.getString(13), 
                rs.getString(14), 
                rs.getBlob(15)));*/
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if(cn != null)
            {
                try
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
                catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        return resp;
    }
}
