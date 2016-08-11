<%-- 
    Document   : reporte2
    Created on : 06-ago-2016, 20:06:22
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="net.sf.jasperreports.engine.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import="com.sv.udb.recursos.*" %>

<%--INICIO COSO PARA EL REPORTE--%>
<%
    Conexion conexion=new Conexion();
  //Ruta del reporte
   File reportFile = new File(application.getRealPath("reportes/RptSegundo.jasper"));
   Map parameters = new HashMap();
    /*Capturamos el valor de nuestra formulario que es el codigo del cliente que es un
    varchar(5), lo almacenamos en una String*/
    String codigo =request.getParameter("cmbPers");
    System.out.println(codigo);
    parameters.put("Codi_pers", codigo);
    byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath (), parameters, conexion.getConn()); 
    /*Indicamos que la respuesta va a ser en formato PDF*/ response.setContentType("application/pdf");
    response.setContentLength(bytes.length); ServletOutputStream ouputStream = response.getOutputStream(); 
    ouputStream.write(bytes, 0, bytes.length); /*Limpiamos y cerramos flujos de salida*/ ouputStream.flush(); 
    ouputStream.close();
%>
