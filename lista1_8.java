//Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
//formula de convers  ́ ao ̃ e: ́ C = K − 273.15, sendo C a temperatura em Celsius e K a
//temperatura em Kelvin.

package lista1;

import java.util.Scanner;

public class lista1_8 {
	public static void main(String [] args) {
		Double K, C;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite um valor em Kelvin para ser convertido em Celsius : ");
		
		K = sc.nextDouble();
		
		C = K - 273.15;
		
		System.out.println("O valor inserido em Kelvin foi: " + K + " e em Celsius é: " + C);		
	}

}
