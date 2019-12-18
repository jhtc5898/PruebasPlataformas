package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefono {

	@Id
	private int codigo;
	private String number;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Telefono [codigo=" + codigo + ", number=" + number + "]";
	}
	
	
}
