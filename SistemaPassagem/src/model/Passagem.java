package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Passagem {

	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Passageiro passageiro;
	@ManyToOne
	private Itinerario itinerario;
	private int num_polt;
	public Passagem() {
		super();
	}

	public Passagem(Passageiro passageiro, Itinerario itinerario, int num_polt) {
		super();
		this.passageiro = passageiro;
		this.itinerario = itinerario;
		this.num_polt = num_polt;
	}

	public int getNum_polt() {
		return num_polt;
	}

	public void setNum_polt(int num_polt) {
		this.num_polt = num_polt;
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
