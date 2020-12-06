/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            
            if(request.getParameter("txtEmpresa") != null){
                obclsPosiblesClientes.setStEmpresa(request.getParameter("txtEmpresa"));
            }
            
            if(request.getParameter("txtNombre") != null){
                obclsPosiblesClientes.setStNombre(request.getParameter("txtNombre"));
            }
            if(request.getParameter("txtApellido") != null){
                obclsPosiblesClientes.setStApellido(request.getParameter("txtApellido"));
            }
            if(request.getParameter("txtTitulo") != null){
                obclsPosiblesClientes.setStTitulo(request.getParameter("txtTitulo"));
            }
            if(request.getParameter("txtCorreo") != null){
                obclsPosiblesClientes.setStCorreo(request.getParameter("txtCorreo"));
            }
            if(request.getParameter("txtTelefono") != null){
                obclsPosiblesClientes.setStTelefono(request.getParameter("txtTelefono"));
            }
            if(request.getParameter("txtFax") != null){
                obclsPosiblesClientes.setStFax(request.getParameter("txtFax"));
            }
            if(request.getParameter("txtMovil") != null){
                obclsPosiblesClientes.setStMovil(request.getParameter("txtMovil"));
            }
            if(request.getParameter("txtSitioWeb") != null){
                obclsPosiblesClientes.setStSitioWeb(request.getParameter("txtSitioWeb"));
            }
            if(request.getParameter("ddlFPC") != null){
                //MODELO HIJO
                obclsFPC.setInCodigo(Integer.parseInt(request.getParameter("ddlFPC")));
                
                String stDescripcion = "";
                
                if(request.getParameter("ddlFPC").equals("1")){
                    stDescripcion = "None";
                }else if(request.getParameter("ddlFPC").equals("2")){
                    stDescripcion = "Aviso";
                }else if(request.getParameter("ddlFPC").equals("3")){
                    stDescripcion = "Llamada no solicitada";
                }else if(request.getParameter("ddlFPC").equals("4")){
                    stDescripcion = "Recomendacion de empleado";
                }else if(request.getParameter("ddlFPC").equals("5")){
                    stDescripcion = "Recomendacion externa";
                }else if(request.getParameter("ddlFPC").equals("6")){
                    stDescripcion = "Tienda en linea";
                }
                
                obclsFPC.setStDescripcion(stDescripcion);
                
                //ASIGNACION AL MODELO PADRE
                obclsPosiblesClientes.setObclsFPC(obclsFPC);
            }
            
        } catch (Exception ex) {

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
