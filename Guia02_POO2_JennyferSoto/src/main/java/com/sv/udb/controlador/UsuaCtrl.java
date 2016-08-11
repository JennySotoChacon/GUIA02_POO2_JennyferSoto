/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Pers;
import com.sv.udb.modelo.pers_hist;
import com.sv.udb.modelo.tipo_pers;
import com.sv.udb.modelo.ubic_geof;
import com.sv.udb.modelo.usua;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aerc
 */
public class UsuaCtrl {
    public List<usua> consTodo()
    {
        List<usua> resp = new ArrayList<>();
        Connection cn = new Conexion().getConn();
        try
        {
            String consulta = "select * from usua inner join pers on usua.CODI_PERS = pers.CODI_PERS";
            PreparedStatement cmd = cn.prepareStatement(consulta);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                    resp.add(new usua(rs.getInt(1), new Pers(rs.getInt(2), rs.getString(10), rs.getString(11), new tipo_pers(rs.getInt(12), null, null, null, null), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), new ubic_geof(rs.getInt(18), null, 0, null, null, null), rs.getString(19), rs.getString(20), rs.getBlob(21)), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBlob(8)));
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
