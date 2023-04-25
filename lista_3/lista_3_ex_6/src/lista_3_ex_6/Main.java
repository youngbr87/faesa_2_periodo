package lista_3_ex_6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Criar um algoritmo que leia o código da carga e o peso (em toneladas) da carga de um caminhão. Caso o
código não esteja entre os intervalos descritos na tabela, imprimir mensagem: “código inválido”. Calcule e
imprima: o peso da carga do caminhão convertido em quilos (1 ton – 1000kg) e o preço da carga do
caminhão, de acordo com a tabela abaixo. 
		 */
		
		System.out.println("--------------------------------------------");
		System.out.println("         P R E C O  D A  C A R G A          ");
		System.out.println("--------------------------------------------");
		System.out.println("    CODIGO        PREǇO POR KG (EM REAIS)   ");
		System.out.println("     10 A 20        100                     ");
		System.out.println("     21 A 30        250                     ");
		System.out.println("     31 A 40        330                     ");
		System.out.println("--------------------------------------------");
		
		Scanner IN = new Scanner(System.in);
		
		int $cod; 
		double $pesT, $pesKg, $vTot;
		
		System.out.print("Digite o c�digo da carga -> ");
		$cod = IN.nextInt();
		
		
		
		
		if ($cod >= 10 && $cod <= 20) {
			
			System.out.print("\nDigite o peso da carga (Tonelada) -> ");
			$pesT = IN.nextInt();
			
			$pesKg = $pesT * 1000;
			$vTot = $pesKg * 100;
			
			System.out.println("\nO peso da carga � " + $pesKg + " Kilogramas e o valor do frete � de R$" + $vTot);
		}else {
			
			if ($cod >= 21 && $cod <= 30) {
				
				System.out.print("\nDigite o peso da carga (Tonelada) -> ");
				$pesT = IN.nextInt();
				
				$pesKg = $pesT * 1000;
				$vTot = $pesKg * 250;
				
				System.out.println("\nO peso da carga � " + $pesKg + " Kilogramas e o valor do frete � de R$" + $vTot);
			}else {
				
				if ($cod >= 31 && $cod <= 40) {
					
					System.out.print("\nDigite o peso da carga (Tonelada) -> ");
					$pesT = IN.nextInt();
					
					$pesKg = $pesT * 1000;
					$vTot = $pesKg * 330;
					
					System.out.println("\nO peso da carga � " + $pesKg + " Kilogramas e o valor do frete � de R$" + $vTot);
				}else {
					System.out.print("\n ******  C�DIGO INVALIDO !!! ******");
				}
					
				}
		}
		
		IN.close();	
	} 
}
