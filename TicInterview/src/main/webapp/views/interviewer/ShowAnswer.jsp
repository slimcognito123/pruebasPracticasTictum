<%-- 
    Document   : ShowAnswer
    Created on : 24-mar-2017, 18:21:35
    Author     : TictumTarde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TIC Interviews | Respuestas</title>
        <meta charset="UTF-8" />

        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="views/css/bootstrap.min.css" />
        <link rel="stylesheet" href="views/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="views/css/fullcalendar.css" />
        <link rel="stylesheet" href="views/css/matrix-style.css" />
        <link rel="stylesheet" href="views/css/matrix-media.css" />
        <link href="views/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" href="views/css/jquery.gritter.css" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>

        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>-->

        <link rel="shortcut icon" href="../img/favicon.ico" type="image/x-icon">
        <link rel="icon" href="views/img/favicon.ico" type="image/x-icon">
    </head>
    <body>

        <!--Header-part-->
        <div id="header">
            <h1><a href="#">alvarito</a></h1>
        </div>
        <!--close-Header-part--> 


        <!--top-Header-menu-->
        <div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav">
                <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Bienvenido Entrevistador: XXXXX</span><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><i class="icon-user"></i> Mi Perfil</a></li>
                        <li class="divider"></li>
                        <li><a href="/Logout.do"><i class="icon-key"></i> Cerrar Sesión</a></li>
                    </ul>
                    </div>
                    <!--close-top-Header-menu-->
                    <!--sidebar-menu-->
                    <div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Inicio</a>
                        <ul>
                            <li class=""><a href="PanelInterviewer.jsp"><i class="icon icon-home"></i> <span>Inicio</span></a> </li>

                            <li class=""> <a href="NewSchema.jsp"><i class="icon icon-plus"></i> <span>Nueva Entrevista</span></a></li>

                            <li class=""> <a href="ShowMySchemas.jsp"><i class="icon icon-info-sign"></i> <span>Entrevistas Creadas</span></a></li>

                            <li class=""> <a href="ShowMyAnswers.jsp"><i class="icon icon-sitemap"></i> <span>Respuestas de Candidatos</span></a></li>

                        </ul>

                    </div>
                    <!--sidebar-menu-->

                    <!--main-container-part-->
                    <div id="content">
                        <!--breadcrumbs-->
                        <div id="content-header">
                            <div id="breadcrumb"> <a href="PanelInterviewer.jsp" title="Ir a Inicio" class="tip-bottom"><i class="icon-home"></i> Inicio</a><a href="ShowMyAnswers.html">Respuestas de Candidatos</a><a href="#" class="current">Respuesta</a></div>
                            <h1>Respuesta a <b>Desarrollador Front-End</b> de <b>Josevi</b></h1>
                        </div>
                        <hr>
                        <div class="container-fluid">


                        </div>
                    </div>
                    </div>
                    </div>
                    <!--end-main-container-part-->

                    <!--Footer-part-->

                    <div class="row-fluid">
                        <div id="footer" class="span12"> 2017 &copy; Josevi | Alvaro | Manuel | Pablo | Fran | Toni | Jesús | Jorge</div>
                    </div>

                    <!--end-Footer-part-->

                    <script src="views/js/excanvas.min.js"></script> 
                    <script src="views/js/jquery.min.js"></script> 
                    <script src="views/js/jquery.ui.custom.js"></script> 
                    <script src="views/js/bootstrap.min.js"></script> 

                    </body>
                    </html>
