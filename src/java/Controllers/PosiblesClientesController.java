/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MOTTA
 */
@WebServlet(name = "PosiblesClientesController", urlPatterns = {"/PosiblesClientesController"})
public class PosiblesClientesController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Se valida que se haya presionado el boton guardar
        if (request.getParameter("btnGuardar") != null) {
            btnGuardar(request, response);
        } else if (request.getParameter("btnModificar") != null) {
        } else if (request.getParameter("btnCancelar") != null) {
        } else if (request.getParameter("codigoSeleccionado") != null) {
            if (request.getParameter("stOpcion").equals("M")) {
                cargarModificar(request, response);
            } else if (request.getParameter("stOpcion").equals("E")) {
            }
        }
    }

    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        try {
            //Modelo sobre el que estamos trabajando
            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();
            //Lista de objetos donde esta la informacion guardada
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            HttpSession session = request.getSession(true);

            if (session.getAttribute("sesion_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("sesion_lstclsPosiblesClientes");
            }

            for (Models.clsPosiblesClientes item : lstclsPosiblesClientes) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsPosiblesClientes = item;
                }
            }
            
            request.setAttribute("obclsPosiblesClientes", obclsPosiblesClientes);
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
            
        } catch (Exception ex) {
            request.setAttribute("stTipo", "error");
            request.setAttribute("stMensaje", ex.getMessage());
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);
        }

    }

    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {
            //Definicion de modelos
            Models.clsPosiblesClientes obclsPosiblesClientes = new Models.clsPosiblesClientes();
            Models.clsFPC obclsFPC = new Models.clsFPC();
            Models.clsEPC obclsEPC = new Models.clsEPC();
            Models.clsSector obclsSector = new Models.clsSector();
            Models.clsCalificacion obclsCalificacion = new Models.clsCalificacion();

            if (request.getParameter("txtEmpresa") != null) {
                obclsPosiblesClientes.setStEmpresa(request.getParameter("txtEmpresa"));
            }

            if (request.getParameter("txtNombre") != null) {
                obclsPosiblesClientes.setStNombre(request.getParameter("txtNombre"));
            }
            if (request.getParameter("txtApellido") != null) {
                obclsPosiblesClientes.setStApellido(request.getParameter("txtApellido"));
            }
            if (request.getParameter("txtTitulo") != null) {
                obclsPosiblesClientes.setStTitulo(request.getParameter("txtTitulo"));
            }
            if (request.getParameter("txtCorreo") != null) {
                obclsPosiblesClientes.setStCorreo(request.getParameter("txtCorreo"));
            }
            if (request.getParameter("txtTelefono") != null) {
                obclsPosiblesClientes.setStTelefono(request.getParameter("txtTelefono"));
            }
            if (request.getParameter("txtFax") != null) {
                obclsPosiblesClientes.setStFax(request.getParameter("txtFax"));
            }
            if (request.getParameter("txtMovil") != null) {
                obclsPosiblesClientes.setStMovil(request.getParameter("txtMovil"));
            }
            if (request.getParameter("txtSitioWeb") != null) {
                obclsPosiblesClientes.setStSitioWeb(request.getParameter("txtSitioWeb"));
            }
            if (request.getParameter("ddlFPC") != null) {
                //MODELO HIJO
                obclsFPC.setInCodigo(Integer.parseInt(request.getParameter("ddlFPC")));

                String stDescripcion = "";

                if (request.getParameter("ddlFPC").equals("1")) {
                    stDescripcion = "None";
                } else if (request.getParameter("ddlFPC").equals("2")) {
                    stDescripcion = "Aviso";
                } else if (request.getParameter("ddlFPC").equals("3")) {
                    stDescripcion = "Llamada no solicitada";
                } else if (request.getParameter("ddlFPC").equals("4")) {
                    stDescripcion = "Recomendacion de empleado";
                } else if (request.getParameter("ddlFPC").equals("5")) {
                    stDescripcion = "Recomendacion externa";
                } else if (request.getParameter("ddlFPC").equals("6")) {
                    stDescripcion = "Tienda en linea";
                }

                obclsFPC.setStDescripcion(stDescripcion);

                //ASIGNACION AL MODELO PADRE
                obclsPosiblesClientes.setObclsFPC(obclsFPC);
            }
            if (request.getParameter("ddlEPC") != null) {
                //MODELO HIJO
                obclsEPC.setInCodigo(Integer.parseInt(request.getParameter("ddlEPC")));

                String stDescripcion = "";

                if (request.getParameter("ddlEPC").equals("1")) {
                    stDescripcion = "None";
                } else if (request.getParameter("ddlEPC").equals("2")) {
                    stDescripcion = "Intento de contacto";
                } else if (request.getParameter("ddlEPC").equals("3")) {
                    stDescripcion = "Contactar en el futuro";
                } else if (request.getParameter("ddlEPC").equals("4")) {
                    stDescripcion = "Contactado";
                } else if (request.getParameter("ddlEPC").equals("5")) {
                    stDescripcion = "Posible cliente no solicitado";
                } else if (request.getParameter("ddlEPC").equals("6")) {
                    stDescripcion = "Posible cliente perdido";
                }

                obclsEPC.setStDescripcion(stDescripcion);

                //ASIGNACION AL MODELO PADRE
                obclsPosiblesClientes.setObclsEPC(obclsEPC);
            }
            if (request.getParameter("ddlSector") != null) {
                //MODELO HIJO
                obclsSector.setInCodigo(Integer.parseInt(request.getParameter("ddlSector")));

                String stDescripcion = "";

                if (request.getParameter("ddlSector").equals("1")) {
                    stDescripcion = "None";
                } else if (request.getParameter("ddlSector").equals("2")) {
                    stDescripcion = "APS (Proveerdor de servicio de aplicaciones)";
                } else if (request.getParameter("ddlSector").equals("3")) {
                    stDescripcion = "OEM de datos";
                } else if (request.getParameter("ddlSector").equals("4")) {
                    stDescripcion = "ERP (Planificacion de recursos de empresa)";
                } else if (request.getParameter("ddlSector").equals("5")) {
                    stDescripcion = "Gobierno/Ejercito";
                } else if (request.getParameter("ddlSector").equals("6")) {
                    stDescripcion = "Empresa grande";
                }

                obclsSector.setStDescripcion(stDescripcion);

                //ASIGNACION AL MODELO PADRE
                obclsPosiblesClientes.setObclsSector(obclsSector);
            }
            if (request.getParameter("txtCantidadEmpleados") != null) {
                obclsPosiblesClientes.setInCantidadEmpleados(Integer.parseInt(request.getParameter("txtCantidadEmpleados")));
            }
            if (request.getParameter("txtIngresosAnuales") != null) {
                obclsPosiblesClientes.setDbIngresosAnuales(Double.parseDouble(request.getParameter("txtIngresosAnuales")));
            }
            if (request.getParameter("ddlCalificacion") != null) {
                //MODELO HIJO
                obclsCalificacion.setInCodigo(Integer.parseInt(request.getParameter("ddlCalificacion")));

                String stDescripcion = "";

                if (request.getParameter("ddlCalificacion").equals("1")) {
                    stDescripcion = "None";
                } else if (request.getParameter("ddlCalificacion").equals("2")) {
                    stDescripcion = "Adquirido";
                } else if (request.getParameter("ddlCalificacion").equals("3")) {
                    stDescripcion = "Activo";
                } else if (request.getParameter("ddlCalificacion").equals("4")) {
                    stDescripcion = "Fallo de mercado";
                } else if (request.getParameter("ddlCalificacion").equals("5")) {
                    stDescripcion = "Proyecto cancelado";
                } else if (request.getParameter("ddlCalificacion").equals("6")) {
                    stDescripcion = "Apagar";
                }

                obclsCalificacion.setStDescripcion(stDescripcion);

                //ASIGNACION AL MODELO PADRE
                obclsPosiblesClientes.setObclsCalificacion(obclsCalificacion);
            }
            if (request.getParameter("chkNPCE") != null) {

                char chSeleccion = request.getParameter("chkNPCE").equals("on")
                        ? 'S' : 'N';
                obclsPosiblesClientes.setChNPCE(chSeleccion);
            }else
                obclsPosiblesClientes.setChNPCE('N');
            
            if (request.getParameter("txtIDSkype") != null) {
                obclsPosiblesClientes.setStIDSkype(request.getParameter("txtIDSkype"));
            }
            if (request.getParameter("txtTwitter") != null) {
                obclsPosiblesClientes.setStTwitter(request.getParameter("txtTwitter"));
            }
            if (request.getParameter("txtCorreoSecundario") != null) {
                obclsPosiblesClientes.setStCorreoSecundario(request.getParameter("txtCorreoSecundario"));
            }

            HttpSession session = request.getSession(true);

            //Lista de objetos
            List<Models.clsPosiblesClientes> lstclsPosiblesClientes = new ArrayList<Models.clsPosiblesClientes>();

            //Validamos la previa existencia de variable session
            if (session.getAttribute("sesion_lstclsPosiblesClientes") != null) {
                lstclsPosiblesClientes = (List<Models.clsPosiblesClientes>) session.getAttribute("sesion_lstclsPosiblesClientes");
            }
            //Para el calculo automatico del codigo que identifica ese registro
            int inCodigo = lstclsPosiblesClientes.size() + 1;
            obclsPosiblesClientes.setInCodigo(inCodigo);

            //Agregamos el objeto a la lista
            lstclsPosiblesClientes.add(obclsPosiblesClientes);
            //Creamos la variable session
            session.setAttribute("sesion_lstclsPosiblesClientes", lstclsPosiblesClientes);

            //Definir parametros desde el controlador
            request.setAttribute("stMensaje", "Se realizo el proceso con exito");
            request.setAttribute("stTipo", "success");

            //Redirecciono y envio los valores
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        } catch (Exception ex) {
            //Definir parametros desde el controlador
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //Redirecciono y envio los valores
            request.getRequestDispatcher("PosiblesClientes.jsp").forward(request, response);

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
