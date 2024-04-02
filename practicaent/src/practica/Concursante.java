package practica;

import java.util.Random;

public class Concursante extends Persona{

	private int edad;
    private boolean expulsado=false;
    
	public Concursante(int edad, boolean expulsado, String nombre, String apellidos) {
		super(nombre, apellidos);
		this.edad = edad;
		this.expulsado = expulsado;
	}
    
	public int cumplirAños() {
		edad++;
		return edad;
		
	}
	
	public boolean expulsar() {
		int porcentaje=(int) Math.random();
		System.out.println(porcentaje);
		if (porcentaje<50) {
			expulsado=true;
		}else {
			expulsado=false;
		}
		return expulsado;
	}
	
}
