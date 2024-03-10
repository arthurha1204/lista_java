//Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
//A formula de convers  ́ ao ̃ e:  ́ C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
//e F a temperatura em Fahrenheit.
package lista1;

import java.util.Scanner;

public class lista1_7 {
	
	public static void main (String [] args) {
		
		double  f, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite um valor em Fahrenheit para ser convertido para Celsius");
		f = sc.nextDouble();
		
		 c = (f - 32.0) * 5.0/9.0;
		 
		 System.out.println("O valor em farehnheit inserido foi " + f + ", e em celsius é: " + c);
		
		
		
	}
	
	

}
