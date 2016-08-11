<%-- 
    Document   : guia2
    Created on : 11-ago-2016, 9:49:08
    Author     : Owner
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Guia 02-POO 2</title>
    <link rel="stylesheet" href="css/reset.css">
        <style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
      @import url(http://fonts.googleapis.com/css?family=Roboto:100);
.flat-form {
  background: #e74c3c;
  color: white;
  margin: 25px auto;
  width: 700px;
  height: 1000px;
  position: relative;
  font-family: 'Roboto';
}
.flat-form .tabs {
  display: block;
  background: #c0392b;
  width: 100%;
  height: 40px;
  margin: 0;
  margin-bottom: 20px;
  padding: 0;
  position: relative;
  list-style-type: none;
}
.flat-form .tabs li {
  display: block;
  margin: 0;
  padding: 0;
  float: left;
}
.flat-form .tabs li a {
  display: block;
  background: #c0392b;
  color: white;
  text-decoration: none;
  font-size: 16px;
  float: left;
  padding: 12px 22px;
}
.flat-form .tabs li a.active {
  background: #e74c3c;
  border-right: none;
  -moz-transition: all 0.5s linear;
  -o-transition: all 0.5s linear;
  -webkit-transition: all 0.5s linear;
  transition: all 0.5s linear;
}
.flat-form .tabs li a:hover {
  background: #d65548;
  -moz-transition: all 0.5s linear;
  -o-transition: all 0.5s linear;
  -webkit-transition: all 0.5s linear;
  transition: all 0.5s linear;
}
.flat-form .tabs li:last-child a {
  text-align: center;
  width: 174px;
  padding-left: 0;
  padding-right: 0;
  border-right: none;
}
.flat-form .form-action {
  padding: 0 20px;
  position: relative;
}
.flat-form h1 {
  font-size: 42px;
  padding-bottom: 10px;
}
.flat-form p {
  font-size: 18px;
  padding-bottom: 10px;
  line-height: 25px;
}
.flat-form a {
  color: yellow;
  text-decoration: none;
}
.flat-form a:hover {
  text-decoration: underline;
}
.flat-form form {
  padding-right: 20px !important;
}
.flat-form form input[type=date], .flat-form form select, .flat-form form input[type=submit], .flat-form form input[type=text] {
  font-family: 'Roboto';
  font-size: 20px;
}
.flat-form form input[type=date], .flat-form form select, .flat-form form input[type=text] {
  width: 100%;
  height: 40px;
  margin-bottom: 10px;
  padding-left: 15px;
  background: #fff;
  border: none;
  color: #e74c3c;
  outline: none;
}
.flat-form form input.button {
  border: none;
  display: block;
  background: #136899;
  height: 40px;
  width: 80px;
  color: #ffffff;
  text-align: center;
  -moz-border-radius: 5px;
  -webkit-border-radius: 5px;
  border-radius: 5px;
  -moz-box-shadow: 0px 3px 1px #2075aa;
  -webkit-box-shadow: 0px 3px 1px #2075aa;
  box-shadow: 0px 3px 1px #2075aa;
  -moz-transition: all 0.15s linear;
  -o-transition: all 0.15s linear;
  -webkit-transition: all 0.15s linear;
  transition: all 0.15s linear;
}
.flat-form form input.button:hover {
  background: #1e75aa;
  -moz-box-shadow: 0 3px 1px #237bb2;
  -webkit-box-shadow: 0 3px 1px #237bb2;
  box-shadow: 0 3px 1px #237bb2;
}
.flat-form form input.button:active {
  background: #136899;
}
.flat-form form input::-webkit-input-placeholder {
  color: #e74c3c;
}
.flat-form form input:-moz-placeholder {
  color: #e74c3c;
}
.flat-form form input::-moz-placeholder {
  color: #e74c3c;
}
.flat-form form input:-ms-input-placeholder {
  color: #e74c3c;
}
.flat-form .show {
  display: block;
}
.flat-form .hide {
  display: none;
}

body {
  background: #1a1a1a;
}

    </style>
    <script src="js/prefixfree.min.js"></script>
  </head>

  <body>

    <div class="flat-form">
  <ul class="tabs">
    <li>
      <a href="#login" class="active">Personas</a>
    </li>
    <li>
      <a href="#register">Historial de personas</a>
    </li>
  </ul>
  <div id="login" class="form-action show">
    <h1>Personas</h1>
    <form id="mantPers" action="PersonaServ" method="post" enctype="multipart/form-data">
      <ul>
        <li>
          <label>Nombre:</label>
        </li>
        <li>
            <input type="text" name="txtnomb_pers">
        </li>
        <li>
          <label>Apellido:</label>
        </li>
        <li>
            <input type="text" name="txtapel_pers">
        </li>
        <li>
          <label>Foto:</label>
        </li>
        <li>
            <input type="file" name="txtfoto_pers">
        </li>
        <li>
          <label>Tipo:</label>
        </li>
        <li>
            <select name="cmbTipo_pers">
                <jsp:useBean id="beanTipo_pers" class="com.sv.udb.controlador.Tipo_persCtrl" scope="page"/>
                <c:forEach items="${beanTipo_pers.consTodo()}" var="fila">
                    <c:choose>
                        <c:when test="{fila.codi_tipo_pers eq cmbTipo_pers}">
                            <option name="codi_tipo_pers" value="${fila.codi_tipo_pers}" selected="">${fila.nomb_tipo_pers}</option>
                        </c:when>
                        <c:otherwise>
                            <option name="codi_tipo_pers" value="${fila.codi_tipo_pers}">${fila.nomb_tipo_pers}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </li>
        <li>
          <label>Genero:</label>
        </li>
        <li>
            <select name="cmbGene">
                <option value="1">Femenino</option>
                <option value="2">Masculino</option>
            </select>
        </li>
        <li>
          <label>Fecha de nacimiento:</label>
        </li>
        <li>
            <input type="date" name="txtfech_naci">
        </li>
        <li>
          <label>DUI:</label>
        </li>
        <li>
            <input type="text" name="txtdui_pers">
        </li>
        <li>
          <label>NIT:</label>
        </li>
        <li>
            <input type="text" name="txtnit_pers">
        </li>
        <li>
          <label>Tipo de sangre:</label>
        </li>
        <li>
            <input type="text" name="txttipo_sang">
        </li>
        <li>
          <label>Direccion:</label>
        </li>
        <li>
            <select name="cmbUbic_geog">
                <jsp:useBean id="beanUbic_geog" class="com.sv.udb.controlador.Ubic_geogCtrl" scope="page"/>
                <c:forEach items="${beanUbic_geog.consTodo()}" var="fila">
                    <c:choose>
                        <c:when test="{fila.codi_ubic_geof eq cmbTipo_pers}">
                            <option name="codi_ubic_geof" value="${fila.codi_ubic_geof}" selected="">${fila.nomb_ubic_geof}</option>
                        </c:when>
                        <c:otherwise>
                            <option name="codi_ubic_geof" value="${fila.codi_ubic_geof}">${fila.nomb_ubic_geof}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </li>
        <li>
          <label>Fecha de ingreso:</label>
        </li>
        <li>
            <input type="date" name="txtfech_alta">
        </li>
        <li>
          <label>Fecha de baja:</label>
        </li>
        <li>
            <input type="date" name="txtfech_baja">
        </li>
        <li>
          <!--<input type="submit" value="Generar" class="button" />-->
          <input type="submit" name="button" id="SelectedUnidad" class="button">
        </li>
      </ul>
    </form>
  </div>
  <!--/#login.form-action-->
  <div id="register" class="form-action hide">
    <h1>Reporte 2</h1>
    <p>Permite ver el lugar, fecha y hora de acceso y salida de la persona que elija, así como la unidad organizativa que ha visitado.</p>
    <form id="reporte2" action="reporte2.jsp" method="post">
      <ul>
        <li>
            <label>Selecciona la persona</label>
        </li>
        <li>
            <select name="cmbPers">
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
            </select>
        </li>
        <li>
          <input type="submit" value="Generar" class="button" />
        </li>
      </ul>
    </form>
  </div>
  <!--/#register.form-action-->
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src="js/index.js"></script>
  </body>
</html>

