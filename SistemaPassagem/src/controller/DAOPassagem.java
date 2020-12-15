package controller;

import java.util.List;

import org.hibernate.Session;

import model.Passagem;

public class DAOPassagem {

public void inserirPassagem(Passagem p) {
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(p);
		sessao.getTransaction().commit();
		sessao.close();
		
	}
	
	public static List<Passagem> listarPassagem(){
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Passagem> lista = sessao.createQuery("FROM Passagem").list();
		sessao.getTransaction().commit();
		sessao.close();
		
		return lista;
	}
	
public static List<Passagem> filtrarPassagemPorNumPolt(int num){ 
		
		//FILTRAR POR NUMERO DA POLTRONA
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		List<Passagem> lista = sessao.createQuery("FROM Passagem WHERE num_polt like '%"+num+"%'").list();
		
		sessao.getTransaction().commit();
		sessao.close();

		return lista;
	}
	
	public static Passagem localizarPassagemPorCodigo(int cod){
		
		//LOCALIZAR POR ID
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();

		Passagem obj = (Passagem) sessao.createQuery("FROM Passagem WHERE id = " + cod).uniqueResult();
		
		sessao.getTransaction().commit();
		sessao.close();

		return obj;
	}
	
	public static void removerPassagem(Passagem pass) { 
		
		// DELETAR PASSAGEM
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.delete(pass);
		
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public static void editarPassagem(Passagem pass) { 
		
		//EDITAR PASSAGEM
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		sessao.update(pass);
		
		sessao.getTransaction().commit();
		sessao.close();
	}
}
