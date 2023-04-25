package lista_3_ex_3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia dois números inteiros e mostre um menu com quatro operações (+, -, *, /) para o
usuário escolher. Imprima o resultado da opção escolhida. Caso o usuário digite uma opção inválida, mostrar
mensagem de erro. (utilize a estrutura ESCOLHA)
		 */
		
		System.out.println("-----------------------------");
		System.out.println("    C A L C U L A D O R A    ");
		System.out.println("-----------------------------");
		
		Scanner IN =  new Scanner(System.in);
		
		int $opt, $num1, $num2, $soma;
		
		System.out.println("DIGITE [1] PARA SOMAR");
		System.out.println("DIGITE [2] PARA SUBTRAIR");
		System.out.println("DIGITE [3] PARA MULTIPLICAR");
		System.out.println("DIGITE [4] PARA DIVIDIR");
		
		
		System.out.print("\nDigite a opção desejada -> ");
		$opt = IN.nextInt();
		
		System.out.print("\nDigite o primeiro número -> ");
		$num1 = IN.nextInt();
		System.out.print("Digite o segundo número -> ");
		$num2 = IN.nextInt();
		
		if ($opt == 1) {
			$soma = $num1 + $num2;
			System.out.println("\nA soma entre " + $num1 + " e " + $num2 + " é " + $soma);
		}else {
			if($opt == 2) {
				$soma = $num1 - $num2;
				System.out.println("\nA subtração entre " + $num1 + " e " + $num2 + " é " + $soma);
			}else {
				if ($opt == 3) {
					$soma = $num1 * $num2;
					System.out.println("\nA multiplicação entre " + $num1 + " e " + $num2 + " é " + $soma);
				}else {
					if ($opt == 4) {
						$soma = $num1/$num2;
						System.out.println("\nA divisão entre " + $num1 + " e " + $num2 + " é " + $soma);
					}
		        }
			}
			
        IN.close();
        
        
		} 
    }
}
