package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Libro;

@Local
public interface GestionLibrosLocal {
	
	public void guardarLibro(int codigo, String titulo);
	public List<Libro> getLibros();
	public List<Libro> getLibrosPorNombre(String filtro);

}
