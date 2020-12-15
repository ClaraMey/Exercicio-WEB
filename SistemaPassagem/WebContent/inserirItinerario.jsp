<%@page import="controller.DAOOnibus"%>
<%@page import="model.Onibus"%>
<%@page import="model.Itinerario"%>
<%@page import="controller.DAOItinerario" %>
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
		String data_embarq = request.getParameter("data_embarq");
		String hora_embarq = request.getParameter("hora_embarq");
		String origem = request.getParameter("origem");
		String destino = request.getParameter("destino");
		double valor = Double.parseDouble(request.getParameter("valor"));
		int idOnibus = Integer.parseInt( request.getParameter("onibus") );
		
		Onibus onibus = DAOOnibus.localizarOnibusPorCodigo(idOnibus);
		
		Itinerario itinerario = new Itinerario(data_embarq, hora_embarq, origem, destino, valor, onibus);
		
		new DAOItinerario().inserirItinerario(itinerario);
		
		response.sendRedirect("listaItinerario.jsp");
	
	%>
</body>
</html>