/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetobicicleta.controller;

import br.com.projetobicicleta.dao.BicicletaDAOImpl;
import br.com.projetobicicleta.dao.GenericDAO;
import br.com.projetobicicleta.dao.TipoBicicletaDAOImpl;
import br.com.projetobicicleta.model.Bicicleta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Win 10
 */
@WebServlet(name = "CarregarProduto", urlPatterns = {"/CarregarProduto"})
public class CarregarProduto extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

          int idProduto = Integer.parseInt(request.getParameter("idProduto"));

            try {
                GenericDAO dao = new BicicletaDAOImpl();
                GenericDAO daot = new TipoBicicletaDAOImpl();
                
                request.setAttribute("tipobicicleta", daot.listar());
                request.setAttribute("produto", dao.carregar(idProduto));
                request.getRequestDispatcher("alterarproduto.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println("Problemas ao carregar S bicicleta! Erro: " + e.getMessage());
                e.printStackTrace();
            }
            
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
