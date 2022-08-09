<%-- 
    Document   : listadentistas
    Created on : 01/04/2022, 21:14:54
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
        <h1 align="center"> Listar Dentistas </h1>
        <hr>

        <table align="center" border="1" bgcolor="lightgray">
            <tr>
                <td colspan="7" align="center" bgcolor=""> Lista de Clientes</td>
            </tr>
            <tr>
                <th align="center" bgcolor="lightblue"> ID:</th>
                <th align="center" bgcolor="lightblue"> Nome:</th>
                <th align="center" bgcolor="lightblue"> Telefone:</th>
                <th align="center" bgcolor="lightblue"> Especialidade:</th>
                <th align="center" bgcolor="lightblue"> CRO:</th>

            </tr>

            <%
                List<Dentista> produtos = (List<Dentista>) request.getAttribute("dentistas");
                for (Dentista dentista : dentistas) {
            %>
            <tr>

                <td align="center"><%=dentista.getiddentista()%></td>
                <td align="center"><%=dentista.getnome_dentista()%></td>
                <td align="center"><%=dentista.gettelefone()%></td>
                <td align="center"><%=dentista.getespecialidade()%></td>
                <td align="center"><%=dentista.getValorpeso()%></td>

            </tr>
            <%
                }
            %>
        </table>

        <h2 align="center"><a href="index.jsp">Voltar</a></h2>
    </body>
</html>
