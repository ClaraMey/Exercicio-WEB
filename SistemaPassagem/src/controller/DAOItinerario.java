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
	
	public static List<Itinerario> filtrarItinerarioPorData(String str){ 
		
		//FILTRAR POR DATA(STRING)
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		List<Itinerario> lista = sessao.createQuery("FROM Itinerario WHERE data like '%"+str+"%'").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
	
	public static Itinerario localizarItinerarioPorCodigo(int cod){
		
		//LOCALIZAR POR ID
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		Itinerario obj = (Itinerario) sessao.createQuery("FROM Itinerario WHERE id = " + cod).uniqueResult();
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
	public static void removerItinerario(Itinerario iti) { 
		
		// DELETAR ITINERARIO
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.delete(iti);
		
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public static void editarItinerario(Itinerario iti) { 
		
		//EDITAR ITINERARIO
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.update(iti);
		
		sessao.getTransaction().commit();
		sessao.close();
	}
}
