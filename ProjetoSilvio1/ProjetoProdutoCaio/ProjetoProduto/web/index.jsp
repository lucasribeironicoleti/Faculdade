<%-- 
    Document   : index
    Created on : 3 de jun. de 2022, 19:46:14
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div align="center">
           <hr>
            <h1>Acesso ao Sistema de Controle</h1>
            <hr>
            <b><p>Insira os dados para fazer login!</p></b>
            <forms>
                <label>Login:</label>
                <input type="email" name="loginusuario"><br>
                <label>Senha:</label>
                <input type="password" name="senhausuario"><br>
                <br><!-- comment -->
                <button action="LogarUsuario" method="POST">Entrar</button>
            </forms>
            <hr>
        </div>
    </body>
</html>
