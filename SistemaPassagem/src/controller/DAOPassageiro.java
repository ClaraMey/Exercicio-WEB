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
}
