package lista_exercicio_6_lp2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		/*Fazer um programa que leia um número inteiro e mostre o seu triplo, 
		 * sua metade, a sua raiz cúbica, e por fim, o número elevado a potência fracionária 2/3.
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		
		
		double $tri, $num, $met, $rc, $pont;
		
		System.out.print("Digite um número inteiro -> ");
		$num = in.nextDouble();
		
		//calculos
		
		$tri = $num * 3;
		$met = $num / 2;
		$rc = Math.cbrt($num);
		$pont = Math.pow($num, 0.666);
		
		
		System.out.println("O triplo do número digitado é -> " + $tri);
		System.out.println("A metade do número digitado é -> " + $met);
		System.out.println("A raiz cubica do número digitado é -> " + $rc);
		System.out.println("O número digitado elevado a potencia fracionaria 2/3 é -> " + $pont);
		
		in.close();
		
		
		
		
	}

}
