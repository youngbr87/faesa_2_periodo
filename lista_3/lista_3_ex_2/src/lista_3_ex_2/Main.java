package lista_3_ex_2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*FaÃ§a um algoritmo que leia um nÃºmero inteiro e verifique se ele Ã© par ou Ã­mpar. Imprima uma mensagem
		correspondente ao resultado. Se o nÃºmero for zero, imprima: â€œo valor Ã© zeroâ€.
		*/
		
		System.out.println("----------------------------");
		System.out.println("    P A R  O U  I M P A R   ");
		System.out.println("----------------------------");
		
		Scanner IN = new Scanner(System.in);
		
		int $num;
		
		System.out.print("Digite um número inteiro -> ");
		$num = IN.nextInt();
		
		if ($num % 2 == 0) {
			System.out.print("O número é par!");
		}else {
			System.out.print("O número é impar!");
		}
		
		
	IN.close();

	}

}
