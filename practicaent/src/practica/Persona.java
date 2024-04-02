package practica;

public class Persona {

	private String nombre;
    private String apellidos;
    
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public void decirNombre() {
		System.out.println("¡Hola! Soy "+nombre);
	}
	
	public void decirApellidos() {
		System.out.println("Me apellido "+apellidos);
	}
	
}
