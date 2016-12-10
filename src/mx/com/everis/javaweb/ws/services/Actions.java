package mx.com.everis.javaweb.ws.services;

import java.util.List;

import mx.com.everis.javaweb.model.Personaje;

public interface Actions {
	public boolean insertPerson(Personaje persona);
	public String lista();
	public String listaP();
	public boolean updatePerson(Personaje persona);
	public boolean deletePerson(Personaje persona);
}
