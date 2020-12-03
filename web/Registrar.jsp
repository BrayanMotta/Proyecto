<%-- 
    Document   : Registrar
    Created on : 2/12/2020, 04:13:09 PM
    Author     : MOTTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Registrar</title>
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
    </head>
    <body class="bg-dark">
        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Registrar una cuenta</div>
                <div class="card-body">
                    <form>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIdentificacion">Identificacion</label>
                                    <input class="form-control" id="txtIdentificacion" type="text" placeholder="Ingrese Identificacion">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblPrimerNombre">Primer Nombre</label>
                                    <input class="form-control" id="txtPrimerNombre" type="text" placeholder="Ingrese primer nombre">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblSegundoNombre">Segundo Nombre</label>
                                    <input class="form-control" id="txtSegundoNombre" type="text" placeholder="Ingrese segundo nombre">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblPrimerApellidp">Primer Apellido</label>
                                    <input class="form-control" id="txtPrimerApellido" type="text" placeholder="Ingrese primer apellido">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblSegundoApellido">Segundo Apellido</label>
                                    <input class="form-control" id="txtSegundoApellido" type="text" placeholder="Ingrese segundo apellido">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblDireccion">Direccion</label>
                                    <input class="form-control" id="txtDireccion" type="text" placeholder="Ingrese direccion">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblTelefono">Telefono</label>
                                    <input class="form-control" id="txtTelefono" type="text" placeholder="Ingrese telefono">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label for="lblCorreo">Correo Electronico</label>
                                    <input class="form-control" id="txtCorreo" type="text" placeholder="Ingrese correo electronico">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblPassword">Password</label>
                                    <input class="form-control" id="txtPassword" type="password" placeholder="Ingrese password">
                                </div>
                                <div class="col-md-6">
                                    <label for="lblConfirmarPassword">Confirmar Password</label>
                                    <input class="form-control" id="txtConfirmarPassword" type="password" placeholder="Confirme password">
                                </div>
                            </div>
                        </div>
                        <input name="btnAceptar" type="submit" class="btn btn-primary btn-block" value="Aceptar"/>
                    </form>
                    <div class="text-center">
                        <a class="d-block small mt-3" href="Login.jsp">Login</a>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
