package Teste;

import controller.DAOPassageiro;
import model.Passageiro;

public class Testes {

	public static void main(String[] args) {
		Passageiro p1 = new Passageiro();
		p1.setNome("Clara");
		p1.setCpf("000.000.000-00");
		p1.setEmail("clara@mey");
		p1.setSenha("senha");
		
		DAOPassageiro dp = new DAOPassageiro();
		
		dp.inserirPassageiro(p1);
	}
}
