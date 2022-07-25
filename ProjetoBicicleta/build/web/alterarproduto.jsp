<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Bebidas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </head>
    <body>
                <nav class="navbar bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="crianca.png" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Lucas Ribeiro Nicoleti
    </a>
  </div>
</nav>
        <br>
        <h1 align="center">Painel de controle de Bebidas</h1>

        <hr>

        <h3 align="center">${mensagem}</h3>

        <form name="alterarproduto" action="AlterarProduto" method="POST">

            <table border="0" align="center">
                <tr>
                    <th colspan="2">Alterar Bebida</th>
                </tr>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="idProduto" readonly
                               value="${produto.idProduto}"></td>
                    
                </tr>
                <tr>
                    <td>Estoque:</td>
                    <td><input type="text" name="fornecedor" 
                               value="${produto.fornecedor}"></td>
                </tr>
                <tr>
                    <td>Unidade:</td>
                    <td><input type="text" name="unidade" 
                               value="${produto.unidade}"></td>
                </tr>
                <tr>
                    <td>Valor:</td>
                    <td><input type="text" name="marcha"
                               value="${produto.marcha}"></td>
                </tr>
                <tr>
                    <td>Litros(L=1.000 ml):</td>
                    <td><input type="text" name="peso"
                               value="${produto.peso}"></td>
                </tr>
                <tr>
                    <td>Tipo de Bebida:</td>
                    <td><select name="idtipobicicleta">
                            <option selected value="${produto.tipoBicicleta.idTipoBicicleta}">${produto.tipoBicicleta.nomeTipoBicicleta}</opttion>
                            <c:forEach var="tipobicicleta" items="${tipobicicleta}">
                                <option value="${tipobicicleta.idTipoBicicleta}">${tipobicicleta.nomeTipoBicicleta}</option>
                            </c:forEach>
                        </select>
                    </td>
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
