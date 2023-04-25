package lista_3_ex_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vet[];
		int tam;
		
		System.out.println("Informe o tamanho do vetor: ");
		tam = entrada.nextInt();
			
		vet = new int[tam];
		
		for(int i=0; i<vet.length; i++){
			vet[i] = tam;
			tam--;
			//System.out.println("vet["+i+"]: "+vet[i]);
		}
		
		while(tam>0){
			System.out.println(tam);
			tam-=1;
		}
	
		do{
			System.out.println(tam);
			tam-=1;
		}while(tam>0);
		
		for(int i=0; i<vet.length; i++){
			System.out.println("vet["+i+"]: "+vet[i]);
		}
		
		System.out.println("Fim do programa!");
	}
}
