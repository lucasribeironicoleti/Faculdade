/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocliente.controller;

import br.com.projetocliente.dao.GenericDAO;
import br.com.projetocliente.dao.ClienteDAOImpl;
import br.com.projetocliente.model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarCliente", urlPatterns = {"/CadastrarCliente"})
public class CadastrarCliente extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");        
        try (PrintWriter out = response.getWriter()) {
        
        String nomeCliente = request.getParameter("nomeCliente");
        String cpfCliente = request.getParameter("cpfCliente");
        String enderecoCliente = request.getParameter("enderecoCliente");
        Double rendaCliente = Double.parseDouble(request.getParameter("rendaCliente"));
        
        String mensagem = null;
        
        Cliente cliente = new Cliente();
        
        cliente.setNomeCliente(nomeCliente);
        cliente.setCpfCliente(cpfCliente);
        cliente.setEnderecoCliente(enderecoCliente);
        cliente.setRendaCliente(rendaCliente);
       
        
        
        try {
            GenericDAO dao = new ClienteDAOImpl();
            if(dao.cadastrar(cliente)){
                mensagem = "Cliente cadastrado com sucesso";
            }else{
                mensagem = "Problemas ao cadastrar Cliente."+"Verifique os dados informados e tente novamente";
            }
            request.setAttribute("mensagem",mensagem);
            request.getRequestDispatcher("cadastrarcliente.jsp").forward(request,response);
        } catch (Exception ex) {
            System.err.println("Problemas ao cadastrar cliente erro na Servelet!Erro:"+ex.getMessage());
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
