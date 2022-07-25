<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Painel de controle de Bebidas</title>
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
        <h1 align="center">Controle de Bebidas</h1>

        <hr>

        <h3 align="center">${mensagem}</h3>

        <form name="cadastrarproduto" action="CadastrarProduto" method="POST">

            <table border="0" align="center">
                <tr>
                    <th colspan="2">Cadastrar Bebidas</th>
                </tr>
                <tr>
                    <td>Estoque: </td>
                    <td><input class="form-control" id="exampleFormControlInput1" type="text" name="fornecedor"></td>
                </tr>
                <tr>
                    <td>Unidade: </td>
                    <td><input class="form-control" id="exampleFormControlInput1" type="text" name="unidade"></td>
                </tr>
                <tr>
                    <td>Valor: </td>
                    <td><input class="form-control" id="exampleFormControlInput1" type="text" name="marcha"></td>
                </tr>
                <tr>
                    <td>Litros(L=1.000 ml): </td>
                    <td><input class="form-control" id="exampleFormControlInput1" type="text" name="peso"></td>
                </tr>
         
                <tr>
                    <td>Tipo:</td>
                    <td><select name="idtipobicicleta">
                            <c:forEach var="tipobicicleta" items="${tipobicicleta}">
                                <option value="${tipobicicleta.idTipoBicicleta}">${tipobicicleta.nomeTipoBicicleta}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" 
                                                          name="cadastrar" value="Cadastrar">
                </tr>
            </table>
            <h3 align="center"><a href="index.jsp">Voltar</a></h3>
        </form>
    </body>
</html>
