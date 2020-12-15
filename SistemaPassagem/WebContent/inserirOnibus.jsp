<%@page import="model.Onibus"%>
<%@page import="controller.DAOOnibus" %>
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
		String placa = request.getParameter("placa");
		String modelo = request.getParameter("modelo");
		int qtd_polt = Integer.parseInt( request.getParameter("qtd_polt"));
		
		Onibus onibus = new Onibus(placa, modelo, qtd_polt);
		
		new DAOOnibus().inserirOnibus(onibus);
		
		response.sendRedirect("listaOnibus.jsp");
	
	%>

</body>
</html>