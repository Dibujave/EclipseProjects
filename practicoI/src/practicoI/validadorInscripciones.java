package practicoI;

public class validadorInscripciones {

	public static void main(String[] args) {
		
		 Alumno alumno = new Alumno("Cesar Barber", "IS0022");
	     
		 Materia algoritmosYEstructuraDeDatos = new Materia("Algoritmos y Estructura de Datos");
	     Materia paradigmasDeProgramacion = new Materia("Paradimgas de Programacion");
	     paradigmasDeProgramacion.agregarCorrelativa(algoritmosYEstructuraDeDatos);

	     Inscripcion inscripcionMauro = new Inscripcion(alumno, algoritmosYEstructuraDeDatos);
	     System.out.println(inscripcionMauro.aprobada());



	    }
	}