package lista_3_ex_2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem
		correspondente ao resultado. Se o número for zero, imprima: “o valor é zero”.
		*/
		
		System.out.println("----------------------------");
		System.out.println("    P A R  O U  I M P A R   ");
		System.out.println("----------------------------");
		
		Scanner IN = new Scanner(System.in);
		
		int $num;
		
		System.out.print("Digite um n�mero inteiro -> ");
		$num = IN.nextInt();
		
		if ($num % 2 == 0) {
			System.out.print("O n�mero � par!");
		}else {
			System.out.print("O n�mero � impar!");
		}
		
		
	IN.close();

	}

}
