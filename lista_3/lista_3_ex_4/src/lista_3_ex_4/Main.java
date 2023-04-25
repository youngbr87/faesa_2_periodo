package lista_3_ex_4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Uma empresa concederÃ¡ um aumento de salÃ¡rio aos seus funcionÃ¡rios, que varia de acordo com o cargo,
conforme a tabela. FaÃ§a um algoritmo que leia o salÃ¡rio e o cÃ³digo do cargo de um funcionÃ¡rio e calcule o
novo salÃ¡rio. Se o cargo do funcionÃ¡rio nÃ£o estiver na tabela, ele deverÃ¡ receber 5% de aumento. Imprima o
salÃ¡rio antigo, o novo salÃ¡rio e a diferenÃ§a. (utilize a estrutura ESCOLHA)
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
		
		System.out.print("\nDigite a opção desejada -> ");
		$opt = IN.nextInt();
		System.out.print("\nDigite o sálario -> ");
		$sal = IN.nextInt();
		
		if ($opt == 1) {
			$nSal = $sal * 1.1;
			System.out.print("\nO salário será -> R$ " + $nSal);
	
		}else {
			if ($opt == 2) {
				$nSal = $sal * 1.2;
				System.out.print("\nO salário será -> R$ " + $nSal);
		
			}else {
				if ($opt == 3) {
					$nSal = $sal * 1.3;
					System.out.print("\nO salário será -> R$ " + $nSal);
			
				}else {
					if ($opt == 4) {
						$nSal = $sal * 1.05;
						System.out.print("\nO salário será -> R$ " + $nSal);
				
					}
				}
			}
		}
		
		IN.close();	
	}
	
	
	
}
