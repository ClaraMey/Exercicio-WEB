<%@page import="model.Passageiro"%>
<%@page import="controller.DAOPassageiro" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Relação de Passageiros</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <style>
        body{
            background-color: #5F7C8A;
        }
        section{
            background-color: white;
            color: #5F7C8A;
            width: 900px;
            border-radius: 15px;
            margin: auto;
            margin-top: 300px;
            padding: 20px;
            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        }
        section h3{
            text-align: center;
            padding: 10px;
        }
    </style>
</head>
<body>
	<section>
        <table class="table table-hover">
            <thead>
                <h3>RELAÇÃO DE PASSAGEIROS</h3>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">CPF</th>
                <th scope="col">Email</th>
              </tr>
            </thead>
            <tbody>
              <%
              	for(Passageiro pass : new DAOPassageiro().listarPassageiro()){%>
              		<tr>
              			<td><%= pass.getId() %></td>
              			<td><%= pass.getNome() %></td>
              			<td><%= pass.getCpf() %></td>
              			<td><%= pass.getEmail() %></td>
              		</tr>
              <%}%>
             
            </tbody>
          </table>
    </section>
</body>
</html>