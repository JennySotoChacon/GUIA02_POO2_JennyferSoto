<%-- 
    Document   : indexPrueba
    Created on : 06-ago-2016, 21:48:14
    Author     : Owner
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.sv.udb.controlador.Unid_orgaCtrl"%>
<%@page import="com.sv.udb.modelo.unid_orga"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Guia 01-POO 2</title>
    <link rel="stylesheet" href="css/reset.css">
        <style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
      @import url(http://fonts.googleapis.com/css?family=Roboto:100);
.flat-form {
  background: #e74c3c;
  color: white;
  margin: 25px auto;
  width: 390px;
  height: 360px;
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
.flat-form form input[type=date], .flat-form form select, .flat-form form input[type=submit] {
  font-family: 'Roboto';
  font-size: 20px;
}
.flat-form form input[type=date], .flat-form form select {
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
      <a href="#login" class="active">Reporte1</a>
    </li>
    <li>
      <a href="#register">Reporte2</a>
    </li>
    <li>
      <a href="#reset">Reporte3</a>
    </li>
  </ul>
  <div id="login" class="form-action show">
    <h1>Reporte 1</h1>
    <p>Todas las visitas de la unidad organizativa que elija</p>
    <form id="reporte1" action="reporte1.jsp" method="post">
      <ul>
        <li>
          <label>Selecciona la unidad organizativa</label>
        </li>
        <li>
          <select name="cmbUnidad">
                        <jsp:useBean id="beanUnidCtrl" class="com.sv.udb.controlador.Unid_orgaCtrl" scope="page"/>
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
         </select>
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
  <div id="reset" class="form-action hide">
    <h1>Reporte 3</h1>
    <p>Permite ver las visitas realizadas a las unidades entre cierto periodo de tiempo</p>
    <form id="reporte3" action="reporte3.jsp" method="post">
      <ul>
        <li>
          <label>Fecha de inicio</label>
          <input type="date" name="fechaInicio"/>
        </li>
        <li>
          <label>Fecha de fin</label>
          <input type="date" name="fechaFin"/>
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

