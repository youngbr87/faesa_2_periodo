package lista_exercicio_9_lp2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		/*
		 * Escrever um algoritmo que lê:
          a) a porcentagem do IPI a ser acrescido no valor das peças
          b) o código da peça 1, valor unitário da peça 1, quantidade de peças 1
          c) o código da peça 2, valor unitário da peça 2, quantidade de peças 2
          O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
          Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		 
		 * Qual é porcetagem de IPI, para o exercicio funcionar eu defini que o IPI
		 * vai ser 2% sobre o valor unitario total
		 */
		
		Scanner in = new Scanner (System.in);
		
		double $vu_1, $vu_2, $qt_1, $qt_2, $vt, $vtp_1, $vtp_2, $vt_Imp, $ipi_T;
		double $ipi_1 = 0; 
		double $ipi_2 = 0;
		String $cod_PC_1, $cod_PC_2;
		
		System.out.println(" ------------------------------------------------ ");
		System.out.println("               ENTRADA DE DADOS ");
		System.out.println(" ------------------------------------------------ ");
		System.out.print("      Digite o código da peça 1 -> ");
		$cod_PC_1 = in.nextLine();
		System.out.print("      Digite o código da peça 2 -> ");
		$cod_PC_2 = in.nextLine();
		System.out.print("      Digite o preço unitário da peça 1 -> R$");
		$vu_1= in.nextDouble();
		System.out.print("      Digite a quantidade da peça 1 -> ");
		$qt_1= in.nextDouble();
		System.out.print("      Digite o preço unitário da peça 2 -> R$");
		$vu_2 = in.nextDouble();
		System.out.print("      Digite a quantidade da peça 2 -> ");
		$qt_2 = in.nextDouble();
		
		
		$vtp_1 = $vu_1 * $qt_1;
		$vtp_2 = $vu_2 * $qt_2;
		$ipi_1 = $vtp_1 * 0.02;
		$ipi_2 = $vtp_2 * 0.02;
		$ipi_T = $ipi_1 + $ipi_2;
		$vt_Imp = $vtp_1 + $vtp_2 + $ipi_1 + $ipi_2; 
		
		System.out.println();
		System.out.println(" ------------------------------------------------ ");
		System.out.println("                 FECHAMENTO                       ");
		System.out.println(" ------------------------------------------------ ");
		System.out.println("O valor total da(s) peça(s) 1 codigo -> " + $cod_PC_1 + " é: R$" + $vtp_1 + " sem imposto.");
		System.out.println("O valor total da(s) peça(s) 2 codigo -> " + $cod_PC_2 + " é: R$" + $vtp_2 + " sem imposto.");
		System.out.println("O valor total do IPI é -> R$" + $ipi_T);
		System.out.println("O valor total da(s) peça(s) a pagar com imposto é -> " + $vt_Imp);
		
		
	
		
		
		
		in.close();
		
		

	}

}
