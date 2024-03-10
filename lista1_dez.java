//Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s ˆ
//(metros por segundo). A formula de convers  ́ ao ̃ e:  ́ M = K/3.6, sendo K a velocidade em
//km/h e M em m/s.

package lista1;
import java.util.Scanner;

public class lista1_10 {
	
	public static void main(String [] args) {
		Double K, M;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor em km/h para ser convertida para m/s: ");
		
		K = sc.nextDouble();
		
		M = K/3.6;
		
		System.out.println("O valor inserido em km/h foi " +  K + "que em m/s é" + M);
		
	}

}
