<%-- 
    Document   : index
    Created on : 22 sept 2022, 13:14:08
    Author     : Andrés
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="icon" href="img/favicon.ico";>
        <title>Principal</title>
    </head>
    <body>
        <div id="main">
            <header id="headerP">
                <a style="text-decoration: none;" href="./"><h1>Página de Andrés</h1></a>
            </header>
            <div class="card-container">
                <h3><center>FORM</center></h3>        
                <form action="Control" method="get" id="formul">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Nombres:</label>
                        <input type="text" class="form-control" name="txt_nombres" required/>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Apellidos:</label>
                        <input class="form-control" type="text" name="txt_apellidos" required/>
                    </div>
                    <div class="boton">
                        <input class="btn btn-primary" id="btnEnvio" type="submit" name="btn_registrar" value="Registrar"/>
                    </div>
                </form> 
                <hr>
                <center>
                    <a href="Control">verificar servlet objeto response</a>
                </center>
            </div>
        
            <div class="footer">
                <span class="spanf">Andrés Felipe Vega — 20201578113</span>
            </div>
        </div>
    </body>
</html>
