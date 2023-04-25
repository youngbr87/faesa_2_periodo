package lista_3_ex_6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Criar um algoritmo que leia o cÃ³digo da carga e o peso (em toneladas) da carga de um caminhÃ£o. Caso o
cÃ³digo nÃ£o esteja entre os intervalos descritos na tabela, imprimir mensagem: â€œcÃ³digo invÃ¡lidoâ€. Calcule e
imprima: o peso da carga do caminhÃ£o convertido em quilos (1 ton â€“ 1000kg) e o preÃ§o da carga do
caminhÃ£o, de acordo com a tabela abaixo. 
		 */
		
		System.out.println("--------------------------------------------");
		System.out.println("         P R E C O  D A  C A R G A          ");
		System.out.println("--------------------------------------------");
		System.out.println("    CODIGO        PREÇ‡O POR KG (EM REAIS)   ");
		System.out.println("     10 A 20        100                     ");
		System.out.println("     21 A 30        250                     ");
		System.out.println("     31 A 40        330                     ");
		System.out.println("--------------------------------------------");
		
		Scanner IN = new Scanner(System.in);
		
		int $cod; 
		double $pesT, $pesKg, $vTot;
		
		System.out.print("Digite o código da carga -> ");
		$cod = IN.nextInt();
		
		
		
		
		if ($cod >= 10 && $cod <= 20) {
			
			System.out.print("\nDigite o peso da carga (Tonelada) -> ");
			$pesT = IN.nextInt();
			
			$pesKg = $pesT * 1000;
			$vTot = $pesKg * 100;
			
			System.out.println("\nO peso da carga é " + $pesKg + " Kilogramas e o valor do frete é de R$" + $vTot);
		}else {
			
			if ($cod >= 21 && $cod <= 30) {
				
				System.out.print("\nDigite o peso da carga (Tonelada) -> ");
				$pesT = IN.nextInt();
				
				$pesKg = $pesT * 1000;
				$vTot = $pesKg * 250;
				
				System.out.println("\nO peso da carga é " + $pesKg + " Kilogramas e o valor do frete é de R$" + $vTot);
			}else {
				
				if ($cod >= 31 && $cod <= 40) {
					
					System.out.print("\nDigite o peso da carga (Tonelada) -> ");
					$pesT = IN.nextInt();
					
					$pesKg = $pesT * 1000;
					$vTot = $pesKg * 330;
					
					System.out.println("\nO peso da carga é " + $pesKg + " Kilogramas e o valor do frete é de R$" + $vTot);
				}else {
					System.out.print("\n ******  CÓDIGO INVALIDO !!! ******");
				}
					
				}
		}
		
		IN.close();	
	} 
}
