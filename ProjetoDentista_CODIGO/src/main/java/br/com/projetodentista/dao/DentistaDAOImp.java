/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetodentista.dao;
import br.com.projetodentista.model.Dentista;
import br.com.projetodentista.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class DentistaDAOImp implements GenericDAO {

    private Connection conn;

    public DentistaDAOImp() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Dentista dentista = (Dentista) object;
        PreparedStatement stmt = null;

        String sql = "insert into dentista (iddentista, nome_dentista, telefone, especialidade) values (?,?,?,?);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, dentista.getnome_dentista());
            stmt.setString(2, dentista.gettelefone());
            stmt.setString(3, dentista.getespecialidade());
            stmt.setString(4, dentista.getcro());
            stmt.execute();

            return true;

        } catch (SQLException e) {
            System.out.println("Problemas ao cadatrar dentista! Erro: " + e.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar conexão! Erro: " + e.getMessage());
            }

        }
    }

    @Override
    public List<Object> listar() {
        List<Object> dentista = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select iddentista, nome_dentista, telefone, especialidade, cro from dentista";

        try {

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Dentista dentista = new Dentista();
                dentista.setiddentista(rs.getInt("iddentista"));
                dentista.setnome_dentista(rs.getString("nome_dentista"));
                dentista.settelefone(rs.getString("telefone"));
                dentista.setespecialidade(rs.getString("especialidade"));
                dentista.setcro(rs.getString("cro"));
                dentista.add(dentista);

            }

        } catch (Exception e) {
            System.out.println("Problemas ao listar dentista! Erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }

        }
        return dentista;

    }
}