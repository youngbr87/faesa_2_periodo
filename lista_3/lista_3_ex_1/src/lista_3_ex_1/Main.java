package lista_3_ex_1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		/* 
		 * Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada
(denominador igual a zero). Em caso afirmativo, imprima “Divisão indeterminada”, do
contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo.

		 */
		
		System.out.println("---------------------------------");
		System.out.println("          D I V I S A O          ");
		System.out.println("---------------------------------");
		
		Scanner IN = new Scanner(System.in);
		
		int $div, $den, $res;
		
		System.out.print("Digite um n�mero para ser dividido -> ");
		$div = IN.nextInt();
		System.out.print("Digite o divisor -> ");
		$den = IN.nextInt();
		
		 if ($den == 0){
			System.out.println("N�o � possivel dividir por 0.");
			}else {
				$res = $div/$den;
				System.out.println("O valor da divis�o de " + $div + " por " + $den + " � igual a " + $res);
				
			}	
		IN.close();
	}

}
