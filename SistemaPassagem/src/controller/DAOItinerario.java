package controller;

import java.util.List;

import org.hibernate.Session;

import model.Itinerario;

public class DAOItinerario {

public void inserirItinerario(Itinerario i) {
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(i);
		sessao.getTransaction().commit();
		sessao.close();
		
	}
	
	public List<Itinerario> listarItinerario(){
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Itinerario> lista = sessao.createQuery("FROM Itinerario").list();
		sessao.getTransaction().commit();
		sessao.close();
		
		return lista;
	}
}
