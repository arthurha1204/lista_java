package lista1;
import java.util.Scanner;

public class lista1_5 {
	
	public static void main(String [] args) {
		Double x, quintaparte;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite um número real para obter a quinta parte do número: ");
		x = sc.nextDouble();
		
		quintaparte = x/5;
		
		System.out.println("A quinta parte de " + x + " é igual a " + quintaparte);
	}

}
