/* @author Andrés */

package com.mycompany.ejercicioweb1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrés
 */
public class Servlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");

        String n = request.getParameter("txt_nombres");
        String t = request.getParameter("txt_telefono");
        String e = request.getParameter("txt_email");

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>respuesta1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Nombre: " + n + "</h2>");
            out.println("<h2>Teléfono: " + t + "</h2>");
            out.println("<h2>Email: " + e + "</h2>");
            out.println("<h2>esta es un respuesta control</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta name='viewport' content='width=device-width; initial-scale=1.0' user-scalable=no/>");
            out.println("<script>$document.oncontextmenu= new Function('return false'); </script>");
            out.println("<style>@import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');"
                    + "@import url('https://fonts.googleapis.com/css2?family=Roboto&display=swap');"
                    + "@import url('https://fonts.googleapis.com/css2?family=Secular+One&display=swap'); "
                + "html{background: #e0e0e0;} h1{-webkit-user-select: none; -moz-user-select: none; -ms-user-select: none; user-select: none; color: #3D3D3D; pointer-events: none; font-size: 40px; font-family: 'Poppins', sans-serif; font-weight: 500; margin-bottom: 40px;}"
                    + ".cont{position: absolute; left: 0; width: 100%; text-align: center; top:80px;} .soft-shadow:hover {background: linear-gradient(145deg, #cacaca, #f0f0f0);}"
                    + "@media only screen and (min-device-width: 1860px){.wallpaper{width: 600px; height: 600px;} h1{font-size: 60px;} .soft-shadow{width: 360px; height: 200px;}}</style>");
            out.println("<title>Servlet</title>");
            out.println("<link rel='icon' href='../img/favicon.ico' />");
            out.println("</head>");
            out.println("<body oncontextmenu='return false' onkeydown='return false'>");
            out.println("<div class='cont'>");
            out.println("<center>");
            out.println("<h1>Servlet funcionando correctamente</h1>");
            out.println("<a style='text-decoration: none;' href='index.jsp'>");
            out.println("<button id='neomoform' class='soft-shadow' style='display: block; font-weight: bold; text-align: center; line-height: 100px; justify-content: center; cursor: pointer; border: none; width: 260px; height: 100px; border-radius: 50px; "
                    + "background: linear-gradient(145deg, #f0f0f0, #cacaca); box-shadow: 19px 19px 38px #b8b8b8, -19px -19px 38px #ffffff; margin-top: 25px;'>"
                    + "<img draggable='false' style='width: 25px; margin-right: 20px; align-item: center; text-align: center;' src='https://cdn-icons-png.flaticon.com/512/2268/2268485.png'/><span style='text-shadow: 0px 3px 3px rgba(255,255,255,0.5),0px -1px 1px rgba(0,0,0,.3);"
                    + " -webkit-background-clip: text;\n" + "-moz-background-clip: text;background-clip: text; color: transparent; font-size: 16px; text-decoration: none; font-family: 'Secular One', sans-serif; font-weight: bold;>VOLVER AL INICIO</span></button>");
            out.println("</a>");
            out.println("</center>");
            out.println("</div>");
            out.println("<img class='wallpaper' draggable='false' src='https://techfut.000webhostapp.com/5223988.png' width='400' height='400' style='pointer-events: none; "
                    + "position: absolute; bottom: 0; right:0;'>");
            out.println("");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        String n = request.getParameter("txt_nombres");
        String t = request.getParameter("txt_telefono");
        String e = request.getParameter("txt_email");

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");
            out.println("<link rel='preconnect' href='https://fonts.googleapis.com'>" +
                    "<meta charset='UTF-8'/>" +
                    "<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>" +
                    "<link href='https://fonts.googleapis.com/css2?family=Noto+Sans+Display&display=swap' rel='stylesheet'>");
            out.println("<meta name='viewport' content='width=device-width; initial-scale=1.0' user-scalable=no/>");
            out.println("<style>@import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');"
                    + "@import url('https://fonts.googleapis.com/css2?family=Roboto&display=swap');"
                    + "@import url('https://fonts.googleapis.com/css2?family=Secular+One&display=swap'); @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+Display&display=swap'); "
                    + "h1,h2,h3{font-family: 'Poppins', sans serif; color: #3d3d3d; -webkit-user-select: none; -moz-user-select: none; -ms-user-select: none; user-select: none;}body {background: #e0e0e0;}"
                    + ".container {vertical-align: middle; display: inline-block; text-align: center; width: 30rem; height: 20rem; box-shadow: 0 0 1rem 0 rgba(0, 0, 0, .2);"
                    + "border-radius: 15px; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); margin: 0 auto; z-index: 1; background: inherit; overflow: hidden;"
                    + "@media only screen and (max-device-width: 768px){.encabezado{font-size: 50px;} .titulo{margin-top: 100px;}} </style>");
            out.println("</head>");
            out.println("<body oncontextmenu='return false' onkeydown='return false'>");
            out.println("<div class='titulo' style='width: 100%; margin: 0; margin-top: 30px; display: flex; justify-content: center; align-items: center; text-align: center;'>");
            out.println("<h1 class='encabezado' style='color: #3d3d3d; font-size: 40px;'>Cuenta registrada con éxito</h1>");
            out.println("</div>");
            out.println("<div class='container' style='background: #e3e3e3;'>");
            out.println("<h2 class='info' style='font-size: 19px;'>Nombre: " + n + "</h2>");
            out.println("<h2 class='info' style='font-size: 19px;'>Teléfono: " + t + "</h2>");
            out.println("<h2 class='info' style='font-size: 19px;'>Email: " + e + "</h2>");
            out.println("</div>");
            out.println("<img class='img' draggable='false' src='https://techfut.000webhostapp.com/3dos.png' width='500' height='500' style='position: absolute; bottom: 0; right: 0; pointer-events: none;'/>");
            out.println("<style>@media only screen and (min-device-width: 1860px){ .img{width: 600px; height: 600px;} h1{font-size: 60px;} .container{width: 40rem; height: 25rem;} .info{font-size: 25px;}}</style>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
