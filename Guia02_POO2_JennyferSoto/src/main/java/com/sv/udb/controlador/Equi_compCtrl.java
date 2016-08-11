/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;
import com.sv.udb.modelo.equi_comp;
import com.sv.udb.modelo.luga_acce;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sv.udb.recursos.Conexion;
/**
 *
 * @author aerc
 */
public class Equi_compCtrl {
    public List<equi_comp> consTodo()
    {
        List<equi_comp> resp = new ArrayList<>();
        Connection cn = new Conexion().getConn();
        try
        {
            String consulta = "Select * from equi_comp inner JOIN luga_acce on equi_comp.CODI_LUGA_ACCE = luga_acce.CODI_LUGA_ACCE";
            PreparedStatement cmd = cn.prepareStatement(consulta);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                    resp.add(new equi_comp(rs.getInt(1), rs.getString(2), new luga_acce(rs.getInt(4), rs.getString(10), rs.getString(11), rs.getString(12), rs.getBlob(13)), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBlob(8)));
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
