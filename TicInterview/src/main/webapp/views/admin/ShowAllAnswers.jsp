<%-- 
    Document   : ShowAllAnswers
    Created on : 24-mar-2017, 18:13:47
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
        <link rel="shortcut icon" href="views/img/favicon.ico" type="image/x-icon">
        <link rel="icon" href="views/img/favicon.ico" type="image/x-icon">
    </head>
    <body>

        <!--Header-part-->
        <div id="header">
            <h1><a href="dashboard.html">alvarito</a></h1>
        </div>
        <!--close-Header-part--> 


        <!--top-Header-menu-->
        <div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav">
                <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Bienvenido Administrador: XXXX</span><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><i class="icon-user-md"></i> Mi Perfil</a></li>
                        <li class="divider"></li>
                        <li><a href="/Logout.do"><i class="icon-key"></i> Cerrar Sesión</a></li>
                    </ul>
                <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-cog"></i> <span class="text"> Configuración de Usuarios</span> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a  title="" href="CreateUser.jsp"><i class="icon-plus"></i> Crear Usuario</a></li>
                        <li class="divider"></li>
                        <li><a  title="" href="ManagerUsers.jsp"><i class="icon-wrench"></i> Gestión de Usuarios</a></li>
                    </ul>
                </li>
        </div>
        <!--close-top-Header-menu-->
        <!--sidebar-menu-->
        <div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Inicio</a>
            <ul>
                <li class=""><a href="PanelAdmin.jsp"><i class="icon icon-home"></i> <span>Inicio</span></a> </li>

                <li class=""> <a href="NewSchema.jsp"><i class="icon icon-plus"></i> <span>Nueva Entrevista</span></a></li>

                <li class=""> <a href="ShowAllSchemas.jsp"><i class="icon icon-info-sign"></i> <span>Entrevistas Creadas</span></a></li>

                <li class="active"> <a href="ShowAllAnswers.jsp"><i class="icon icon-sitemap"></i> <span>Respuestas de Candidatos</span></a></li>



        </div>
        <!--sidebar-menu-->

        <!--main-container-part-->
        <div id="content">
            <!--breadcrumbs-->
            <div id="content-header">
                <div id="breadcrumb"> <a href="PanelAdmin.jsp" title="Ir a Inicio" class="tip-bottom"><i class="icon-home"></i> Inicio</a><a href="#" class="current">Entrevistas Creadas</a></div>
                <h1>Entrevistas Creadas</h1>
            </div>
            <hr>
            <div class="container-fluid">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"><i class="icon-reorder"></i></span>
                        <h5>Entrevistas publicadas en TIC Interviews</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <table class="table table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th>Entrevista</th>
                                    <th>Nombre del Candidato</th>
                                    <th>Ver Respuesta</th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr>
                                    <td class="taskDesc"><i class="icon-info-sign"></i>Desarrollador Front-End - Maquetación en nuevos estándares web, Posicionamiento SEO...</td>
                                    <td class="taskStatus"><span class="done">Josevi</span></td>
                                    <td class="taskOptions"><a href="ShowAnswer.html" class="tip-top"><button class="btn btn-info"> <span class="icon-chevron-right"></span></button></a></td>
                                </tr>
                                <tr>
                                    <td class="taskDesc"><i class="icon-info-sign"></i>Desarrollador Back-End - Valoramos si eres capaz de pasar 48h. programando</td>
                                    <td class="taskStatus"><span class="done">Alvaro</span></td>
                                    <td class="taskOptions"><a href="ShowAnswer.html" class="tip-top"><button class="btn btn-info"> <span class="icon-chevron-right"></span></button></a></td>
                                </tr>
                                <tr>
                                    <td class="taskDesc"><i class="icon-info-sign"></i>Camarero de cafés y limpia polvo de los teclados de la oficina</td>
                                    <td class="taskStatus"><span class="done">Josevi</span></td>
                                    <td class="taskOptions"><a href="ShowAnswer.html" class="tip-top"><button class="btn btn-info"> <span class="icon-chevron-right"></span></button></a></td>
                                </tr>
                            </tbody>
                        </table>
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
