//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
//A formula de conversão ̃ e:  ́ F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit
//e C a temperatura em Celsius.


package lista1;
import java.util.Scanner;

public class lista1_6 {
	
	public static void main (String [] args) {
		
		Double celsius, fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor em graus Celsius para ser convertido em Fahrenheit: ");
		
		celsius = sc.nextDouble();
		
		fahrenheit = celsius*(9.0/5.0)+32.0; 
		
		System.out.println("O valor em Celsius foi: " + celsius + " e o valor em Fahrenheit é: " + fahrenheit);
		
		
		
		
		
		
	}

}
