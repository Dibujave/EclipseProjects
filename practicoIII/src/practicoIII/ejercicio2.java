package practicoIII;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



//PRACTICO 2 - METODO FILTRAR PALABRAS CON LONGITUD Y JOINING

public class ejercicio2 {

	public static void main(String[] args) {
		
		
		List<String> texto1 = new ArrayList<>();
		texto1.add( "Uno" );
		texto1.add( "Segundo" );
		texto1.add( "Tres" );
		texto1.add( "Cuarto" );
		texto1.add( "Quinto" );
		texto1.add( "dos" );
				
		int n=2;
		String palabra = concatenar(texto1,n);
		System.out.println("COLECCIÓN CONCATENADA CON ELEMENTOS MAYORES A "+n+": \n"+palabra);
				
	}
			
   public static String concatenar(List<String> l, int n) {
	    
    	String concatenada = l.stream().filter((elemento) -> elemento.length() > n).collect(Collectors.joining(", "));
        return concatenada;
	    }

}