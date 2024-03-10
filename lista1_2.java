package lista1;

import java.util.Scanner;

public class lista1_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double x;
		
		System.out.println("Olá! Digite um número racional: ");
		x = sc.nextDouble();
		System.out.println("O número racional digitado foi: " + x);
		
		sc.close();
	}

}
