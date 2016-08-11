 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.tipo_docu;
import com.sv.udb.modelo.ubic_geof;
import com.sv.udb.modelo.unid_orga;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
 
public class Unid_orgaCtrl {
    
    public List<unid_orga> consTodo()
    {
       List<unid_orga> resp = new ArrayList();
       Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("Select * from unid_orga, ubic_geog where unid_orga.codi_ubic_geog = ubic_geog.codi_ubic_geog");
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {   
                System.out.println(rs.getString(2));
                resp.add(new unid_orga(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),new ubic_geof(rs.getInt(14),rs.getString(15),rs.getInt(16),rs.getString(17),rs.getString(18), rs.getBlob(19)),rs.getString(11),rs.getString(12),rs.getBlob(13)));
            }
        }
        catch(Exception err)
        {
            err.printStackTrace();
            System.out.print(err);
        }
        finally
        {
            try
            {
                if(cn!=null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            }
            catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
        return resp;
    }
    
    
}
