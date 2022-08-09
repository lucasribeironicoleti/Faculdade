/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetodentista.controller;

import br.com.projetodentista.dao.GenericDAO;
import br.com.projetodentista.dao.DentistaDAOImp;
import br.com.projetodentista.model.Dentista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cadastrardentista", urlPatterns = {"/cadastrardentista"})
public class CadastrarDentista extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nome_dentista = request.getParameter("nome_dentista");
        String telefone = request.getParameter("telefone");
        String especialidade = request.getParameter("especialidade");
        String cro = request.getParameter("cro");

        String mensagem = null;

        Dentista dentista = new Dentista();
        dentista.setnome_dentista(nome_dentista);
        dentista.settelefone(telefone);
        dentista.setespecialidade(especialidade);
        dentista.setcro(cro);

        try {
            GenericDAO dao = new DentistaDAOImp();
            if (dao.cadastrar(dentista)) {
                mensagem = "Dentista cadastrado com sucesso";
            } else {
                mensagem = "Problemas ao cadstrar Dentista. Verifique os dados informados e tente novamente";
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("cadastrardentista.jsp").forward(request, response);
        } catch (Exception ex) {
            System.err.println("Problemas ao cadastrar dentista erro na Servelet!Erro:" + ex.getMessage());
            ex.printStackTrace();
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
