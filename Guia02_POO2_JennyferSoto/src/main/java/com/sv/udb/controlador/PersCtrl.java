/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Pers;
import com.sv.udb.modelo.tipo_pers;
import com.sv.udb.modelo.ubic_geof;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Blob;
/**
 *
 * @author aerc
 */
public class PersCtrl {
    public List<Pers> consTodo()
    {
        List<Pers> resp = new ArrayList<>();
        Connection cn = new Conexion().getConn();
        try
        {
            String consulta = "SELECT * FROM pers inner join tipo_pers on tipo_pers.CODI_TIPO_PERS = pers.CODI_TIPO_PERS inner join ubic_geog on pers.CODI_UBIC_GEOG = ubic_geog.CODI_UBIC_GEOG";
            PreparedStatement cmd = cn.prepareStatement(consulta);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new Pers(rs.getInt(1), rs.getString(2), rs.getString(3), new tipo_pers(rs.getInt(4), rs.getString(15), rs.getString(16), rs.getString(17), rs.getBlob(18)), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), new ubic_geof(rs.getInt(19), rs.getString(20), rs.getInt(21), rs.getString(22), rs.getString(23), rs.getBlob(24)), rs.getString(11), rs.getString(12), rs.getBlob(13)));
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
