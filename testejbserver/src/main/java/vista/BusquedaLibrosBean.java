package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Libro;
import negocio.GestionLibrosLocal;

@ManagedBean
public class BusquedaLibrosBean {
	
	@Inject
	private GestionLibrosLocal gl;

	private String filtro;
	private List<Libro> libros;
	
	public String getFiltro() {
		return filtro;
	}
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	public String buscar() {
		
		libros = gl.getLibrosPorNombre(filtro);
		
		return null;
	}
	
}
