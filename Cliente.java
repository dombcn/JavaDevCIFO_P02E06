package clases.cifo.com;

public class Cliente implements Comunicacion {
	
	private String nombre;
	private String email;
	private String tipo;
	
	public Cliente(String n) {
		nombre = n;
		email = "";
		tipo = "";
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public boolean setEmail(String em) {
		// check email
		if(em.indexOf('@')<0) return false; // no modifica el email
		else {
			email = em;
			return true;
		}
	}
	
	public void setTipo(String t) {
		tipo = t;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String saludo() {
		return "Hola "+nombre+", encantados por su visita.";
	}
}
