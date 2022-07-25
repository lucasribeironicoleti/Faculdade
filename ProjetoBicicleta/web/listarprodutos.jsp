<%@page import="br.com.projetobicicleta.model.Bicicleta"%>
<%@page import="br.com.projetobicicleta.model.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
   <head>
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Painel de controle de Bebidas</title>
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
        <table align="center" border="1">
            <tr>
                <td colspan="12" align="center">Lista de Bebidas</td>
            </tr>
            <tr>
                <th align="center">ID Produto</th>
                <th align="center">ID Bebida</th>
                <th align="center">Estoque</th>
                <th align="center">Unidade</th>
                <th align="center">Valor</th>
                <th align="center">Litros(L=1.000 ml)</th>

                <th align="center">Tipo da Bebida</th>
                <th align="center" colspan="2">Editar</th>
            </tr>
            
            <%
                List<Bicicleta> bicicletas = (List<Bicicleta>) request.getAttribute("bicicletas");
                for(Bicicleta bicicleta:bicicletas){
            %>
            <tr>
                <td align="center"><%=bicicleta.getIdProduto()%></td>
                <td align="center"><%=bicicleta.getIdBicicleta()%></td> 
                <td align="center"><%=bicicleta.getFornecedor()%></td>
                <td align="center"><%=bicicleta.getUnidade()%></td>
                <td align="center"><%=bicicleta.getMarcha()%></td>
                <td align="center"><%=bicicleta.getPeso()%></td>
          
                <td align="center"><%=bicicleta.getTipoBicicleta().getNomeTipoBicicleta() %></td>
                <td align="center"><a href="ExcluirProduto?idProduto=<%=bicicleta.getIdProduto()%>">Excluir</a></td>
                <td align="center"><a href="CarregarProduto?idProduto=<%=bicicleta.getIdProduto()%>">Alterar</a></td>
            </tr>
            <%
                }
            %>
            <tr>
                    <td align="center" colspan="11"><a href="index.jsp">Voltar</a></td>
            </tr>
        </table>
    </body>
</html>
