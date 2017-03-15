<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    
<head>
        <title>TIC Interviews | Login</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="../css/matrix-login.css" />
        <link href="../font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>

    </head>
    <body>
        <div id="loginbox">            
            <form id="loginform" class="form-vertical" action="login.do">
				 <div class="control-group normal_text"><a href="../index.html"><img src="../img/logoo.png" alt="Logo" /></a></div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-envelope"> </i></span><input name="mail" type="email" placeholder="Email" />
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><input name="password" type="password" placeholder="Contraseña" />
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link btn btn-info" id="to-recover"> Regístrate</a></span>
                    <span class="pull-right"><a type="submit" href="../Candidate/PanelCandidate.html" class="btn btn-success" /> Entrar</a></span>
                </div>
            </form>
            <form:form modelAttribute="registro" method="POST" id="recoverform" action="Register.do" class="form-vertical">
				<p class="normal_text">Rellena el formulario si quieres registrarte como candidato.</p>
				
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-user"> </i></span><form:label path="username"></form:label><form:input path="username" name="username" placeholder="Nombre"/>
                            <span class="add-on bg_lg"><i class="icon-user"> </i></span><form:label path="surname"></form:label><form:input path="surname" name="surname" placeholder="Apellidos"/>
                            <span class="add-on bg_lg"><i class="icon-envelope"></i></span><form:label path="mail"></form:label><form:input path="mail" name="mail" type="email" placeholder="Email"/>
                            <span class="add-on bg_lo"><i class="icon-book"></i></span><form:label path="dni"></form:label><form:input path="dni" name="dni" placeholder="DNI"/>
                            <span class="add-on bg_lo"><i class="icon-calendar"></i></span><form:label path="date"></form:label><form:input path="date" type="date" name="date" placeholder="Fecha"/>
                            <span class="add-on bg_lo"><i class="icon-map-marker"></i></span><form:label path="address"></form:label><form:input path="address" type="text" name="address" placeholder="Dirección"/>
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><form:label path="password"></form:label><form:input path="password" type="password" name="password" placeholder="Contraseña"/>
                            <!-- <span class="add-on bg_ly"><i class="icon-unlock"></i></span><input type="password" placeholder="Repetir Contraseña" /> -->
                        </div>
                    </div>
               
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo; Volver</a></span>
                    <span class="pull-right"><a class="btn btn-info"/>Registrar </a></span>
                </div>
            </form:form>
        </div>
        
        <script src="../js/jquery.min.js"></script>  
        <script src="../js/matrix.login.js"></script> 
    </body>

</html>