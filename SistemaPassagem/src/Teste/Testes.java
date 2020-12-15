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
	
		//Inserindo Onibus
		 Onibus on1 = new Onibus();
		 on1.setModelo("Executive");
		 on1.setPlaca("JNG-5214");
		 on1.setQtd_polt(42);
				
		 DAOOnibus on = new DAOOnibus();
		 on.inserirOnibus(on1);
		
		
		 Passageiro p1 = new Passageiro();
		 p1.setNome("Clara");
		 p1.setCpf("000.000.000-00");
	   	 p1.setEmail("clara@mey");
		 p1.setSenha("clara123");
		 DAOPassageiro dp = new DAOPassageiro(); 
		 dp.inserirPassageiro(p1);
		
		 Itinerario it1 = new Itinerario();
		 it1.setOrigem("Paulo Afonso"); 
		 it1.setDestino("Salvador");
		 it1.setData_embarq("02/01/2021");
		 it1.setHora_embarq("07:15");
		 it1.setValor(102.45);
		 it1.setOnibus(on1);
		 DAOItinerario it = new DAOItinerario(); 
		 it.inserirItinerario(it1);
		 
		 Passagem pass1 = new Passagem();
		 pass1.setNum_polt(12);
		 pass1.setItinerario(it1);
		 pass1.setPassageiro(p1);
	
		 DAOPassagem p = new DAOPassagem();
		 p.inserirPassagem(pass1);

		 
		 System.out.println(pass1.getItinerario().getOrigem());
		 System.out.println(pass1.getPassageiro().getNome());
		 System.out.println(pass1.getItinerario().getOnibus().getModelo());
		 
	}
}
