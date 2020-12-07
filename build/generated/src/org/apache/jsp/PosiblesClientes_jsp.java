package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class PosiblesClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Posibles Clientes</title>\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();
            //Existencia de la variable de sesion
            if (session.getAttribute("sesion_lstclsPosiblesClientes") != null) {
                //Casting para darle un tipo de dato a la variable sesion
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("sesion_lstclsPosiblesClientes");
            }

            if (request.getAttribute("stMensaje") != null && request.getAttribute("stTipo") != null) {
        
      out.write("    \n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtMensaje\" value=\"");
      out.print(request.getAttribute("stMensaje"));
      out.write("\"/>\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtTipo\" value=\"");
      out.print(request.getAttribute("stTipo"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var mensaje = document.getElementById(\"txtMensaje\").value;\n");
      out.write("            var tipo = document.getElementById(\"txtTipo\").value;\n");
      out.write("\n");
      out.write("            swal(\"Mensaje\", mensaje, tipo);\n");
      out.write("        </script>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Crear Posibles Clientes</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"PosiblesClientesController\" method=\"post\">\n");
      out.write("                        <!-- FILA-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- COLUMNA-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-outline-primary\" name=\"btnGuardar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Modificar\" class=\"btn btn-outline-primary\" name=\"btnModificar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Cancelar\" class=\"btn btn-outline-primary\" name=\"btnCancelar\"/>\n");
      out.write("                                    <input type=\"submit\" value=\"Volver\" class=\"btn btn-outline-primary\" name=\"btnVolver\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <!-- COLUMNA-->\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <h1>Informacion de Posible cliente</h1>                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- FILA-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <!-- COLUMNA-->\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblEmpresa\">Empresa</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese la empresa\" name=\"txtEmpresa\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNombre\">Nombre</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el nombre\" name=\"txtNombre\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblApellido\">Apellido</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el apellido\" name=\"txtApellido\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTitulo\">Titulo</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el titulo\" name=\"txtTitulo\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <!-- COLUMNA-->\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCorreo\">Correo electronico</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el correo\" name=\"txtCorreo\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTelefono\">Telefono</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el telefono\" name=\"txtTelefono\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFax\">Fax</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el fax\" name=\"txtFax\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblMovil\">Movil</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el movil\" name=\"txtMovil\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <!-- COLUMNA-->\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblSitioWeb\">Sitio Web</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el sitio web\" name=\"txtSitioWeb\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFPC\">Fuente de Posibles clientes</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlFPC\">\n");
      out.write("                                        <option value=\"1\">None</option>\n");
      out.write("                                        <option value=\"2\">Aviso</option>\n");
      out.write("                                        <option value=\"3\">Llamada no solicitada</option>\n");
      out.write("                                        <option value=\"4\">Recomendacion de empleado</option>\n");
      out.write("                                        <option value=\"5\">Recomendacion externa</option>\n");
      out.write("                                        <option value=\"6\">Tienda en linea</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblEPC\">Estado de Posible cliente</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlEPC\">\n");
      out.write("                                        <option value=\"1\">None</option>\n");
      out.write("                                        <option value=\"2\">Intento de contacto</option>\n");
      out.write("                                        <option value=\"3\">Contactar en el futuro</option>\n");
      out.write("                                        <option value=\"4\">Contactado</option>\n");
      out.write("                                        <option value=\"5\">Posible cliente no solicitado</option>\n");
      out.write("                                        <option value=\"6\">Posible cliente perdido</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblSector\">Sector</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlSector\">\n");
      out.write("                                        <option value=\"1\">None</option>\n");
      out.write("                                        <option value=\"2\">APS (Proveerdor de servicio de aplicaciones)</option>\n");
      out.write("                                        <option value=\"3\">OEM de datos</option>\n");
      out.write("                                        <option value=\"4\">ERP (Planificacion de recursos de empresa)</option>\n");
      out.write("                                        <option value=\"5\">Gobierno/Ejercito</option>\n");
      out.write("                                        <option value=\"6\">Empresa grande</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCantidadEmpleados\">Cantidad de empleado</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"number\" placeholder=\"Ingrese la cantidad de empleados\" name=\"txtCantidadEmpleados\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblIngresosAnuales\">Ingresos anuales</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"number\" placeholder=\"Ingrese los ingresos\" name=\"txtIngresosAnuales\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCalificacion\">Calificacion</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlCalificacion\">\n");
      out.write("                                        <option value=\"1\">None</option>\n");
      out.write("                                        <option value=\"2\">Adquirido</option>\n");
      out.write("                                        <option value=\"3\">Activo</option>\n");
      out.write("                                        <option value=\"4\">Fallo de mercado</option>\n");
      out.write("                                        <option value=\"5\">Proyecto cancelado</option>\n");
      out.write("                                        <option value=\"6\">Apagar</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNPCE\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"chkNPCE\"/>\n");
      out.write("                                        No participacion correo electronico\n");
      out.write("                                    </label>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblIDSkype\">ID de Skype</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el ID de Skype\" name=\"txtIDSkype\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTwitter\">Twitter</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese el Twitter\" name=\"txtTwitter\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblCorreoSecundario\">Correo electronico secundario</label>\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"Ingrese correo secundario\" name=\"txtCorreoSecundario\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <table class=\"table table-bordered table-primary table-responsive\">                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Empresa</td>\n");
      out.write("                                            <td>Nombre</td>\n");
      out.write("                                            <td>Apellido</td>\n");
      out.write("                                            <td>Titulo</td>\n");
      out.write("                                            <td>Correo electronico</td>\n");
      out.write("                                            <td>Telefono</td>\n");
      out.write("                                            <td>Fax</td>\n");
      out.write("                                            <td>Movil</td>\n");
      out.write("                                            <td>Sitio Web</td>\n");
      out.write("                                            <td>Fuente de Posibles Clientes</td>\n");
      out.write("                                            <td>Estado de Posible Cliente</td>\n");
      out.write("                                            <td>Sector</td>\n");
      out.write("                                            <td>Cantidad de empleados</td>\n");
      out.write("                                            <td>Ingresos anuales</td>\n");
      out.write("                                            <td>Calificacion</td>\n");
      out.write("                                            <td>No participacion de correo electronico</td>\n");
      out.write("                                            <td>ID de Skype</td>\n");
      out.write("                                            <td>Twitter</td>\n");
      out.write("                                            <td>Correo electronico secundario</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {
                                                Models.clsFPC obclsFPC = item.getObclsFPC();
                                                Models.clsEPC obclsEPC = item.getObclsEPC();
                                                Models.clsSector obclsSector = item.getObclsSector();
                                                Models.clsCalificacion obclsCalificacion = item.getObclsCalificacion();
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print( item.getStEmpresa() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStNombre() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStApellido() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStTitulo() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStCorreo() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStTelefono() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStFax() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStMovil() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStSitioWeb() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( obclsFPC.getStDescripcion() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( obclsEPC.getStDescripcion() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( obclsSector.getStDescripcion() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getInCantidadEmpleados() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getDbIngresosAnuales() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( obclsCalificacion );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getChNPCE() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStIDSkype() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStTwitter() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStCorreoSecundario() );
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
