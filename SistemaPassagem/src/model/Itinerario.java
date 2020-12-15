package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Itinerario {

	@Id
	@GeneratedValue
	private int id;
	private String data_embarq;
	private String hora_embarq;
	private String origem;
	private String destino;
	private double valor;
	@ManyToOne
	private Onibus onibus;
	
	public Itinerario() {
		super();
	}

	public Itinerario(String data_embarq, String hora_embarq, String origem, String destino, double valor, Onibus onibus) {
		super();
		this.data_embarq = data_embarq;
		this.hora_embarq = hora_embarq;
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
		this.onibus = onibus;

	}

	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData_embarq() {
		return data_embarq;
	}

	public void setData_embarq(String data_embarq) {
		this.data_embarq = data_embarq;
	}

	public String getHora_embarq() {
		return hora_embarq;
	}

	public void setHora_embarq(String hora_embarq) {
		this.hora_embarq = hora_embarq;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
