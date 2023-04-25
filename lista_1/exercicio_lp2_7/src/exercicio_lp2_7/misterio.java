package exercicio_lp2_7;

public class misterio {

	public static void main(String[] args) {
		
		int $num = 2459;
		int $a = (($num/100)%10);
		int $b = (($num%100)/10);
		int $c = (($num%100)%10);
		int $d = $num/1000;
		
		System.out.println("O número inteiro informado de 4 dígitos é: " + $num + "!");
		System.out.println("O resultado é : " + $d + $a + $b + $c);
		
		 
		

	}

}
