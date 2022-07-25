<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Produtos</title>
    </head>
    <body>
        <h1 align="center">Controle de Produtos</h1>

        <hr>

        <h3 align="center">${mensagem}</h3>

        <form name="alterarproduto" action="AlterarProduto" method="POST">

            <table border="0" align="center">
                <tr>
                    <th colspan="2">Cadastrar Produtos</th>
                </tr>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="idProduto" 
                               value="${produto.idProduto}"></td>
                    
                </tr>
                <tr>
                    <td>Descrição:</td>
                    <td><input type="text" name="descProduto" 
                               value="${produto.descProduto}"></td>
                </tr>
                <tr>
                    <td>Marca:</td>
                    <td><input type="text" name="marcaProduto" 
                               value="${produto.marcaProduto}"></td>
                </tr>
                <tr>
                    <td>Modelo:</td>
                    <td><input type="text" name="modeloProduto"
                               value="${produto.modeloProduto}"></td>
                </tr>
                <tr>
                    <td>Valor:</td>
                    <td><input type="text" name="valorProduto"
                               value="${produto.valorProduto}"></td>
                </tr>
                
                <tr>
                    <td>Ano Fabricação:</td>
                    <td><input type="text" name="anoCarro" value="${produto.anoCarro}"></td>
                </tr>
                <tr>
                    <td>Modelo Fabricação:</td>
                    <td><input type="text" name="modeloCarro" value="${produto.modeloCarro}"></td>
                </tr>
                <tr>
                    <td>Nº Portas:</td>
                    <td><input type="text" name="nrportasCarro" value="${produto.nrportasCarro}"></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"><input type="submit" 
                        name="alterar" value="Alterar">
                </tr>
                
                
            </table>
            <h3 align="center"><a href="ListarProduto">Voltar</a></h3>
        </form>
    </body>
</html>
