package lista_exercicio_2_lp2;

import java.util.*;
public class main {

	public static void main(String[] args) {
		/*Realizarei uma viagem de vários dias em meu automóvel, e gostaria de saber a quilometragem média por litro de gasolina. 
		 * Para isto, anotarei a quilometragem no velocímetro ao sair de viagem, e depois ao chegar. 
		 * Também vou somar toda a gasolina que comprar para o carro. Você poderia fazer um programa que me desse, 
		 * com estes dados, quantos km fiz, em média, por litro de gasolina?
		 */
		
		
	    Scanner in = new Scanner(System.in); 	
		
		double $kmMED, $kmS, $kmC, $gas, $kmP;
		
		
		System.out.println("----------------------------------------");
		System.out.println("  C A L C U L A D O R A  C O N S U M O  ");
		System.out.println("----------------------------------------");
		System.out.print("     Kilometragem saída   -> ");
		$kmS = in.nextDouble();
		System.out.print("     Kilometragem chegada -> ");
		$kmC = in.nextDouble();
	    System.out.print("     Quantidade de litros abastecido -> ");
	    $gas = in.nextDouble();
	    
	    //calculos
	    
	    $kmP = $kmC - $kmS;
	    $kmMED = $kmP /$gas;
	    System.out.print("");
	    System.out.print("     A MÉDIA DE CONSUMO FOI -> " + $kmMED + " KM/L");
	    
	    in.close();
	   	
		
		
	}

}
