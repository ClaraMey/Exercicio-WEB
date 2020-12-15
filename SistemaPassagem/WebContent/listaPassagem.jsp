<%@page import="model.Passagem"%>
<%@page import="model.Passageiro"%>
<%@page import="model.Itinerario"%>
<%@page import="controller.DAOPassagem" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Passagens</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estiloListaPassagem.css">   
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
                <h3>RELAÇÃO DE PASSAGENS</h3>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Nome do Passageiro</th>
                <th scope="col">CPF</th>
                <th scope="col">Data de Embarque</th>
                <th scope="col">Hora do Embarque</th>
                <th scope="col">Origem</th>
                <th scope="col">Destino</th>
                <th scope="col">Modelo do Ônibus</th>
                <th scope="col">Placa do Ônibus</th>
                <th scope="col">Valor</th>
              </tr>
            </thead>
            <tbody>
                           <%
              	for(Passagem pass : DAOPassagem.listarPassagem()){%>
              		<tr>
              			<td><%= pass.getId() %></td>
              			<td><%= pass.getPassageiro().getNome() %></td>
              			<td><%= pass.getPassageiro().getCpf() %></td>
              			<td><%= pass.getItinerario().getData_embarq() %></td>
              			<td><%= pass.getItinerario().getHora_embarq() %></td>
              			<td><%= pass.getItinerario().getOrigem() %></td>
              			<td><%= pass.getItinerario().getDestino() %></td>
              			<td><%= pass.getItinerario().getValor() %></td>
              			<td><%= pass.getItinerario().getOnibus().getModelo() %></td>
              			<td><%= pass.getItinerario().getOnibus().getPlaca() %></td>
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