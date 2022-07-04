package br.com.projetoproduto.dao;

import br.com.projetoproduto.util.ConnectionFactory;
import br.com.projetoproduto.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements GenericDAO {

    private Connection conn;

    public ProdutoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Produto produto = (Produto) object;
        PreparedStatement stmt = null;

        String sql = "insert into produto(descproduto, marcaproduto, modeloproduto, valorproduto) values (?, ?, ?, ?);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getDescProduto());
            stmt.setString(2, produto.getMarcaProduto());
            stmt.setString(3, produto.getModeloProduto());
            stmt.setDouble(4, produto.getValorProduto());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar produto! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexÃ£o! Erro" + ex.getMessage());
                ex.printStackTrace();
            }
        }

    }

    @Override
    public List<Object> listar() {
        List<Object> produtos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select * from produto;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idproduto"));
                produto.setDescProduto(rs.getString("descproduto"));
                produto.setMarcaProduto(rs.getString("marcaproduto"));
                produto.setModeloProduto(rs.getString("modeloproduto"));
                produto.setValorProduto(rs.getDouble("valorproduto"));
            }
            
        }catch (SQLException e){
            System.out.println("Problemas ao listar produto! Erro: " + e.getMessage());
            e.printStackTrace();
        }
        return produtos;
    }

    @Override
    public Boolean excluir(int indObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int indObjct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
