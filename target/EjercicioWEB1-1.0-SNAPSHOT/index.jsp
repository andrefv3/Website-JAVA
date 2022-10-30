<%-- 
    Document   : index
    Created on : 22 sept 2022, 13:14:08
    Author     : Andrés
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content= "width=device-width, user-scalable=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="icon" href="img/favicon.ico";>
        <title>Principal</title>
    </head>
    <body id="page">
        <div id="main" style="height: 100%;">
            <header id="headerP">
                <a style="text-decoration: none;" href="./"><h1>Página de Andrés</h1></a>
            </header>
            <div class="card-container">
                <h3><center>FORM</center></h3>        
                <form action="Servlet" method="post" id="formul" class="needs-validation">
                    <div class="form-group">
                        <label for="formGroupExampleInput">Nombres:</label>
                        <input type="text" class="form-control" minlength="3" maxlength="18" name="txt_nombre" required/>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputText">Telefono:</label>
                        <input class="form-control" type="tel" name="txt_telefono" 
                            onkeypress="return valideKey(event);" minlength="7" maxlength="10" required/>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Correo electrónico:</label>
                        <input class="form-control" id="foo" type="email" name="txt_email" required/>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Contraseña:</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" name="txt_pass" required/>
                    </div>
                    <div class="boton">
                        <input class="btn btn-primary" id="btnEnvio" type="submit" name="btn_registrar" value="Registrar"/>
                    </div>
                </form> 
                <hr>
                <center>
                    <a href="Servlet">Verificar servlet objeto response</a>
                </center>
            </div> 
            <div class="separador"></div>
            <footer class="footer">
                <span class="spanf">Andrés Felipe Vega — 20201578113</span>
            </footer>
        </div>
        <script>
            //=== VALIDACIONES ===
            
            function valideKey(evt){
		// code is the decimal ASCII representation of the pressed key.
		var code = (evt.which) ? evt.which : evt.keyCode;
		
		if(code==8) { // backspace.
                    return true;
		} else if(code>=48 && code<=57) { // is a number.
		    return true;
		} else{ // other keys.
                    return false;
		}
            }

            $(function(){
                $(document).on('keyup','#foo',function(){
                    var val = $(this).val().trim(),
                    reg = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
                    if( reg.test(val) === false ){
                        return false;
                    }else{
                        return true;
                    }
                });
            });
        </script>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    </body>
</html>
