package br.com.projetoproduto.dao;

import br.com.projetoproduto.model.Carro;
import br.com.projetoproduto.model.Produto;
import br.com.projetoproduto.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAOImpl implements GenericDAO {

    private Connection conn;

    public CarroDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {

        Carro carro = (Carro) object;
        PreparedStatement stmt = null;

        String sql = "insert into carro(anocarro, modelocarro, nrportascarro, idproduto, idtipocarro) "
                + "values (?, ?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, carro.getAnoCarro());
            stmt.setInt(2, carro.getModeloCarro());
            stmt.setInt(3, carro.getNrportasCarro());
            stmt.setInt(4, new ProdutoDAOImpl().cadastrar(carro));
            stmt.setInt(5, carro.getTipoCarro().getIdTipoCarro());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar carro! Erro: "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {

        List<Object> carros = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select p.*, c.* from produto p, carro c "
                + "where p.idproduto = c.idproduto;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Carro carro = new Carro();
                carro.setIdProduto(rs.getInt("idproduto"));
                carro.setDescProduto(rs.getString("descproduto"));
                carro.setMarcaProduto(rs.getString("marcaproduto"));
                carro.setModeloProduto(rs.getString("modeloproduto"));
                carro.setValorProduto(rs.getDouble("valorproduto"));
                carro.setIdCarro(rs.getInt("idcarro"));
                carro.setAnoCarro(rs.getInt("anocarro"));
                carro.setModeloCarro(rs.getInt("modelocarro"));
                carro.setNrportasCarro(rs.getInt("nrportascarro"));

                carros.add(carro);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar produtos! Erro:" + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return carros;
    }

    @Override
    public Boolean excluir(int idOject) {
        PreparedStatement stmt = null;
        String sql = "delete from produto where idproduto = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idOject);
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao excluir o produto! Erro"
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Carro carro = null;

        String sql = "select * from carro c inner join produto p on c.idproduto = p.idproduto where idcarro = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            while (rs.next()) {
                carro = new Carro();
                carro.setIdCarro(rs.getInt("idcarro"));
                carro.setAnoCarro(rs.getInt("anocarro"));
                carro.setModeloCarro(rs.getInt("modelocarro"));
                carro.setNrportasCarro(rs.getInt("nrportascarro"));
                carro.setIdProduto(rs.getInt("idproduto"));
                carro.setDescProduto(rs.getString("descproduto"));
                carro.setMarcaProduto(rs.getString("marcaproduto"));
                carro.setModeloProduto(rs.getString("modeloproduto"));
                carro.setValorProduto(rs.getDouble("valorproduto"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar produto! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return carro;
    }

    @Override
    public Boolean alterar(Object object) {
        Carro carro = (Carro) object;
        PreparedStatement stmt = null;
        System.out.println("Teste de Insert:" + carro.getAnoCarro());
        String sql = "update carro set anocarro = ?, modelocarro = ?, nrportascarro = ?, idproduto = ? where idcarro = ?";
                
        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, carro.getAnoCarro());
            System.out.println("TesteEntrada");
            stmt.setInt(2, carro.getModeloCarro());
            System.out.println("TesteEntrada");
            stmt.setInt(3, carro.getNrportasCarro());
            System.out.println("TesteEntrada");
            stmt.setInt(4, carro.getIdProduto());
            System.out.println("TesteEntrada");
            stmt.setInt(5, carro.getIdProduto());
            System.out.println("TesteEntrada");
            if (new ProdutoDAOImpl().alterar(carro)) {
                stmt.executeUpdate();
                System.out.println("Teste");
                return true;
            } else {
                System.out.println("TesteErrado");
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao alterar carro! Erro: "
                    + ex.getMessage() + carro.getIdCarro());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

}
