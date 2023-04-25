package lista_3_ex_2;

import java.util.Scanner;

/*Faça um programa em Java que mostre os salários dos funcionários de uma empresa que estão acima da média salarial da empresa. 
 * O usuário deverá informar no início a 
 * quantidade de funcionários da empresa e os respectivos salários.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner IN = new Scanner(System.in);
		
		int vet[];
		double $valSal = 0;
		int $quantFun = 0;
		
		System.out.print("Informe a quantidade de funcionários -> ");
		$quantFun = IN.nextInt();

		vet = new int[$quantFun];
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = $quantFun;
			
			
			
		}
		
		
		
		

	}

}
