<%-- 
    Document   : cadastrardentista
    Created on : 01/04/2022, 21:14:24
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Controle de Dentistas</h1>
        <hr>
        <h2 align="center">${mensagem}</h2>
        
        <form name="cadastrardentista" action="cadastrardemtista" method="POST">
            <table align="center">
                <tr>
                    <th>Cadastrar Dentistas</th>
                </tr>
                  <tr>
                      <td>Nome</td>
                      <td><input type="text" name="nome_dentista"></td>
                </tr>
                <tr>
                      <td>Telefone:</td>
                      <td><input type="number" name="telefone"></td>
                </tr>
                <tr>
                      <td>Especialidade:</td>
                      <td><input type="text" name="especialidade"></td>
                </tr>
                 <tr>
                      <td>CRO:</td>
                      <td><input type="number" name="cro"></td>
                </tr>
                 <tr>
                      <td colspan="2" align="center"><input type="submit" name="cadastrar" value="Cadastrar"></td>
                </tr>
                
                
            </table>
    </body>
</html>
