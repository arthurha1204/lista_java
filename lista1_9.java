//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A
//formula de convers  ́ ao ̃ e: ́ K = C + 273.15, sendo C a temperatura em Celsius e K a
//temperatura em Kelvin.


package lista1;
import java.util.Scanner;

public class lista1_9 {
	
	public static void main(String [] args) {
		
		Double C, K;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, insira um valor em graus Celsius para transformar em Kelvin: ");
		
		C =sc.nextDouble();
		
		K = C + 273.15;
		
		System.out.println("O valor inserido em Celcius foi: " + C + "que convertido em Kelvin é: " + K);
		
														
	}

}
