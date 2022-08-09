<%-- 
    Document   : cadastrarproduto
    Created on : 18/02/2022, 19:49:32
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de clientes</title>
    </head>
    <body>
        <h1 align="center">Controle de Clientes</h1>
        <hr>
        <h2 align="center">${mensagem}</h2>
        
        <form name="cadastrarcliente" action="CadastrarCliente" method="POST">
            <table align="center">
                <tr>
                    <th>Cadastrar cliente</th>
                </tr>
                  <tr>
                      <td>Nome:</td>
                      <td><input type="text" name="nomeCliente"></td>
                </tr>
               
                
                 <tr>
                      <td>CPF:</td>
                      <td><input type="text" name="cpfCliente"></td>
                </tr>
                
                <tr>
                      <td>Endereço:</td>
                      <td><input type="text" name="enderecoCliente"></td>
                </tr>
                
                 <tr>
                      <td>Renda:</td>
                      <td><input type="text" name="rendaCliente"></td>
                </tr>
                 <tr>
                      <td colspan="2" align="center"><input type="submit" name="cadastrar" value="Cadastrar"></td>
                </tr>
                
                
            </table>
             <h2 align="center"><a href="index.jsp">Voltar</a></h2>
        </form>
    </body>
</html>
