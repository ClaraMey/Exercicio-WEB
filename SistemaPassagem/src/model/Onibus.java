package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Onibus {
	
	@Id
	@GeneratedValue
	private int id_onibus;
	private String placa;
	private String modelo;
	private int qtd_polt;
	
	public Onibus() {
		super();
	}

	public Onibus(String placa, String modelo, int qtd_polt) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.qtd_polt = qtd_polt;
	}

	public int getId_onibus() {
		return id_onibus;
	}

	public void setId_onibus(int id_onibus) {
		this.id_onibus = id_onibus;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtd_polt() {
		return qtd_polt;
	}

	public void setQtd_polt(int qtd_polt) {
		this.qtd_polt = qtd_polt;
	}
	
	
	
	
}
