package lista_exercicio_3_lp2;

import java.util.*;
public class main {

	public static void main(String[] args) {
		/*Faça um programa que leia o nome de um piloto, uma distância percorrida em km e o tempo que o piloto 
		levou para percorrê-la (em horas). O programa deve calcular a velocidade média em km/h, e exibir a seguinte frase: 
			A velocidade média de XX foi YY km/h, onde XX é o nome do piloto, e YY é a velocidade média.
			*/
        
		Scanner in = new Scanner(System.in);
		double $kmP, $velM;
		int $hor;
		String $nome;
		
		
		System.out.println("*********************************************************");
		System.out.println("    C A L C U L O   V E L O C I D A D E   M E D I A      ");
		System.out.println("*********************************************************");
		System.out.print("        Digite o nome do competidor -> ");
		$nome = in.nextLine();
		System.out.print("        Distância pecorrida (km)    -> ");
		$kmP = in.nextDouble();
		System.out.print("        Tempo da distancia pecorrida (h)-> ");
		$hor = in.nextInt();
		
		//calculos
		
		$velM = $kmP / $hor;
		System.out.println("");
		System.out.print("A velocidade média do competidor " + $nome + " foi de " + $velM + "km/h");
		
		in.close();
		
		
	}

}
