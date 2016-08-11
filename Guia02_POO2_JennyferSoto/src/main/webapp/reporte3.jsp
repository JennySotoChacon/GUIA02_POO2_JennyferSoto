<%-- 
    Document   : reporte3
    Created on : 06-ago-2016, 21:03:02
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
   File reportFile = new File(application.getRealPath("reportes/RptTercero.jasper"));
   Map parameters = new HashMap();
    String inicio =request.getParameter("fechaInicio");
    String fin = request.getParameter("fechaFin");
    parameters.put("fechaInicio", inicio);
    parameters.put("fechaFin", fin);
    byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath (), parameters, conexion.getConn()); 
    response.setContentType("application/pdf");
    response.setContentLength(bytes.length);
    ServletOutputStream ouputStream = response.getOutputStream(); 
    ouputStream.write(bytes, 0, bytes.length);
    ouputStream.flush(); 
    ouputStream.close();
%>
