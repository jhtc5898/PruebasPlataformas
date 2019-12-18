package negocio;

import java.util.List;

import javax.ejb.Remote;

import modelo.Libro;

@Remote
public interface GestionLibrosRemote {
	
	public void guardarLibro(int codigo, String titulo);
	public List<Libro> getLibros();

}
