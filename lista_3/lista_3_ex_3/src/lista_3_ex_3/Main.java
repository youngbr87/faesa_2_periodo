package lista_3_ex_3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que leia dois n�meros inteiros e mostre um menu com quatro opera��es (+, -, *, /) para o
usu�rio escolher. Imprima o resultado da op��o escolhida. Caso o usu�rio digite uma op��o inv�lida, mostrar
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
		
		
		System.out.print("\nDigite a op��o desejada -> ");
		$opt = IN.nextInt();
		
		System.out.print("\nDigite o primeiro n�mero -> ");
		$num1 = IN.nextInt();
		System.out.print("Digite o segundo n�mero -> ");
		$num2 = IN.nextInt();
		
		if ($opt == 1) {
			$soma = $num1 + $num2;
			System.out.println("\nA soma entre " + $num1 + " e " + $num2 + " � " + $soma);
		}else {
			if($opt == 2) {
				$soma = $num1 - $num2;
				System.out.println("\nA subtra��o entre " + $num1 + " e " + $num2 + " � " + $soma);
			}else {
				if ($opt == 3) {
					$soma = $num1 * $num2;
					System.out.println("\nA multiplica��o entre " + $num1 + " e " + $num2 + " � " + $soma);
				}else {
					if ($opt == 4) {
						$soma = $num1/$num2;
						System.out.println("\nA divis�o entre " + $num1 + " e " + $num2 + " � " + $soma);
					}
		        }
			}
			
        IN.close();
        
        
		} 
    }
}
