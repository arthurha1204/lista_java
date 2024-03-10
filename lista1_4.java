package lista1;
import java.lang.Math;
import java.util.Scanner;

public class lista1_4 {
	public static void main(String [] args) 
	{
		
		Double x;
		Double raizquadrada;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite um número REAL para obter sua raíz quadrada");
		x = sc.nextDouble();
		raizquadrada = Math.sqrt(x);
		
		System.out.println("A raíz quadrada de "+ x + " é: " + raizquadrada);
	}
	

}
