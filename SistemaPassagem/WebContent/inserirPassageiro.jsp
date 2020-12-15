<%@page import="model.Passageiro"%>
<%@page import="controller.DAOPassageiro" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Passageiro passageiro = new Passageiro(nome, cpf, email, senha);
		
		new DAOPassageiro().inserirPassageiro(passageiro);
		
		response.sendRedirect("listaPassageiro.jsp");
	
	%>

</body>
</html>