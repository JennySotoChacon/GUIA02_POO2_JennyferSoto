 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.tipo_docu;
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
 * @author vaness
 */
 
public class Tipo_docuCtrl {
     
    public List<tipo_docu> consTodo()
    {
       List<tipo_docu> resp = new ArrayList();
       Connection cn = new Conexion().getConn();
        try
        {
            PreparedStatement cmd = cn.prepareStatement("Select * from tipo_docu");
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {   
                resp.add(new tipo_docu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getBlob(5)));
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
