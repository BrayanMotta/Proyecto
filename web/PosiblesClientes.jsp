<%-- 
    Document   : PosiblesClientes
    Created on : 3/12/2020, 04:29:41 PM
    Author     : MOTTA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Posibles Clientes</title>
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

        <link href="css/sweetalert.css" rel="stylesheet" type="text/css" />
        <script src="js/sweetalert.min.js" type="text/javascript"></script>

    </head>
    <body>
        <%
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();
            //Existencia de la variable de sesion
            if (session.getAttribute("sesion_lstclsPosiblesClientes") != null) {
                //Casting para darle un tipo de dato a la variable sesion
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("sesion_lstclsPosiblesClientes");
            }

            if (request.getAttribute("stMensaje") != null && request.getAttribute("stTipo") != null) {
        %>    
        <input type="text" hidden="" id="txtMensaje" value="<%=request.getAttribute("stMensaje")%>"/>
        <input type="text" hidden="" id="txtTipo" value="<%=request.getAttribute("stTipo")%>"/>

        <script>
            var mensaje = document.getElementById("txtMensaje").value;
            var tipo = document.getElementById("txtTipo").value;

            swal("Mensaje", mensaje, tipo);
        </script>
        <%
            }
        %>
        <div class="container">
            <div class="card mx-auto mt-5">
                <div class="card-header">Crear Posibles Clientes</div>
                <div class="card-body">
                    <form action="PosiblesClientesController" method="post">
                        <!-- FILA-->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- COLUMNA-->
                                <div class="col-md-6">
                                    <input type="submit" value="Guardar" class="btn btn-outline-primary" name="btnGuardar"/>
                                    <input type="submit" value="Modificar" class="btn btn-outline-primary" name="btnModificar"/>
                                    <input type="submit" value="Cancelar" class="btn btn-outline-primary" name="btnCancelar"/>
                                    <input type="submit" value="Volver" class="btn btn-outline-primary" name="btnVolver"/>
                                </div>
                            </div>
                        </div>
                        <!-- FILA-->
                        <div class="form-group">
                            <!-- COLUMNA-->
                            <div class="form-row">
                                <h1>Informacion de Posible cliente</h1>                                
                            </div>
                        </div>
                        <!-- FILA-->
                        <div class="form-group">
                            <!-- COLUMNA-->
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblEmpresa">Empresa</label>
                                    <input class="form-control" type="text" placeholder="Ingrese la empresa" name="txtEmpresa"/>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblNombre">Nombre</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el nombre" name="txtNombre"/>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblApellido">Apellido</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el apellido" name="txtApellido"/>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblTitulo">Titulo</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el titulo" name="txtTitulo" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <!-- COLUMNA-->
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblCorreo">Correo electronico</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el correo" name="txtCorreo" />
                                </div>
                                <div class="col-md-3">
                                    <label name="lblTelefono">Telefono</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el telefono" name="txtTelefono" />
                                </div>
                                <div class="col-md-3">
                                    <label name="lblFax">Fax</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el fax" name="txtFax" />
                                </div>
                                <div class="col-md-3">
                                    <label name="lblMovil">Movil</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el movil" name="txtMovil" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <!-- COLUMNA-->
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblSitioWeb">Sitio Web</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el sitio web" name="txtSitioWeb" />
                                </div>
                                <div class="col-md-3">
                                    <label name="lblFPC">Fuente de Posibles clientes</label>
                                    <select class="form-control" name="ddlFPC">
                                        <option value="1">None</option>
                                        <option value="2">Aviso</option>
                                        <option value="3">Llamada no solicitada</option>
                                        <option value="4">Recomendacion de empleado</option>
                                        <option value="5">Recomendacion externa</option>
                                        <option value="6">Tienda en linea</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblEPC">Estado de Posible cliente</label>
                                    <select class="form-control" name="ddlEPC">
                                        <option value="1">None</option>
                                        <option value="2">Intento de contacto</option>
                                        <option value="3">Contactar en el futuro</option>
                                        <option value="4">Contactado</option>
                                        <option value="5">Posible cliente no solicitado</option>
                                        <option value="6">Posible cliente perdido</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblSector">Sector</label>
                                    <select class="form-control" name="ddlSector">
                                        <option value="1">None</option>
                                        <option value="2">APS (Proveerdor de servicio de aplicaciones)</option>
                                        <option value="3">OEM de datos</option>
                                        <option value="4">ERP (Planificacion de recursos de empresa)</option>
                                        <option value="5">Gobierno/Ejercito</option>
                                        <option value="6">Empresa grande</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblCantidadEmpleados">Cantidad de empleado</label>
                                    <input class="form-control" type="number" placeholder="Ingrese la cantidad de empleados" name="txtCantidadEmpleados" />
                                </div>
                                <div class="col-md-3">
                                    <label name="lblIngresosAnuales">Ingresos anuales</label>
                                    <input class="form-control" type="number" placeholder="Ingrese los ingresos" name="txtIngresosAnuales" />
                                </div>
                                <div class="col-md-3">
                                    <label name="lblCalificacion">Calificacion</label>
                                    <select class="form-control" name="ddlCalificacion">
                                        <option value="1">None</option>
                                        <option value="2">Adquirido</option>
                                        <option value="3">Activo</option>
                                        <option value="4">Fallo de mercado</option>
                                        <option value="5">Proyecto cancelado</option>
                                        <option value="6">Apagar</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <label name="lblNPCE">
                                        <input type="checkbox" name="chkNPCE"/>
                                        No participacion correo electronico
                                    </label>                                    
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-3">
                                    <label name="lblIDSkype">ID de Skype</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el ID de Skype" name="txtIDSkype" />
                                </div>
                                <div class="col-md-3">
                                    <label name="lblTwitter">Twitter</label>
                                    <input class="form-control" type="text" placeholder="Ingrese el Twitter" name="txtTwitter" />
                                </div>
                                <div class="col-md-6">
                                    <label name="lblCorreoSecundario">Correo electronico secundario</label>
                                    <input class="form-control" type="text" placeholder="Ingrese correo secundario" name="txtCorreoSecundario" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-12">
                                    <i class="fa fa-check-circle"></i>
                                    Registros: <%= lstclsPosiblesClientes.size()%>
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-12">
                                    <table class="table table-bordered table-primary table-responsive">                                        
                                        <tr>
                                            <td>Empresa</td>
                                            <td>Nombre</td>
                                            <td>Apellido</td>
                                            <td>Titulo</td>
                                            <td>Correo electronico</td>
                                            <td>Telefono</td>
                                            <td>Fax</td>
                                            <td>Movil</td>
                                            <td>Sitio Web</td>
                                            <td>Fuente de Posibles Clientes</td>
                                            <td>Estado de Posible Cliente</td>
                                            <td>Sector</td>
                                            <td>Cantidad de empleados</td>
                                            <td>Ingresos anuales</td>
                                            <td>Calificacion</td>
                                            <td>No participacion de correo electronico</td>
                                            <td>ID de Skype</td>
                                            <td>Twitter</td>
                                            <td>Correo electronico secundario</td>
                                        </tr>
                                        <%
                                            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {
                                                Models.clsFPC obclsFPC = item.getObclsFPC();
                                                Models.clsEPC obclsEPC = item.getObclsEPC();
                                                Models.clsSector obclsSector = item.getObclsSector();
                                                Models.clsCalificacion obclsCalificacion = item.getObclsCalificacion();
                                        %>
                                        <tr>
                                            <td><%= item.getStEmpresa() %></td>
                                            <td><%= item.getStNombre() %></td>
                                            <td><%= item.getStApellido() %></td>
                                            <td><%= item.getStTitulo() %></td>
                                            <td><%= item.getStCorreo() %></td>
                                            <td><%= item.getStTelefono() %></td>
                                            <td><%= item.getStFax() %></td>
                                            <td><%= item.getStMovil() %></td>
                                            <td><%= item.getStSitioWeb() %></td>
                                            <td><%= obclsFPC.getStDescripcion() %></td>
                                            <td><%= obclsEPC.getStDescripcion() %></td>
                                            <td><%= obclsSector.getStDescripcion() %></td>
                                            <td><%= item.getInCantidadEmpleados() %></td>
                                            <td><%= item.getDbIngresosAnuales() %></td>
                                            <td><%= obclsCalificacion.getStDescripcion() %></td>
                                            <td><%= item.getChNPCE() %></td>
                                            <td><%= item.getStIDSkype() %></td>
                                            <td><%= item.getStTwitter() %></td>
                                            <td><%= item.getStCorreoSecundario() %></td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
