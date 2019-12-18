package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.PersonaDAO;
import modelo.Persona;

@Stateless
public class GestionPersonas {

	@Inject
	private PersonaDAO dao;
	
	public void guardar(Persona persona) {
		if(dao.read(persona.getCedula())==null)
			dao.insert(persona);
		else
			dao.update(persona);
		
		
	}
	
	public List<Persona> gerPersonas(){
		return dao.getPersonas();
	}
}
