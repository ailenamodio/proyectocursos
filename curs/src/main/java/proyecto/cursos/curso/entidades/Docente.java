package proyecto.cursos.curso.entidades;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@Entity 
@DiscriminatorValue (value= "DOCENTE")
public class Docente extends Persona implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	@OneToMany
	private List <Curs> cursos = new ArrayList<>();
	
	public Docente(String nombre, String apellido) {
		super(nombre, apellido);
	}
	public Docente() {
		
	}
}
	