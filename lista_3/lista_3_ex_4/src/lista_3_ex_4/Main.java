package lista_3_ex_4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Uma empresa concederá um aumento de salário aos seus funcionários, que varia de acordo com o cargo,
conforme a tabela. Faça um algoritmo que leia o salário e o código do cargo de um funcionário e calcule o
novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá receber 5% de aumento. Imprima o
salário antigo, o novo salário e a diferença. (utilize a estrutura ESCOLHA)
		 */
		
		Scanner IN = new Scanner(System.in);		
		
		System.out.println("-------------------------------------");
		System.out.println("    C A L C U L O  S A L A R I O     ");
		System.out.println(" ------------------------------------");
		System.out.println("|                                    |");
		System.out.println("|    C O D I G O  S A L A R I O      |");
		System.out.println("|                                    |");
		System.out.println("|       [1] - 101 GERENTE            |");
		System.out.println("|       [2] - 102 ENGENHEIRO         |");
		System.out.println("|       [3] - 103 TECNICO            |");
		System.out.println("|       [4] - 999 OUTRO              |");
		System.out.println("|                                    |");
		System.out.println(" ------------------------------------");
		
		
		int $opt;
		double $sal, $nSal;
		
		System.out.print("\nDigite a op��o desejada -> ");
		$opt = IN.nextInt();
		System.out.print("\nDigite o s�lario -> ");
		$sal = IN.nextInt();
		
		if ($opt == 1) {
			$nSal = $sal * 1.1;
			System.out.print("\nO sal�rio ser� -> R$ " + $nSal);
	
		}else {
			if ($opt == 2) {
				$nSal = $sal * 1.2;
				System.out.print("\nO sal�rio ser� -> R$ " + $nSal);
		
			}else {
				if ($opt == 3) {
					$nSal = $sal * 1.3;
					System.out.print("\nO sal�rio ser� -> R$ " + $nSal);
			
				}else {
					if ($opt == 4) {
						$nSal = $sal * 1.05;
						System.out.print("\nO sal�rio ser� -> R$ " + $nSal);
				
					}
				}
			}
		}
		
		IN.close();	
	}
	
	
	
}
