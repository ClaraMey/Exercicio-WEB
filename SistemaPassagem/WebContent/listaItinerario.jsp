<%@page import="model.Itinerario"%>
<%@page import="controller.DAOItinerario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista de Itinerários</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estiloListaItinerario.css">
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
                </li>
                </li>
              </ul>
            </div>
    </header>
    <section id="meio">
        <table class="table table-hover">
            <thead>
                <h3>RELAÇÃO DE ITINERÁRIOS</h3>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Data de Embarque</th>
                <th scope="col">Hora do Embarque</th>
                <th scope="col">Origem</th>
                <th scope="col">Destino</th>
                <th scope="col">Valor</th>
              </tr>
            </thead>
            <tbody>
            	<%
              	for(Itinerario iti : new DAOItinerario().listarItinerario()){%>
              		<tr>
              			<td><%= iti.getId() %></td>
              			<td><%= iti.getData_embarq() %></td>
              			<td><%= iti.getHora_embarq() %></td>
              			<td><%= iti.getOrigem() %></td>
              			<td><%= iti.getDestino() %></td>
              			<td><%= iti.getValor() %></td>
              			<td><%= iti.getOnibus().getModelo() %></td>
              			<td><%= (iti.getOnibus().getModelo() + " - " + iti.getOnibus().getPlaca()) %></td>
              			
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