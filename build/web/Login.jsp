<%-- 
    Document   : Login
    Created on : 2/12/2020, 03:25:24 PM
    Author     : MOTTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Login</title>
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">
        
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>        
        <script src="js/sweetalert.min.js" type="text/javascript"/>
    </head>
    <body class="bg-dark">
        <div class="container">
            <div class="card card-login mx-auto mt-5">
                <div class="card-header">Login</div>
                <div class="card-body">
                    <form>
                        <div class="form-group">
                            <label for="lblEmail">Correo electronico</label>
                            <input class="form-control" name="txtEmail" type="email" aria-describedby="emailHelp" placeholder="Ingrese email">
                        </div>
                        <div class="form-group">
                            <label for="lblPassword">Contraseña</label>
                            <input class="form-control" id="txtPassword" type="password" placeholder="Contraseña">
                        </div>
                        <div class="form-group">
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="checkbox" name="chkRecordar"> Recordar Contraseña</label>
                            </div>
                        </div>
                        <input name="btnAceptar" type="submit" class="btn btn-primary btn-block" value="Aceptar"/>
                    </form>
                    <div class="text-center">
                        <a class="d-block small mt-3" href="Registrar.jsp">Resgistrar cuenta</a>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
