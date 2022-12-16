package entities;

public class Caneta {

	private String modelo;
	private String cor;
	private Integer carga;
	private Float ponta;
	private Boolean tampada;
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

	public Boolean getTampada() {
		return tampada;
	}

	public void setTampada(Boolean tampada) {
		this.tampada = tampada;
	}
	

	public Float getPonta() {
		return ponta;
	}

	public void setPonta(Float ponta) {
		this.ponta = ponta;
	}

	public void rabiscar() {
		if(tampada == true || this.carga == 0) {
			System.out.println("Erro! A caneta está tampada ou sem tinta!");
		}else {
			System.out.println("Bora rabiscar!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void estado() {
		System.out.println("Esta caneta tem o modelo: " + this.modelo +
						  "\nEsta caneta tem a cor: " + this.cor +
						  "\nEsta caneta tem a ponta: " + this.ponta +
						  "\nEsta caneta tem a carga de: " + this.carga + "%" +
						  "\nEsta caneta está tampada? " + this.tampada);
	}
}
