package br.com.lucasribeironicoleti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionFactory {
    public static Connection conectar() throws Exception{
        try{
        Class.forName("org.postgresql.Driver");
        System.out.println("Conectou");
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/cliente", "postgres","12345");
        }catch(Exception e){
            throw new Exception("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
    public static void fecharConexao(Connection conexao, Statement stmt, ResultSet rs) throws Exception{
        try{
            if(conexao != null){
                conexao.close();
            }
            if(smtp != null){
                smtp.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch(Exception e){
            throw new Exception("Erro ao fechar conexão com banco de dados: " + e.getMessage());
        }
    }
}
