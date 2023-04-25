package lista_exercicio_5_lp2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		/*A conversão de graus Fahrenheit para Celsius é obtida pela fórmula abaixo. 
		 * Faça um algoritmo que leia um valor em graus Centígrados e imprima seu correspondente em graus Fahrenheit.
		 * 
		 * Formula -> F = C x 1,8 + 32
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		
		double $c, $f;
		
		System.out.println("---------------------------------------------");
		System.out.println("    C O N V E R S A O   DE   C   PARA  F     ");
		System.out.println("---------------------------------------------");
		System.out.print("Digite a temperatura em Graus Celsius -> ");
		$c = in.nextDouble();
		//conta
		
		$f = $c * 1.8 + 32;
		System.out.println("");
		System.out.println("**************************************************************************");
		System.out.println("*         A temperatura em Graus Fahrenheit é -> " + $f + "f              ");
		System.out.println("**************************************************************************");
		
		in.close();
		
	}

}
