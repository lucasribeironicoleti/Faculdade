package br.com.projetoproduto.controller;

import br.com.projetoproduto.dao.GenericDAO;
import br.com.projetoproduto.dao.ProdutoDAOImpl;
import br.com.projetoproduto.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarProduto", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String descProduto = request.getParameter("descProduto");
            String marcaProduto = request.getParameter("marcaProduto");
            String modeloProduto = request.getParameter("modeloProduto");
            Double valorProduto = Double.parseDouble(request.getParameter("valorProduto"));

            String mensagem = null;

            Produto produto = new Produto();
            produto.setDescProduto(descProduto);
            produto.setMarcaProduto(marcaProduto);
            produto.setModeloProduto(modeloProduto);
            produto.setValorProduto(valorProduto);

            try {
                GenericDAO dao = new ProdutoDAOImpl();
                if (dao.cadastrar(produto)) {
                    mensagem = "Produto Cadastrado com Sucesso";
                } else {
                    mensagem = "Problema ao cadastrar Produto. " + "Verifique os dados informados e tente novamente";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("cadastrarproduto.jsp").forward(request, response);
            } catch (Exception ex) {
                System.out.println("PRoblemas na Servlet ao cadastrar produto! Erro: " + ex.getMessage());
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
