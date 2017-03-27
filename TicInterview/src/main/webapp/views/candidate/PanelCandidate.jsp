<%-- 
    Document   : PanelCandidate
    Created on : 24-mar-2017, 18:19:24
    Author     : TictumTarde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TIC Interviews</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="views/css/bootstrap.min.css" />
        <link rel="stylesheet" href="views/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="views/css/matrix-style.css" />
        <link rel="stylesheet" href="views/css/matrix-media.css" />
        <link href="views/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" href="../css/jquery.gritter.css" />
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
                <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Bienvenido Usuario: XXXX</span><b class="caret"></b></a>
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
                            <li class="active"><a href="PanelCandidate.jsp"><i class="icon icon-home"></i> <span>Inicio</span></a> </li>

                            <li class=""> <a href="MyInvitations.jsp"><i class="icon icon-sitemap"></i> <span>Mis Invitaciones</span></a></li>

                            <li class=""> <a href="MyProcess.jsp"><i class="icon icon-ok-circle"></i> <span>Procesos Superados</span></a></li>

                    </div>
                    <!--sidebar-menu-->

                    <!--main-container-part-->
                    <div id="content">
                        <!--breadcrumbs-->
                        <div id="content-header">
                            <div id="breadcrumb"> <a href="PanelCandidate.jsp" title="Ir a Inicio" class="tip-bottom"><i class="icon-home"></i> Inicio</a></div>
                        </div>
                        <!--End-breadcrumbs-->
                        <div class="container-fluid">
                            <center><h3>Aquí puedes ver todas las entrevistas publicadas</h3></center>

                            <div class="widget-box">
                                <div class="widget-title"> <span class="icon"><i class="icon-reorder"></i></span>
                                    <h5>Entrevistas publicadas en TIC Interviews</h5>
                                </div>
                                <div class="widget-content nopadding">
                                    <table class="table table-striped table-bordered">
                                        <thead>
                                            <tr>
                                                <th>Descripción</th>
                                                <th>Estado</th>
                                                <th>Realizar Entrevista</th>
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <tr>
                                                <td class="taskDesc"><i class="icon-info-sign"></i>Desarrollador Front-End - Maquetación en nuevos estándares web, Posicionamiento SEO...</td>
                                                <td class="taskStatus"><span class="done">Activa</span></td>
                                                <td class="taskOptions"><a href="#" class="tip-top"><button class="btn btn-success"> <span class="icon-ok"></span></button></a></td>
                                            </tr>
                                            <tr>
                                                <td class="taskDesc"><i class="icon-info-sign"></i>Desarrollador Back-End - Valoramos si eres capaz de pasar 48h. programando</td>
                                                <td class="taskStatus"><span class="done">Activa</span></td>
                                                <td class="taskOptions"><a href="#" class="tip-top"><button class="btn btn-success"> <span class="icon-ok"></span></button></a></td>
                                            </tr>
                                            <tr>
                                                <td class="taskDesc"><i class="icon-info-sign"></i>Camarero de cafés y limpia polvo de los teclados de la oficina</td>
                                                <td class="taskStatus"><span class="pending">No se aceptan más candidatos</span></td>
                                                <td class="taskOptions"><a href="#" class="tip-top"><button class="btn btn-danger"> <span class="icon-remove"></span></button></a></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

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
                    <script src="views/js/jquery.flot.min.js"></script> 
                    <script src="views/js/jquery.flot.resize.min.js"></script> 
                    <script src="views/js/jquery.peity.min.js"></script> 
                    <script src="views/js/fullcalendar.min.js"></script> 
                    <script src="views/js/matrix.js"></script> 
                    <script src="views/js/matrix.dashboard.js"></script> 
                    <script src="views/js/jquery.gritter.min.js"></script> 
                    <script src="views/js/matrix.interface.js"></script> 
                    <script src="views/js/matrix.chat.js"></script> 
                    <script src="views/js/jquery.validate.js"></script> 
                    <script src="views/js/matrix.form_validation.js"></script> 
                    <script src="views/js/jquery.wizard.js"></script> 
                    <script src="views/js/jquery.uniform.js"></script> 
                    <script src="views/js/select2.min.js"></script> 
                    <script src="views/js/matrix.popover.js"></script> 
                    <script src="views/js/jquery.dataTables.min.js"></script> 
                    <script src="views/js/matrix.tables.js"></script> 

                    <script type="text/javascript">
                        // This function is called from the pop-up menus to transfer to
                        // a different page. Ignore if the value returned is a null string:
                        function goPage(newURL) {

                            // if url is empty, skip the menu dividers and reset the menu selection to default
                            if (newURL != "") {

                                // if url is "-", it is this page -- reset the menu:
                                if (newURL == "-") {
                                    resetMenu();
                                }
                                // else, send page to designated URL            
                                else {
                                    document.location.href = newURL;
                                }
                            }
                        }

                        // resets the menu selection upon entry to this page:
                        function resetMenu() {
                            document.gomenu.selector.selectedIndex = 2;
                        }
                    </script>
                    </body>
                    </html>