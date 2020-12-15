<%@page import="model.Onibus"%>
<%@page import="controller.DAOOnibus" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Ônibus</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estiloListaOnibus.css">
</head>
<body>
	 <header>
        <section id="nav"> 
            <div id="imagem">
                <img src="logo-projeto.png" alt="" id="logo">
            </div>
            <div id="tit">
                <img src="titulo.png" alt="" id="logo-tit">
            </div>
            <div id="login">
              <ul class="nav justify-content-end">
                <li class="nav-item">
                  <a class="nav-link active" href="home.html">HOME</a>
              </ul>
            </div>
    </header>
    <section id="meio">
        <table class="table table-hover">
            <thead>
                <h3>RELAÇÃO DE ÔNIBUS</h3>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Placa</th>
                <th scope="col">Modelo</th>
                <th scope="col">Quantidade de Poltronas</th>
              </tr>
            </thead>
            <tbody>
              <%
              	for(Onibus on : DAOOnibus.listarOnibus()){%>
              		<tr>
              			<td><%= on.getId_onibus() %></td>
              			<td><%= on.getPlaca() %></td>
              			<td><%= on.getModelo() %></td>
              			<td><%= on.getQtd_polt() %></td>
              			<td><a href="#">Editar</a></td>
              			<td><a href="#">Excluir</a></td>
              		</tr>
              <%}%> 
            </tbody>
          </table>
    </section>
    <footer id="foot">
        <div id="rodape">
            <br/>
            <p><i>Viação Boa Viagem ® <br/></i>
                  Sede: Rodoviária de Paulo Afonso - BA
            </p>
          </div>
    </footer>
</body>
</html>