package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Libro;
import negocio.GestionLibrosLocal;

@ManagedBean

/**
 *  
 *  @RequestScope
 *
 */


public class GestionLibrosBean {

	@Inject
	private GestionLibrosLocal gl;
	
	
	/*Beans properties*/
	private int codigo;
	private String titulo;
	
	private List<Libro> libros;

	
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
	
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	public String guardarLibro() {
		
		System.out.println(codigo + "  " + titulo);
		gl.guardarLibro(codigo, titulo); 
		
		libros = gl.getLibros();
		
		return "listado-libros";
	}
}
