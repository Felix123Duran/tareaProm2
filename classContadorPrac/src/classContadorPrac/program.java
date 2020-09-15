package classContadorPrac;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		
		int deseo;
		int numero;
		
		
		
		System.out.println("Que desea? \n1.Incremento\n2.decremento");
		Scanner detector=new Scanner(System.in);
		deseo=detector.nextInt();
		
		switch (deseo) {
		case 1:
			System.out.print("dijita un nuero a incrementar: ");
			numero = detector.nextInt();
			
			
			Contador increme=new Contador(numero);
			break;
		case 2:
			System.out.print("dijita un nuero a decrementar: ");
			numero = detector.nextInt();
			
			for (; numero > -100; numero--) {
				
				System.out.println(numero);

			}
			

		default:
			break;
		}

	}

}
