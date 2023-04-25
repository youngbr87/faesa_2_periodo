package lista_exercicio_7_lp2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		/* Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e
         P(x2,y2), escreva a distância entre eles. 
         */
		
		
		double $x1, $x2, $y1, $y2, $dist;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite coordenada x1 -> ");
		$x1 = in.nextDouble();
		System.out.print("Digite coordenada y1 -> ");
		$y1 = in.nextDouble();
		System.out.print("Digite coordenada x2 -> ");
		$x2 = in.nextDouble();
		System.out.print("Digite coordenada y2 -> ");
		$y2 = in.nextDouble();
		
		
		//calculos
		
		$dist = Math.sqrt(Math.pow(($x2 - $x1), 2) + Math.pow(($y2 - $y1), 2));
		
		System.out.println("A distancia entre os pontos é -> " + $dist);
		
		
		
        in.close();
        
         
         
	}

}
