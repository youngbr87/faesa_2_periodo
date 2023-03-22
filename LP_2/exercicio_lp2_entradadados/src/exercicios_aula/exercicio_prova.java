package exercicios_aula;
import java.util.*;

public class exercicio_prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        String $nome;
        String $endereco;
        int $idade;
        double $salario;
        
        System.out.print("Qual é o seu nome: ");
        $nome = teclado.nextLine();
        System.out.print("Qual é o seu endereço ");
        $endereco = teclado.nextLine();
        System.out.print("Qual é o seu idade: ");
        $idade = teclado.nextInt();
        System.out.print("Qual é o valor do seu salário ");
        $salario = teclado.nextDouble();
        
        System.out.println("Nome ->  " + $nome);
        System.out.println("Endereco -> " + $endereco);
        System.out.println("Idade -> " + $idade);
        System.out.println("Salario -> " + $salario);
        
        teclado.close();


	}

}
