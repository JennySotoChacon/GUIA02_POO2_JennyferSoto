/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.equi_comp;
import com.sv.udb.modelo.luga_acce;
import com.sv.udb.modelo.Pers;
import com.sv.udb.modelo.pers_hist;
import com.sv.udb.modelo.tipo_pers;
import com.sv.udb.modelo.ubic_geof;
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
public class Pers_histCtrl {
    public List<pers_hist> consTodo()
    {
        List<pers_hist> resp = new ArrayList<>();
        Connection cn = new Conexion().getConn();
        try
        {
            String consulta = "select * from pers_hist inner join pers on pers.CODI_PERS = pers_hist.CODI_PERS inner join tipo_pers on tipo_pers.CODI_TIPO_PERS = pers_hist.CODI_TIPO_PERS inner join ubic_geog on ubic_geog.CODI_UBIC_GEOG = pers_hist.CODI_UBIC_GEOG";
            PreparedStatement cmd = cn.prepareStatement(consulta);
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                    resp.add(new pers_hist(rs.getInt(1), 
                            //Inicio personas
                            new Pers(rs.getInt(11), 
                                    rs.getString(12), 
                                    rs.getString(13), 
                                    rs.getBlob(14), 
                                    null, rs.getString(15),
                                    rs.getString(16),
                                    rs.getString(17),
                                    rs.getString(18),
                                    rs.getString(19),
                            new ubic_geof(rs.getInt(30),
                                    rs.getString(31), 
                                    rs.getInt(32), 
                                    rs.getString(33),
                                    rs.getString(34),
                                    rs.getBlob(35)),
                                    rs.getString(20),
                                    rs.getString(21),
                                    rs.getInt(22)),
                            //Fin personas, continuacion historial
                            rs.getString(3), rs.getString(4), rs.getBlob(5),
                            new tipo_pers(rs.getInt(25), rs.getString(26), rs.getString(27), rs.getString(28), rs.getBlob(29)),
                            new ubic_geof(rs.getInt(30), rs.getString(31), rs.getInt(32), rs.getString(33), rs.getString(34), rs.getBlob(35)),
                                    rs.getString(7), rs.getString(8), rs.getInt(9)));
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