package practicoII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//LISTA LAMBDA CON STRING


public class metodotransformador {

	public static void main(String[] args) {
        
		List<String> listaObj1 = new ArrayList<>(Arrays.asList("Chorqui", "Tita", "Archi", "Ciro", "Nubarron"));
		
		List<String> listaObj2 = new ArrayList<>();
		listaObj2.add("Cesar");
		listaObj2.add("Jimena");
		listaObj2.add("Nelida");
		listaObj2.add("Gabriela");
		listaObj2.add("Gonzalo");
		
		
		System.out.println("TRANSFORMADOR DE LISTA LAMBDA CON STRING");
		System.out.println("1º LISTA DE PALABRAS CONVERTIDAS: MINÚSCULAS A MAYÚSCULAS" );
		ConvierteString lmb1 = (elemento) -> elemento.toUpperCase();
		for(String l:listaObj1) {
			System.out.print(lmb1.convierte(l) + ", ");
		}
		
		
		System.out.println("\n");
		System.out.println("2º LISTA DE PALABRAS CONVERTIDAS: MAYÚSCULAS A MINÚSCULAS" );
		 lmb1 = (elemento) -> elemento.toLowerCase();
		for(String l:listaObj2) {
			System.out.print(lmb1.convierte(l) + ", ");
		}
		
	}

}