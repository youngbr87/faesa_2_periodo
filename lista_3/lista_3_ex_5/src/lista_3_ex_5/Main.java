package lista_3_ex_5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Um banco conceder� um cr�dito especial aos seus clientes, que varia com o saldo m�dio no �ltimo ano.
Fa�a um algoritmo que leia o saldo m�dio de um cliente e calcule o valor do cr�dito (percentual sobre o saldo
m�dio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo m�dio e o valor do
cr�dito.
		 */
	System.out.println(" ------------------------------------");
	System.out.println("|           C R � D I T O            |");
	System.out.println("|____________________________________|");
	System.out.println("|                                    |");
	System.out.println("|         TABELA DE CR�DITO          |");
	System.out.println("|                                    |");
	System.out.println("|      AT� 200 - NENHUM CR�DITO      |");
	System.out.println("|      200 ~ 400 - 10%               |");
	System.out.println("|      ACIMA DE 400 - 20%            |");
	System.out.println(" ------------------------------------ ");
	
	Scanner IN = new Scanner(System.in);
	
	double $salM, $cred;
	
	System.out.print("\nDigite o valor do saldo m�dio (�ltimo ano) -> R$ ");
	$salM = IN.nextDouble();
	
	if ($salM <= 200) {
		System.out.println("\n ----------------------------------------------------");
		System.out.println("|*******  N�o � poss�vel conceder o cr�dito *******  |");
		System.out.println(" ---------------------------------------------------- ");
	  }else {
		  if ($salM > 200 && $salM < 400){
			  
			  $cred = $salM * 0.10;
			  
			  System.out.println("\n -------------------------------------------------------------------------------------- ");
			  System.out.println("  O cr�dito para a m�dia de s�lario R$" + $salM + " � de 10% e o valor ser� de R$" + $cred );
			  System.out.println(" ---------------------------------------------------------------------------------------- ");
		  }else {
			  if ($salM > 400){
				  
				  $cred = $salM * 0.20;
				  
				  System.out.println("\n -------------------------------------------------------------------------------------- ");
				  System.out.println("  O cr�dito para a m�dia de s�lario R$" + $salM + " � de 20% e o valor ser� de R$" + $cred );
			  	  System.out.println(" --------------------------------------------------------------------------------------- ");
		
			  
			}
	     }
		
	  }
	
	}

}
