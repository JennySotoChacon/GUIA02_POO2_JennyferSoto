/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.gafe_iden;
import com.sv.udb.modelo.tipo_gafe;
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
public class Gafe_idenCtrl {
    public List<gafe_iden> consTodo()
    {
        List<gafe_iden> resp = new ArrayList<>();
        Connection cn = new Conexion().getConn();
        try
        {
            String consulta = "select * from gafe_iden inner join tipo_gafe on tipo_gafe.CODI_TIPO_GAFE = gafe_iden.CODI_TIPO_GAFE";
            PreparedStatement cmd = cn.prepareStatement(consulta);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new gafe_iden(rs.getInt(1), rs.getString(2), rs.getString(3), new tipo_gafe(rs.getInt(4), rs.getString(9), rs.getString(10), rs.getString(11), rs.getBlob(12)), rs.getString(5), rs.getString(6), rs.getBlob(7)));
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
