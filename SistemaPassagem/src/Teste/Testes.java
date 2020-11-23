package Teste;

import controller.DAOItinerario;
import controller.DAOOnibus;
import controller.DAOPassageiro;
import controller.DAOPassagem;
import model.Itinerario;
import model.Onibus;
import model.Passageiro;
import model.Passagem;

public class Testes {

	public static void main(String[] args) {
		//Inserindo Passageiro
		Passageiro p1 = new Passageiro();
		p1.setNome("Clara");
		p1.setCpf("000.000.000-00");
		
		DAOPassageiro dp = new DAOPassageiro();
		dp.inserirPassageiro(p1);
		
		//Inserindo Itinerario
		Itinerario it1 = new Itinerario();
		it1.setOrigem("Paulo Afonso");
		it1.setDestino("Salvador");
				
		DAOItinerario it = new DAOItinerario();
		it.inserirItinerario(it1);
		
		//Inserindo Passagem
		Passagem pass1 = new Passagem();
		pass1.getItinerario().getDestino();
		DAOPassagem p = new DAOPassagem();
		p.inserirPassagem(pass1);
		
		//Inserindo Onibus
		Onibus on1 = new Onibus();
		on1.setModelo("Executive");
		on1.setPlaca("JNG-5214");
				
		DAOOnibus on = new DAOOnibus();
		on.inserirOnibus(on1);
				
	}
}
