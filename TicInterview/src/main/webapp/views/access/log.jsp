<!DOCTYPE html>
<html lang="en">

<head>

    <title>TIC Interviews | Login</title><meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="views/css/bootstrap.min.css" />
    <link rel="stylesheet" href="views/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="views/css/matrix-login.css" />
    <link href="views/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    <link rel="shortcut icon" href="../img/favicon.ico" type="image/x-icon">
    <link rel="icon" href="views/img/favicon.ico" type="image/x-icon">

</head>
<body>
<div id="loginbox">
    <form id="loginform" class="form-vertical" action="/Login.do" method="get">
        <div class="control-group normal_text"><a href="views/index.html"><img src="views/img/logoo.png" alt="Logo" /></a></div>
        <div class="control-group">
            <div class="controls">
                <div class="main_input_box">
                    <span class="add-on bg_lg"><i class="icon-envelope"> </i></span><input type="email" placeholder="Email" name="mail" required/>

                </div>
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <div class="main_input_box">
                    <span class="add-on bg_ly"><i class="icon-lock"></i></span><input type="password" placeholder="Contraseña" name="password" required/>
                </div>
            </div>
        </div>
        <div class="form-actions">
            <span class="pull-left"><a href="#" class="flip-link btn btn-info" id="to-recover"> Regístrate</a></span>
            <span class="pull-right"><input type="submit"  class="btn btn-success" value="Login " /> </span>

        </div>

    </form>
    <form id="recoverform" action="#" class="form-vertical">
        <p class="normal_text">Rellena el formulario si quieres registrarte como candidato.</p>

        <div class="controls">
            <div class="main_input_box">
                <span class="add-on bg_lg"><i class="icon-user"> </i></span><input type="text" placeholder="Nombre" />
                <span class="add-on bg_lg"><i class="icon-user"> </i></span><input type="text" placeholder="Apellidos" />
                <span class="add-on bg_lg"><i class="icon-envelope"></i></span><input type="email" placeholder="Email" />
                <span class="add-on bg_lo"><i class="icon-book"></i></span><input type="text" placeholder="DNI" />
                <span class="add-on bg_lo"><i class="icon-calendar"></i></span><input type="date" placeholder="Fecha Nacimiento" />
                <span class="add-on bg_lo"><i class="icon-map-marker"></i></span><input type="text" placeholder="Dirección" />
                <span class="add-on bg_ly"><i class="icon-lock"></i></span><input type="password" placeholder="Contraseña" />
                <span class="add-on bg_ly"><i class="icon-unlock"></i></span><input type="password" placeholder="Repetir Contraseña" />
            </div>
        </div>

        <div class="form-actions">
            <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo; Volver</a></span>
            <span class="pull-right"><a class="btn btn-info">Registrar </a></span>
        </div>
    </form>
</div>

<script src="views/js/jquery.min.js"></script>
<script src="views/js/matrix.login.js"></script>
</body>


</html>