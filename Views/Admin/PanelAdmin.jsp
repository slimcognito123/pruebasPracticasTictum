<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="beans.Interview" %>
<html lang="en">
<head>
<title>TIC Interviews</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="../css/fullcalendar.css" />
<link rel="stylesheet" href="../css/matrix-style.css" />
<link rel="stylesheet" href="../css/matrix-media.css" />
<link href="../font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" href="../css/jquery.gritter.css" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
<link rel="shortcut icon" href="../img/favicon.ico" type="image/x-icon">
<link rel="icon" href="../img/favicon.ico" type="image/x-icon">
</head>
<body>
<%
	List<Interview> listaEntrevistas;
	if(request.getAttribute("listaEntrevistas") != null){
		listaEntrevistas = request.getAttribute("listaEntrevistas");
	}else{
		response.sendRedirect("../java/com/tt/ticinterview/controller/admin/ShowAllInterviews.do");
	}
%>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">alvarito</a></h1>
</div>
<!--close-Header-part--> 


<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
 <ul class="nav">
    <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Bienvenido Administrador: XXX</span><b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a href="#"><i class="icon-user-md"></i> Mi Perfil</a></li>
        <li class="divider"></li>
        <li><a href="../Access/logAdmin.html"><i class="icon-key"></i> Cerrar Sesión</a></li>
      </ul>
     <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-cog"></i> <span class="text"> Configuración de Usuarios</span> <b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a  title="" href="CreateUser.html"><i class="icon-plus"></i> Crear Usuario</a></li>
        <li class="divider"></li>
        <li><a  title="" href="ManagerUsers.html"><i class="icon-wrench"></i> Gestión de Usuarios</a></li>
      </ul>
    </li>
</div>
<!--close-top-Header-menu-->
<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Inicio</a>
  <ul>
    <li class="active"><a href="PanelAdmin.html"><i class="icon icon-home"></i> <span>Inicio</span></a> </li>

    <li class=""> <a href="NewSchema.html"><i class="icon icon-plus"></i> <span>Nueva Entrevista</span></a></li>

    <li class=""> <a href="ShowAllSchemas.html"><i class="icon icon-info-sign"></i> <span>Entrevistas Creadas</span></a></li>

    <li class=""> <a href="ShowAllAnswers.html"><i class="icon icon-sitemap"></i> <span>Respuestas de Candidatos</span></a></li>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">
<!--breadcrumbs-->
  <div id="content-header">
    <div id="breadcrumb"> <a href="PanelAdmin.html" title="Ir a Inicio" class="tip-bottom"><i class="icon-home"></i> Inicio</a></div>
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
                  <th>Ver Entrevista</th>
                </tr>
              </thead>

              <tbody>
				<% for(entrevista : listaEntrevistas){ %>
                <tr>
                  <td class="taskDesc"><i class="icon-info-sign"></i><%= entrevista.getName(); %></td>
                  <td class="taskStatus"><span class="done"><%= (entrevista.isPrivate) ? ("Privada") : ("Publica");%></span></td>
                  <td class="taskOptions"><a href="../java/com/tt/ticinterview/controller/interviewer/GetSchema.do?id="<%=entrevista.getId() %>" class="tip-top" data-original-title="¡Adelante!"><i class="icon-ok"></i></a></td>
                </tr>
				<% } %>
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

<script src="../js/excanvas.min.js"></script> 
<script src="../js/jquery.min.js"></script> 
<script src="../js/jquery.ui.custom.js"></script> 
<script src="../js/bootstrap.min.js"></script> 
<script src="../js/jquery.flot.min.js"></script> 
<script src="../js/jquery.flot.resize.min.js"></script> 
<script src="../js/jquery.peity.min.js"></script> 
<script src="../js/fullcalendar.min.js"></script> 
<script src="../js/matrix.js"></script> 
<script src="../js/matrix.dashboard.js"></script> 
<script src="../js/jquery.gritter.min.js"></script> 
<script src="../js/matrix.interface.js"></script> 
<script src="../js/matrix.chat.js"></script> 
<script src="../js/jquery.validate.js"></script> 
<script src="../js/matrix.form_validation.js"></script> 
<script src="../js/jquery.wizard.js"></script> 
<script src="../js/jquery.uniform.js"></script> 
<script src="../js/select2.min.js"></script> 
<script src="../js/matrix.popover.js"></script> 
<script src="../js/jquery.dataTables.min.js"></script> 
<script src="../js/matrix.tables.js"></script> 

<script type="text/javascript">
  // This function is called from the pop-up menus to transfer to
  // a different page. Ignore if the value returned is a null string:
  function goPage (newURL) {

      // if url is empty, skip the menu dividers and reset the menu selection to default
      if (newURL != "") {
      
          // if url is "-", it is this page -- reset the menu:
          if (newURL == "-" ) {
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
