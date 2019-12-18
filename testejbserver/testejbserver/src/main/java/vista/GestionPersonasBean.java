package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Persona;
import modelo.Telefono;
import negocio.GestionPersonas;

@ManagedBean
@SessionScoped
public class GestionPersonasBean {

	private Persona persona = new Persona();
	
	@Inject
	private GestionPersonas gp;
	
	private List<Persona> personas;
	
	@PostConstruct
	public void init() {
		persona = new Persona();
		persona.addTelefono(new Telefono());
		
		personas = gp.gerPersonas();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public String guardar() {
		System.out.println(persona);
		gp.guardar(persona);
		init();
		return null;
	}
	
	public String addTelefono() {
		persona.addTelefono(new Telefono());
		return null;
	}
}
