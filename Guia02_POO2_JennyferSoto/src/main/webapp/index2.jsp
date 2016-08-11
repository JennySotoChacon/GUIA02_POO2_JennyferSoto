<%-- 
    Document   : visitasXunidad
    Created on : 06-ago-2016, 14:25:39
    Author     : Owner
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.sv.udb.controlador.UnidOrgaCtrl"%>
<%@page import="com.sv.udb.modelo.unid_orga"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unidades</title>
    </head>
    <body>
        <a href="indexPrueba.jsp">DFGHJKL</a>
        <form id="reporte1" action="reporte1.jsp" method="post">
            <h1>Visitas a X unidad</h1>
            <table>
                <tr>
                    <td>Seleccione una unidad</td>
                </tr>
                <tr>
                    <td><select name="cmbUnidad">
                        <jsp:useBean id="beanUnidCtrl" class="com.sv.udb.controlador.UnidOrgaCtrl" scope="page"/>
                        <c:forEach items="${beanUnidCtrl.consTodo()}" var="fila">
                            <c:choose>
                                <c:when test="{fila.Codi_unid_orga eq cmbUnidad}">
                                    <option name="codi_unid_orga" value="${fila.codi_unid_orga}" selected="">${fila.nomb_unid_orga}</option>
                                </c:when>
                                <c:otherwise>
                                    <option name="codi_unid_orga" value="${fila.codi_unid_orga}">${fila.nomb_unid_orga}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select></td>
                </tr>
                <td>
                    <input type="submit" name="button" id="SelectedUnidad">
                </td>
            </table>
        </form>
        
        <form id="reporte2" action="reporte2.jsp" method="post">
            <h1>Visitas realizadas por una persona</h1>
            <table>
                <tr>
                    <td>Seleccione una persona</td>
                </tr>
                <tr>
                    <td><select name="cmbPers">
                        <jsp:useBean id="beanPers" class="com.sv.udb.controlador.PersCtrl" scope="page"/>
                        <c:forEach items="${beanPers.consTodo()}" var="fila">
                            <c:choose>
                                <c:when test="{fila.codi_pers eq cmbPers}">
                                    <option name="codi_pers" value="${fila.codi_pers}" selected="">${fila.nomb_pers}</option>
                                </c:when>
                                <c:otherwise>
                                    <option name="codi_pers" value="${fila.codi_pers}">${fila.nomb_pers}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select></td>
                </tr>
                <td>
                    <input type="submit" name="button" id="SelectedPersonas">
                </td>
            </table>
        </form>
                        
        <form id="reporte3" action="reporte3.jsp" method="post">
            <h1>Visitas realizadas en un periodo de tiempo</h1>
            <table>
                <tr>
                    <td>Seleccione la fecha de inicio</td>
                    <td><input type="date" name="fechaInicio"></td>
                </tr>
                <tr>
                    <td>Seleccione la fecha de fin</td>
                    <td><input type="date" name="fechaFin"></td>
                </tr>
                <td>
                    <input type="submit" name="button" id="SelectedFechas">
                </td>
            </table>
        </form>
                        
    </body>
</html>
