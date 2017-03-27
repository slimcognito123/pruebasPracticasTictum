<%-- 
    Document   : loginAdmin
    Created on : 24-mar-2017, 17:21:12
    Author     : TictumTarde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    
<head>
        <title>TIC Interviews | Login Admin</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="views/css/bootstrap.min.css" />
		<link rel="stylesheet" href="views/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="views/css/matrix-login.css" />
        <link href="views/font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
        <link rel="shortcut icon" href="views/img/favicon.ico" type="image/x-icon">
        <link rel="icon" href="views/img/favicon.ico" type="image/x-icon">

    </head>
    <body>
        <div id="loginbox">            
            <form id="loginform" class="form-vertical" action="views/admin/PanelAdmin.jsp">
                <center><h4>LOGIN ADMINISTRADOR</h4></center>
				 <div class="control-group normal_text"><a href="../index.html"><img src="views/img/logoo.png" alt="Logo" /></a></div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-envelope"> </i></span><input type="email" placeholder="Email" />
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><input type="password" placeholder="Contraseña" />
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-right"><a type="submit" href="views/admin/PanelAdmin.jsp" class="btn btn-success" /> Entrar</a></span>
                </div>
            </form>
        </div>
        
        <script src="views/js/jquery.min.js"></script>  
        <script src="views/js/matrix.login.js"></script> 
    </body>

</html>

