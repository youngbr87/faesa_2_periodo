package lista_3_ex_1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		/* 
		 * Construa um algoritmo que leia dois nÃºmeros inteiros e verifique se a divisÃ£o seja indeterminada
(denominador igual a zero). Em caso afirmativo, imprima â€œDivisÃ£o indeterminadaâ€, do
contrÃ¡rio, imprima o resultado da divisÃ£o. Considere a divisÃ£o do primeiro pelo segundo.

		 */
		
		System.out.println("---------------------------------");
		System.out.println("          D I V I S A O          ");
		System.out.println("---------------------------------");
		
		Scanner IN = new Scanner(System.in);
		
		int $div, $den, $res;
		
		System.out.print("Digite um número para ser dividido -> ");
		$div = IN.nextInt();
		System.out.print("Digite o divisor -> ");
		$den = IN.nextInt();
		
		 if ($den == 0){
			System.out.println("Não é possivel dividir por 0.");
			}else {
				$res = $div/$den;
				System.out.println("O valor da divisão de " + $div + " por " + $den + " é igual a " + $res);
				
			}	
		IN.close();
	}

}
