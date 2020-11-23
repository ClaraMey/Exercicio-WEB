package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passagem {

	@Id
	@GeneratedValue
	private int id;
	//@OneToOne
	private Passageiro passageiro;
	//@ManyToOne
	private Itinerario itinerario;
	
	public Passagem() {
		super();
	}

	public Passagem(Passageiro passageiro, Itinerario itinerario) {
		super();
		this.passageiro = passageiro;
		this.itinerario = itinerario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Itinerario getItinerario() {
		return itinerario;
	}

	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}
	
	
	
}
