package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Compromisso {

	private String assunto;
	private Date data;
	private String local;
	private String status;
	private String acompanhante;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAcompanhante() {
		return acompanhante;
	}

	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}

	public void agendar() throws ParseException{

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o assunto do compromisso: ");
		this.assunto = sc.nextLine();
		
		System.out.print("Data (dd/MM/yyyy): ");
		this.data = sdf.parse(sc.nextLine());
		
		System.out.print("Informe o local: ");
		this.local = sc.next();
		
		sc.nextLine();
		System.out.print("Informe o status: ");
		this.status = sc.nextLine();
		
		System.out.print("Informe o nome do acompanhante: ");
		this.acompanhante = sc.nextLine();
		
		sc.close();
	}


	public void consultar() {
		System.out.println("\nInformações \nAssunto: " + assunto + "\nData: " + sdf.format(data)  + "\nLocal: " + local + "\nStatus: " + status
				+ "\nAcompanhante: " + acompanhante);
	}

	void excluir() {

	}

	void alterar() {

	}
}
