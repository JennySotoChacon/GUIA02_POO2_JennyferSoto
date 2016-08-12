/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sv.udb.controlador.PersCtrl;
import com.sv.udb.modelo.Pers;
import com.sv.udb.modelo.tipo_pers;
import com.sv.udb.modelo.ubic_geof;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
@WebServlet(name = "PersonaServ", urlPatterns = {"/PersonaServ"})
public class PersonaServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
         boolean esValido = request.getMethod().equals("POST");
        if(esValido)
        {
            String CRUD = request.getParameter("CursBoton");
            if(CRUD.equals("Guardar"))
            {
                //Convirtiendo la imagen a blob
                String ruta = request.getParameter("txtfoto_pers");
                Blob b = new javax.sql.rowset.serial.SerialBlob(ruta.getBytes());
                String mens = "";
                Pers obje_pers = new Pers();
                obje_pers.setNomb_pers(request.getParameter("txtnomb_pers"));
                obje_pers.setApel_pers(request.getParameter("txtapel_pers"));
                obje_pers.setFoto_pers(b);
                tipo_pers obje_tipo = new tipo_pers();
                obje_tipo.setCodi_tipo_pers(Integer.parseInt(request.getParameter("cmbTipo_pers")));
                obje_pers.setCodi_tipo_pers(obje_tipo);
                obje_pers.setGene_pers(request.getParameter("cmbGene"));
                obje_pers.setFech_naci_pers(request.getParameter("txtfech_naci"));
                obje_pers.setDui_pers(request.getParameter("txtdui_pers"));
                obje_pers.setNit_pers(request.getParameter("txtnit_pers"));
                obje_pers.setTipo_sang_pers(request.getParameter("txttipo_sang"));
                ubic_geof obje_ubic = new ubic_geof();
                obje_ubic.setCodi_ubic_geof(Integer.parseInt(request.getParameter("cmbUbic_geog")));
                obje_pers.setCodi_ubic_geof(obje_ubic);
                obje_pers.setFech_alta(request.getParameter("txtfech_alta"));
                mens = new PersCtrl().guar(obje_pers) ? "Datos guardados" : "Datos NO guardados";
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PersonaServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PersonaServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}

