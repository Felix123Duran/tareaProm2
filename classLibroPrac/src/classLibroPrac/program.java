package classLibroPrac;
import java.util.*;



public class program {

	public static void main(String[] args) {
		
	Libro NombreDeLibro_Rentado=new Libro();
	
	
	System.out.println("Introdusca la opcion que necesite:\nPrestamo\ndevolucion");
	Scanner RegistroLibro= new Scanner(System.in);
	String opcionesUsuarios =RegistroLibro.next();

	
	switch (opcionesUsuarios) {
	case "prestamo":
		NombreDeLibro_Rentado.prestamo();
		break;
	case "devolucion":
		NombreDeLibro_Rentado.devolucion();
		break;

	default:
		System.err.println("a introducido una opcion diferente ");
		break;
	}
	
	
	System.out.println("Su libro se llama: "+NombreDeLibro_Rentado.getClass());
	
	
	

	}

}
