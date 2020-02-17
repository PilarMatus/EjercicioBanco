package Banco;
import java.util.Scanner;
public class MainBanco {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String titular;
		double cantidad,
		
		   monto_a_ingresar,
		   monto_a_retirar,
		   permitido= 200000;
		   
	
	claseBanco rene = new claseBanco();
	System.out.printf("Ingrese Nombre del titular de la cuenta \n ");
	
	titular = teclado.nextLine();
	rene.setTitular(titular);
	System.out.printf("Ingrese La cantidad inicial de la cuenta: \n");
	
	cantidad = teclado.nextDouble();
	rene.setCantidad(cantidad);
	System.out.println(rene.toString());
	System.out.println("Ingrese el monto a ingresar:");
	
	monto_a_ingresar = teclado.nextDouble();
	rene.ingresar(monto_a_ingresar, permitido);
	System.out.println("Ingrese el monto a retirar: ");
	
	monto_a_retirar = teclado.nextDouble();
	rene.retirar(monto_a_retirar, permitido);
}

		
		

	}


