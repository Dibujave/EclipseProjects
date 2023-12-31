import java.time.LocalDate;
import java.util.Scanner;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //define private a todos los atributos
public class SoporteServicio {
	int idSoporte;
	String codSoporte;
	String tipoSoporte;//hard soft etc
	String desSoporte;
	final LocalDate altaSoporte=LocalDate.now();
	String tmpRespSoporte;
	String complejidadSoporte;
	String estadoSoporte;//activo / inactivo
		
public SoporteServicio(int i, String codSoporte2, String tipo, String descripcion, String tiempoReso,
			String complejidad, String estado) {
		// TODO Auto-generated constructor stub
	}

public static SoporteServicio altaSoporte(){
	
	///AGREGAR VALIDACION DE INGRESO DE DATOS COMO EN EMPLEADOS
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("*****INGRESE LOS SIGUIENTES DATOS DEL SOPORTE/SERVICIO*****");
    System.out.println("**************RESPETANDO LAS INDICACIONES**************");
	System.out.println("CODIGO (10 caract max): ");
	String codSoporte = entrada.nextLine();
	System.out.println("TIPO SOFT/HARD: ");
	String tipo = entrada.nextLine();
	System.out.println("DESCRIPCION: ");
	String descripcion = entrada.nextLine();
	System.out.println("COMPLEJIDAD ALTA/MEDIA/BAJA: ");
	String complejidad = entrada.nextLine();
	System.out.println("TIEMPO DE RESOLUCION en horas: ");
	String tiempoReso = entrada.nextLine();
	System.out.println("ESTADO DISPONIBLE/NO DISPONIBLE: ");
	String estado = entrada.nextLine();
	

	SoporteServicio sop1 = new SoporteServicio(1,codSoporte,tipo,descripcion,tiempoReso,complejidad,estado);
		
	

	entrada.close();
	return sop1;
}

public String getCodSoporte() {
	// TODO Auto-generated method stub
	return null;
}

public String getTipoSoporte() {
	// TODO Auto-generated method stub
	return null;
}

public String getDesSoporte() {
	// TODO Auto-generated method stub
	return null;
}

public String getComplejidadSoporte() {
	// TODO Auto-generated method stub
	return null;
}

public String getTmpRespSoporte() {
	// TODO Auto-generated method stub
	return null;
}

public String getEstadoSoporte() {
	// TODO Auto-generated method stub
	return null;
}

}