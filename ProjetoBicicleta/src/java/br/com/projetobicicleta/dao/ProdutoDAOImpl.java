/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetobicicleta.dao;

import br.com.projetobicicleta.model.Produto;
import br.com.projetobicicleta.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDAOImpl implements GenericDAO{
    
    private Connection conn;

    public ProdutoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Integer cadastrar(Produto produto) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idProduto = null;

        String sql = "insert into produto(fornecedor, unidade) "
                + "values (?, ?) returning idproduto;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getFornecedor());
            stmt.setString(2, produto.getUnidade());
            rs = stmt.executeQuery();
            if (rs.next()) {
                idProduto = rs.getInt("idproduto");
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Produto! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idProduto;
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Boolean alterar(Produto produto) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idProduto = null;

        String sql = "update produto set fornecedor = ?, unidade = ? where idproduto = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getFornecedor());
            stmt.setString(2, produto.getUnidade());
           
            stmt.setInt(3, produto.getIdProduto());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problema ao editar o produto! Erro: " + ex.getMessage());
            ex.getStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

