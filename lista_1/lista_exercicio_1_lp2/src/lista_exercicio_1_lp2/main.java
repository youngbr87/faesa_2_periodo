package lista_exercicio_1_lp2;

import java.util.*;
public class main {

	public static void main(String[] args) {
		/*Faça um programa que leia três valores inteiros, e calcule e exiba a sua média ponderada. 
		 * A primeira nota tem peso 2, a segunda tem peso 3 e a terceira tem peso 5.
		 */

		Scanner in = new Scanner(System.in);
		float $n1, $n2, $n3, $med;
		
		System.out.println("****************************************");
		System.out.println("   C A L C U L A D O R A  DE  N O T A   ");
		System.out.println("****************************************");
		System.out.println("");
		System.out.print(" Digite a primeira nota  -> ");
		$n1 = in.nextFloat();
		System.out.print(" Digite a segunda nota   -> ");
		$n2 = in.nextFloat();
		System.out.print(" Digite a terceira nota  -> ");
		$n3 = in.nextFloat();
		System.out.println("");
		System.out.println(" - - - - - - - - - - - - - - - - - - - -");
		
		//calculos
		
		$med = (($n1 * 2) + ($n2 * 3) + ($n3 * 5));
		System.out.print("          A MÉDIA DAS NOTAS É  ->  " + $med);
		
		in.close();
		
		
	}

}
