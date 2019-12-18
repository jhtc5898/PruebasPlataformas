package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -20336965027624681L;
	
	@Id
	private int codigo;
	private String titulo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", titulo=" + titulo + "]";
	}
	
}
