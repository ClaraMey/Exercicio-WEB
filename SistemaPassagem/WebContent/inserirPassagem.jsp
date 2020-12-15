<%@page import="controller.DAOPassageiro"%>
<%@page import="model.Passageiro"%>
<%@page import="controller.DAOItinerario"%>
<%@page import="model.Itinerario"%>
<%@page import="controller.DAOOnibus"%>
<%@page import="model.Onibus"%>
<%@page import="controller.DAOPassagem"%>
<%@page import="model.Passagem"%>

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
		int idPassageiro = Integer.parseInt(request.getParameter("id"));
		String nomePassageiro = request.getParameter("nome");
		String cpfPassageiro = request.getParameter("cpf");
		int idItinerario = Integer.parseInt(request.getParameter("id"));
		String dataEmbarque = request.getParameter("data_embarq");
		String horaEmbarque = request.getParameter("hora_embarq");
		int numPolt = Integer.parseInt( request.getParameter("num_polt") );
		int idOnibus = Integer.parseInt(request.getParameter("id"));
		String modelo = request.getParameter("modelo");
		double valor = Double.parseDouble(request.getParameter("valor"));
		
		Itinerario itinerario = DAOItinerario.localizarItinerarioPorCodigo(idItinerario);
		Passageiro passageiro = DAOPassageiro.localizarPassageiroPorCodigo(idPassageiro);
		Onibus onibus = DAOOnibus.localizarOnibusPorCodigo(idOnibus);
		
		Passagem pass = new Passagem(passageiro, itinerario, num_polt);
	
	
	
	%>
</body>
</html>