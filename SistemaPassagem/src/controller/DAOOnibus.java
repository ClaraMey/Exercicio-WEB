package controller;

import java.util.List;

import org.hibernate.Session;

import model.Onibus;


public class DAOOnibus {

public void inserirOnibus(Onibus o) {
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.save(o);
		sessao.getTransaction().commit();
		sessao.close();
		
	}
	
	public List<Onibus> listarOnibus(){
		
		Session sessao = ConexaoBD.getSessionFactory().openSession();
		sessao.beginTransaction();
		List<Onibus> lista = sessao.createQuery("FROM Onibus").list();
		sessao.getTransaction().commit();
		sessao.close();
		
		return lista;
	}
}
