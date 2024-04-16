package practica;

import java.util.Scanner;

public class Jurado extends Persona{
	
    private String fraseNominar;
    private int añosExperiencia;
    
	public Jurado(String fraseNominar, int añosExperiencia, String nombre, String apellidos) {
		super(nombre, apellidos);
		this.fraseNominar = fraseNominar;
		this.añosExperiencia = añosExperiencia;
	}
    
	public int aumentarAñosExperiencia() {
		añosExperiencia++;
		return añosExperiencia;
		
	}
    
	public void nominar() {
		Scanner teclado= new Scanner (System.in);
		fraseNominar=teclado.nextLine();
		System.out.println(fraseNominar);
	}
	//HELOOOOO SOY SONIA Y VOY HCAER UN CAMBIO
}
