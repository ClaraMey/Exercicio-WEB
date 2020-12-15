package controller;

import java.util.List;

import org.hibernate.Session;

import model.Onibus;


public class DAOOnibus {

public void inserirOnibus(Onibus o) {
		
		//INSERIR
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(o);
		sessao.getTransaction().commit();
		sessao.close();
		
	}
	
	public static List<Onibus> listarOnibus(){
		
		//LISTAR
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Onibus> lista = sessao.createQuery("FROM Onibus").list();
		sessao.getTransaction().commit();
		sessao.close();
		
		return lista;
	}
	
	public static List<Onibus> filtrarOnibusPorModelo(String str){ 
		
		//FILTRAR POR MODELO
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		List<Onibus> lista = sessao.createQuery("FROM Onibus WHERE modelo like '%"+str+"%'").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
	
	public static Onibus localizarOnibusPorCodigo(int cod){
		
		//LOCALIZAR POR ID
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		Onibus obj = (Onibus) sessao.createQuery("FROM Onibus WHERE id = " + cod).uniqueResult();
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
	public static void removerOnibus(Onibus oni) { 
		
		// DELETE
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.delete( oni );
		
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public static void editarOnibus(Onibus oni) { 
		
		//EDITAR ONIBUS
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.update(oni);
		
		sessao.getTransaction().commit();
		sessao.close();
	}
}
