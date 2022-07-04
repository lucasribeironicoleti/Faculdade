<%-- 
    Document   : cadastrarproduto
    Created on : 18/02/2022, 19:38:03
    Author     : Breno  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Produtos</title>
    </head>
    <body>
        <h1 align="center">Cadastrar Produto</h1>
        <hr>
        <h3 align="center">${mensagem}</h3>
        <form name="cadatrarproduto" action="CadastrarProduto" method="POST">
            <table border="0">
                <tr>
                    <th colspan="2" Cadastrar Produtos></th>
                </tr>
                <h3>Cadastrar Produtos</h3>
                <tr>
                    <td>Descrição:</td>
                    <td><input type="text" name="descProduto"></td>
                </tr>
                <tr>
                    <td>Marca:</td>
                    <td><input type="text" name="marcaProduto"></td>
                </tr>
                <tr>
                    <td>Modelo:</td>
                    <td><input type="text" name="modeloProduto"></td>
                </tr>
                <tr>
                    <td>Valor:</td>
                    <td><input type="text" name="valorProduto"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" name="cadastrar" value="Cadastrar"></td>
                </tr>
            </table>
            <h3><a href="index.jps">Voltar</a></h3>
        </form>
    </body>
</html>
