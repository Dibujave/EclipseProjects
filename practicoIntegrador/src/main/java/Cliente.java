import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Cliente {

	 int idCliente;
	 String cuitCliente;
	 String razonSocial;
	 String nomCliente;
	 String apeCliente;
	 String direCliente;
	 String    celCliente;
	 String mailCliente;
	 final LocalDate altaCliente = LocalDate.now();
	 String contratos;
	
public Cliente(int i, String cuit, String razonS, String nom, String ape, String dire, String cel, String mail,
			String contrato) {
		// TODO Auto-generated constructor stub
	}

public static Cliente altaCliente() {
	System.out.println("\n*****INGRESE LOS SIGUIENTES DATOS DEL CLIENTE*****");
    System.out.println("***********RESPETANDO LAS INDICACIONES*************");
		Scanner entrada = new Scanner(System.in);
		System.out.println("CUIT: ");
		String cuit = entrada.nextLine();
		System.out.println("RAZON SOCIAL: ");
		String razonS = entrada.nextLine();
		System.out.println("NOMBRE: ");
		String nom = entrada.nextLine();
		System.out.println("APELLIDO: ");
		String ape = entrada.nextLine();
		System.out.println("DIRECCION: ");
		String dire = entrada.nextLine();
		System.out.println("CELULAR: ");
		String cel = entrada.nextLine();
		System.out.println("MAIL: ");
		String mail = entrada.nextLine();
		System.out.println();
		System.out.println("CONTRATO (CODIGO DEL SOPORTE): ");
		String contrato = entrada.nextLine();
			
		Cliente cliente1 = new Cliente(1,cuit,razonS,nom,ape,dire,cel,mail,contrato);
			
		//System.out.println(cliente1.toString());

		entrada.close();
		return cliente1;
		}

public String getRazonSocial() {
	// TODO Auto-generated method stub
	return null;
}

public String getCuitCliente() {
	// TODO Auto-generated method stub
	return null;
}

public String getNomCliente() {
	// TODO Auto-generated method stub
	return null;
}

public String getApeCliente() {
	// TODO Auto-generated method stub
	return null;
}

public String getDireCliente() {
	// TODO Auto-generated method stub
	return null;
}

public String getMailCliente() {
	// TODO Auto-generated method stub
	return null;
}

public String getCelCliente() {
	// TODO Auto-generated method stub
	return null;
}

public String getContratos() {
	// TODO Auto-generated method stub
	return null;
}

}
