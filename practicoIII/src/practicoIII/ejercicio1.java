package practicoIII;

import java.util.ArrayList;
import java.util.List;



//PRACTICO 1 - LISTRA DE STRING EN MAYUSCULAS


public class ejercicio1 {

	public static void main(String[] args) {
		
		Persona per1 = new Persona("Cesar Barber");
		Persona per2 = new Persona("Jimena Avila");
		Persona per3 = new Persona("Don Gato");
		Persona per4 = new Persona("Archi Chorqui");
		Persona per5 = new Persona("Juan Perez");
		Persona per6 = new Persona("Gato Conbotas");
		
		
		List<Persona> lPersona = new ArrayList<Persona>();
		lPersona.add(per1);
		lPersona.add(per2);
		lPersona.add(per3);
		lPersona.add(per4);
		lPersona.add(per5);
		lPersona.add(per6);
		
		System.out.println("LISTA DE STRING EN MAYÚSCULAS: ");
		lPersona.stream().forEach((b)->System.out.println(b.getNomApell()));
	}

}