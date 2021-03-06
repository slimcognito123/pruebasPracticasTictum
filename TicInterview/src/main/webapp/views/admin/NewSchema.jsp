<%-- 
    Document   : NewSchema
    Created on : 24-mar-2017, 18:12:58
    Author     : TictumTarde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TIC Interviews | Nueva Entrevista</title>
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

                <li class="active"> <a href="NewSchema.jsp"><i class="icon icon-plus"></i> <span>Nueva Entrevista</span></a></li>

                <li class=""> <a href="ShowAllSchemas.jsp"><i class="icon icon-info-sign"></i> <span>Entrevistas Creadas</span></a></li>

                <li class=""> <a href="ShowAllAnswers.jsp"><i class="icon icon-sitemap"></i> <span>Respuestas de Candidatos</span></a></li>



        </div>
        <!--sidebar-menu-->

        <!--main-container-part-->
        <div id="content">
            <!--breadcrumbs-->
            <div id="content-header">
                <div id="breadcrumb"> <a href="PanelAdmin.jsp" title="Ir a Inicio" class="tip-bottom"><i class="icon-home"></i> Inicio</a><a href="NewSchema.jsp" class="current">Nueva Entrevista</a></div>
                <h1><b>Generador de Entrevistas</b> | Puedes arrastrar los elementos</h1>
            </div>
            <hr>
            <div class="container-fluid">

                <form method="GET" action="#" id="pregunta" hidden>
                    <input type="text" placeholder="Escribe la pregunta" id="textoPregunta" />
                    <button type="button" id="enviarPregunta" class="btn btn-large btn-success" ><i class="icon-ok"></i> </button>
                </form>
                <div  class="quick-actions_homepage" id="elementos">
                    <ul class="quick-actions">
                        <li class="bg_lr span3" > <a href="#" id="video" name="video" > <i class="icon-play"></i> Video</a> </li>
                        <li class="bg_lg" > <a href="#" id="checkbox" name="checkbox" > <i class="icon-check"></i> Checkbox</a> </li>
                        <li class="bg_lb" > <a href="#" id="text" name="text" > <i class="icon-font"></i> Texto</a> </li>
                        <li class="bg_ly" > <a href="#" id="radioButton" name="radio" > <i class="icon-list"></i> Radiobutton</a> </li>
                        <li class="bg_ls" > <a href="#" id="number" name="number" > <i class="icon-phone"></i> Número</a> </li>
                        <li class="bg_ls" > <a href="#" id="range" name="range" > <i class="icon-star"></i> Range</a> </li>
                        <li class="bg_ly" > <a href="#" id="url" name="url" > <i class="icon-globe"></i> URL</a> </li>
                        <!--<li class="bg_lb"> <a href="#" id="icon-list-ol"> <i class="icon-list-ol"></i> Option</a> </li>
                        <li class="bg_lg"> <a href="#" id="icon-edit"> <i class="icon-edit"></i> Select</a> </li>-->
                        <li class="bg_lb"> <a href="#" id="date" name="date" > <i class="icon-calendar"></i> Fecha</a> </li>
                        <!--<button class="btn btn-danger" id="reset" > <span class="icon-trash"></span> Deshacer</button>-->
                    </ul>
                </div>
                <form method="GET" action="/CreateInterviewByAdmin.do" id="terminar" hidden><br><br>
                    <button type="button" id="terminarPregunta" class="btn btn-large btn-success"><i class="icon-ok"></i> Terminar</button><br><br>
                </form>
            </div>
            <!--End-breadcrumbs-->
            <div class="container-fluid">
                <div class="entrevista">



                    <h4 style="text-align: center; padding-top: 50px">Suelte aquí los elementos que quieres añadir</h4>



                </div>
                <form action="intermedia.jsp" method="get" align="right"><br>
                    <button type="submit" class="btn btn-large btn-info"><i class="icon-bolt"></i> Crear Maqueta de Entrevista</button>
                    <div id="respuesta" hidden>
                    </div>
                </form>
                <div id="listaPreguntas">
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
        <!--
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
        <script src="../js/matrix.tables.js"></script> -->

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

            //Codigo toni JQuery

            var numero = 1;
            var textForm = "";

            function dragged(id) {
                alert(id);
            }

            $(document).ready(function () {
                var dragged = "";
                var pregunta;
                var elementoSeleccionado;
                var video = $("#video");
                video.draggable();
                video.data({'originalLeft': video.css('left'), 'origionalTop': video.css('top')});
                var check = $("#checkbox");
                check.draggable();
                check.data({'originalLeft': check.css('left'), 'origionalTop': check.css('top')});
                var texto = $("#text");
                texto.draggable();
                texto.data({'originalLeft': texto.css('left'), 'origionalTop': texto.css('top')});
                var radiobutton = $("#radioButton");
                radiobutton.draggable();
                radiobutton.data({'originalLeft': radiobutton.css('left'), 'origionalTop': radiobutton.css('top')});
                var number = $("#number");
                number.draggable();
                number.data({'originalLeft': number.css('left'), 'origionalTop': number.css('top')});
                var rango = $("#range");
                rango.draggable();
                rango.data({'originalLeft': rango.css('left'), 'origionalTop': rango.css('top')});
                var url = $("#url");
                url.draggable();
                url.data({'originalLeft': url.css('left'), 'origionalTop': url.css('top')});
                var date = $("#date");
                date.draggable();
                date.data({'originalLeft': date.css('left'), 'origionalTop': date.css('top')});

                $(".entrevista").droppable({
                    drop: function (event, ui) {
                        $(this).css('background', '#B3C2B2');
                        if (dragged == "") {
                            $(".entrevista").html("<br/>");
                        }
                        dragged = ui.draggable.attr('name');
                        encontrarElemento(dragged);
                        desactivar();
                        elementoSeleccionado.draggable('enable');
                        $("#pregunta").show();
                        $("#pregunta").focus();
                    },
                    over: function (event, ui) {
                        $(this).css('background', '#CFEAE9');
                    },
                    out: function (event, ui) {
                        $(this).css('background', '#eeeeee');
                        activar();
                        $("#pregunta").hide();
                    }
                });

                function desactivar() {
                    video.draggable('disable');
                    date.draggable('disable');
                    url.draggable('disable');
                    rango.draggable('disable');
                    number.draggable('disable');
                    radiobutton.draggable('disable');
                    texto.draggable('disable');
                    check.draggable('disable');
                }

                function activar() {
                    date.draggable('enable');
                    url.draggable('enable');
                    rango.draggable('enable');
                    number.draggable('enable');
                    radiobutton.draggable('enable');
                    texto.draggable('enable');
                    check.draggable('enable');
                }

                function resetear() {
                    video.css({'left': video.data('originalLeft'), 'top': video.data('origionalTop')});
                    date.css({'left': date.data('originalLeft'), 'top': date.data('origionalTop')});
                    url.css({'left': url.data('originalLeft'), 'top': url.data('origionalTop')});
                    rango.css({'left': rango.data('originalLeft'), 'top': rango.data('origionalTop')});
                    number.css({'left': number.data('originalLeft'), 'top': number.data('origionalTop')});
                    radiobutton.css({'left': radiobutton.data('originalLeft'), 'top': radiobutton.data('origionalTop')});
                    texto.css({'left': texto.data('originalLeft'), 'top': texto.data('origionalTop')});
                    check.css({'left': check.data('originalLeft'), 'top': check.data('origionalTop')});
                    $(".entrevista").css('background', '#eeeeee');
                }

                $("#enviarPregunta").click(function () {
                    pregunta = $("#textoPregunta").val();
                    $("#textoPregunta").val("");
                    if (dragged != "video") {
                        activar();
                    }
                    $("#pregunta").hide();
                    resetear();
                    textForm = $("#respuesta").html();
                    alert("Texto antes: " + textForm);
                    $("#respuesta").html(textForm + "<input type='text' id='question" + numero + "' value='" + pregunta + "' /> <input type='text' id='type" + numero + "' value='" + dragged + "' /> ");
                    numero = numero + 1;
                    textForm = $("#respuesta").html();
                    $("#respuesta").html(textForm);
                    alert("Testo despues:" + textForm);
                    prevision();
                    $("#terminar").show();
                });

                $("#terminar").click(function () {
                    $(".entrevista").html("<h4 style='text-align: center; padding-top: 50px'>Suelte aquí los elementos que quieres añadir</h4>");
                    activar();
                    $("#pregunta").hide();
                    $("#terminar").hide();
                    var x = $("#listaPreguntas").html();
                    if (dragged == "video") {
                        $("#listaPreguntas").html(x + "Pregunta de video<br/>");
                    } else {
                        $("#listaPreguntas").html(x + "Formulario<br/>");
                    }
                    video.draggable('enable');
                });

                function prevision() {
                    var interview = $(".entrevista");
                    var txPreview = interview.html();
                    if (dragged == "video") {
                        var idVideo = pregunta.split("=");
                        interview.html(txPreview + "<iframe title='YouTube video player' class='youtube-player' type='text/html' width='250' height='250' src='http://www.youtube.com/embed/" + idVideo[1] + "' frameborder='0' allowFullScreen></iframe>");
                    } else {
                        interview.html(txPreview + "<label>" + pregunta + " &nbsp &nbsp &nbsp &nbsp &nbsp <input type='" + dragged + "' /></label>");
                    }
                    txPreview = interview.html();
                    alert(txPreview);
                    interview.html(txPreview);
                }

                function encontrarElemento(nombre) {
                    switch (nombre) {
                        case "video":
                            elementoSeleccionado = video;
                            break;
                        case "checkbox":
                            elementoSeleccionado = check;
                            break;
                        case "text":
                            elementoSeleccionado = texto;
                            break;
                        case "radio":
                            elementoSeleccionado = radiobutton;
                            break;
                        case "number":
                            elementoSeleccionado = number;
                            break;
                        case "range":
                            elementoSeleccionado = rango;
                            break;
                        case "url":
                            elementoSeleccionado = url;
                            break;
                        case "date":
                            elementoSeleccionado = date;
                            break;
                    }
                }

            });


        </script>
    </body>
</html>
