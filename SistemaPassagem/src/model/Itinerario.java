package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Itinerario {

	@Id
	@GeneratedValue
	private int id;
	private Date data_embarq;
	private Date hora_embarq;
	private String origem;
	private String destino;
	private int num_polt;
	//@OneToOne
	private Onibus onibus;
	
	public Itinerario() {
		super();
	}

	public Itinerario(Date data_embarq, Date hora_embarq, String origem, String destino, int num_polt, Onibus onibus) {
		super();
		this.data_embarq = data_embarq;
		this.hora_embarq = hora_embarq;
		this.origem = origem;
		this.destino = destino;
		this.num_polt = num_polt;
		this.onibus = onibus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_embarq() {
		return data_embarq;
	}

	public void setData_embarq(Date data_embarq) {
		this.data_embarq = data_embarq;
	}

	public Date getHora_embarq() {
		return hora_embarq;
	}

	public void setHora_embarq(Date hora_embarq) {
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

	public int getNum_polt() {
		return num_polt;
	}

	public void setNum_polt(int num_polt) {
		this.num_polt = num_polt;
	}

	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}
	
	
	
}
