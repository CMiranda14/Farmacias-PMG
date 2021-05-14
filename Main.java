import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		
		//VARIABLES INICIALES
		double peso_sujeto;
		double altura_sujeto;
		String nombre_sujeto;
	
		System.out.println("____________________________________");
		System.out.println("----¡¡BIENVENIDO FARMACIAS PMG!!----");
		System.out.println("____________________________________");
		System.out.println("");
		
		
		//PROCEDIMIENTO INCIAL
		Scanner fa  = new Scanner(System.in);
		System.out.print("-¿Cuál es tú nombre?:");
		String nombre_Sujeto = fa.nextLine();
		
		Scanner inputCommand = new Scanner(System.in);
		System.out.print("-Ingresa tu peso en libras "+ nombre_Sujeto +":");
		double peso_Sujeto = inputCommand.nextDouble();
		
		Scanner inputCommand2 = new Scanner(System.in);
		System.out.println("-Ingresa tu altura en metros "+ nombre_Sujeto +":");
		double altura_Sujeto = inputCommand2.nextDouble();
		
		//PROCEDIMIENTO FINAL
		double IMC = (peso_Sujeto /2 )/ (altura_Sujeto * altura_Sujeto );
		
		System.out.println("- Tu IMC " + nombre_Sujeto + " es de: "  +  IMC + " Kg/m2");
		

	}

}
