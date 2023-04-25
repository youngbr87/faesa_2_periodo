package lista_3_ex_7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que receba o valor do sal�rio de uma pessoa e o valor de um financiamento pretendido.
Caso o financiamento seja menor ou igual a 5 vezes o sal�rio da pessoa, o programa dever� escrever
"Financiamento Concedido"; sen�o, escrever� "Financiamento Negado". Independente de conceder ou n�o o
financiamento, o programa escrever� depois a frase "Obrigado por nos consultar."
		 */
		
		Scanner IN = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("         F I N A N C I A M E N T O          ");
		System.out.println("--------------------------------------------");
		
		double $sal, $vFin, $vApr;
		
		System.out.print("\nDigite o valor do s�lario (reais) -> ");
		$sal = IN.nextDouble();
		System.out.print("\nDigite o valor do financiamento pretendido (reais) -> ");
		$vFin = IN.nextDouble();
		
		$vApr = $sal * 5; 
		
		if ($vApr >= $vFin) {
			System.out.print("\n --------------------------------------------------- ");
			System.out.print("\n\t****** Financiamento aprovado! ******              ");
			System.out.print("\n --------------------------------------------------- ");
			
		    }else {
			    if ($vApr <= $vFin) {
			       System.out.print("\n --------------------------------------------------- ");
				   System.out.print("\n\t***** Financiamento negado! *****");
				   System.out.print("\n --------------------------------------------------- ");
	               } 
	          
	      }
		
	   System.out.print("\n\nObrigado pela consulta!");
     }
}
