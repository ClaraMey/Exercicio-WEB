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
	
	public List<Passagem> listarPassagem(){
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Passagem> lista = sessao.createQuery("FROM Passagem").list();
		sessao.getTransaction().commit();
		sessao.close();
		
		return lista;
	}
}
