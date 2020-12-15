<%@page import="model.Onibus"%>
<%@page import="controller.DAOOnibus" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Formulário de Itinerário</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estiloFormIti.css">
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
                  <a class="nav-link active" href="home.html">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" href="formPassageiro.html">Passageiro</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="formPassagem.html">Passagem</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="formOnibus.html">Ônibus</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="formItinerario.html">Itinerário</a>
                </li>
              </ul>
            </div>
        </section>
    </header>
    <section id="container">
        <div id="formulario">
            <img src="itinerario.png" alt="">
            <p>ITINERÁRIO</p>
            <form action="inserirItinerario.jsp" method="get">
	            <input type="date" name="data_embarq" id="" placeholder="Data de Embarque">
	            <input type="time" name="hora_embarq" id="" placeholder="Hora de Embarque">
	            <input type="text" name="origem" id="" placeholder="Origem">
	            <input type="text" name="destino" id="" placeholder="Destino">
	            <input type="text" name="valor" id="" placeholder="Valor">
	            <br/>
	            <label for="" id="on">Ônibus</label>
	            <select name="onibus">
					<%for( Onibus o : DAOOnibus.listarOnibus() ){%>
						<option value="<%=o.getId_onibus()%>"> <%out.print(o.getModelo() + " - " + o.getPlaca());%> </option>
					<%}%>
				</select>
	            <br/>
	            <input type="submit" value="Enviar" id="btn">
            </form>
        </div>
        <div id="lista">
          <a href="listaItinerario.jsp" id="linkLista">Lista de Itinerários</a>
        </div>
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