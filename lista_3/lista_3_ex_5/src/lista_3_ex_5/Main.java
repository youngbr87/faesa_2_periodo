package lista_3_ex_5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Um banco concederá um crédito especial aos seus clientes, que varia com o saldo médio no último ano.
Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito (percentual sobre o saldo
médio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo médio e o valor do
crédito.
		 */
	System.out.println(" ------------------------------------");
	System.out.println("|           C R É D I T O            |");
	System.out.println("|____________________________________|");
	System.out.println("|                                    |");
	System.out.println("|         TABELA DE CRÉDITO          |");
	System.out.println("|                                    |");
	System.out.println("|      ATÉ 200 - NENHUM CRÉDITO      |");
	System.out.println("|      200 ~ 400 - 10%               |");
	System.out.println("|      ACIMA DE 400 - 20%            |");
	System.out.println(" ------------------------------------ ");
	
	Scanner IN = new Scanner(System.in);
	
	double $salM, $cred;
	
	System.out.print("\nDigite o valor do saldo médio (último ano) -> R$ ");
	$salM = IN.nextDouble();
	
	if ($salM <= 200) {
		System.out.println("\n ----------------------------------------------------");
		System.out.println("|*******  Não é possível conceder o crédito *******  |");
		System.out.println(" ---------------------------------------------------- ");
	  }else {
		  if ($salM > 200 && $salM < 400){
			  
			  $cred = $salM * 0.10;
			  
			  System.out.println("\n -------------------------------------------------------------------------------------- ");
			  System.out.println("  O crédito para a média de sálario R$" + $salM + " é de 10% e o valor será de R$" + $cred );
			  System.out.println(" ---------------------------------------------------------------------------------------- ");
		  }else {
			  if ($salM > 400){
				  
				  $cred = $salM * 0.20;
				  
				  System.out.println("\n -------------------------------------------------------------------------------------- ");
				  System.out.println("  O crédito para a média de sálario R$" + $salM + " é de 20% e o valor será de R$" + $cred );
			  	  System.out.println(" --------------------------------------------------------------------------------------- ");
		
			  
			}
	     }
		
	  }
	
	}

}
