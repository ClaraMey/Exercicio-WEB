package controller;

import java.util.List;

import org.hibernate.Session;

import model.Passageiro;

public class DAOPassageiro {

	public void inserirPassageiro(Passageiro p) {
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(p);
		sessao.getTransaction().commit();
		sessao.close();
		
	}
	
	public List<Passageiro> listarPassageiro(){
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Passageiro> lista = sessao.createQuery("FROM Passageiro").list();
		sessao.getTransaction().commit();
		sessao.close();
		
		return lista;
	}
	
	public static List<Passageiro> filtrarPassageiroPorNome(String str){ 
		
		//FILTRAR POR NOME
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		List<Passageiro> lista = sessao.createQuery("FROM Passageiro WHERE nome like '%"+str+"%'").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
	
	public static Passageiro localizarPassageiroPorCodigo(int cod){
		
		//LOCALIZAR POR ID
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		Passageiro obj = (Passageiro) sessao.createQuery("FROM Passageiro WHERE id = " + cod).uniqueResult();
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
	public static void removerPassageiro(Passageiro pass) { 
		
		// DELETAR PASSAGEIRO
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.delete(pass);
		
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public static void editarPassageiro(Passageiro pass) { 
		
		//EDITAR PASSAGEIRO
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.update(pass);
		
		sessao.getTransaction().commit();
		sessao.close();
	}
}
