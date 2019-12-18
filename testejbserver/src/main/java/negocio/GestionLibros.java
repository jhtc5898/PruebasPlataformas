package negocio;

import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.LibroDAO;
import modelo.Libro;
import java.util.ArrayList;

@Stateless
public class GestionLibros implements GestionLibrosRemote, GestionLibrosLocal {


	@Inject
	private LibroDAO dao;
	
	public void guardarLibro(int codigo, String titulo){
		Libro l = new Libro();  
		l.setCodigo(codigo);  
		l.setTitulo(titulo);   
		System.out.println(l);
		dao.insert(l);
	}
	
	public List<Libro> getLibros(){
		
		return dao.getLibros();
	}
	
	public List<Libro> getLibrosPorNombre(String filtro){
		
		return dao.getLibrosXNombre(filtro);
	}
}
