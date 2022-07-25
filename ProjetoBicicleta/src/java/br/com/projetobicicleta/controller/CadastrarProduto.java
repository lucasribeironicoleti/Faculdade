/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetobicicleta.controller;

import br.com.projetobicicleta.dao.BicicletaDAOImpl;
import br.com.projetobicicleta.dao.GenericDAO;
import br.com.projetobicicleta.model.Bicicleta;
import br.com.projetobicicleta.model.TipoProduto;
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
@WebServlet(name = "CadastrarProduto", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProduto extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String fornecedor = request.getParameter("fornecedor");
            String unidade = request.getParameter("unidade");
            Integer marcha = Integer.parseInt(request.getParameter("marcha"));
            Double peso = Double.parseDouble(request.getParameter("peso"));
           
            Integer idTipoBicicleta = Integer.parseInt(request.getParameter("idtipobicicleta"));
            
            String mensagem = null;

            Bicicleta bicicleta = new Bicicleta();
            bicicleta.setFornecedor(fornecedor);
            bicicleta.setUnidade(unidade);
            bicicleta.setMarcha(marcha);
            bicicleta.setPeso(peso);
        
            bicicleta.setTipoBicicleta(new TipoProduto(idTipoBicicleta));

            try {
                GenericDAO dao = new BicicletaDAOImpl();
                if (dao.cadastrar(bicicleta)) {
                    mensagem = "Bicicleta cadastrada com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Bicicleta. "
                            + "Verifique os dados informados e tente novamente!";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("CarregarTipoBicicleta").forward(request, response);
            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastrar Bicicleta! Erro: "
                        + ex.getMessage());
                ex.printStackTrace();
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
