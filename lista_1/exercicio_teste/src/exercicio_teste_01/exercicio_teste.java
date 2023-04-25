package exercicio_teste_01;
import java.util.*;

public class exercicio_teste {

	private static void menu(){
		// O menu é chamado separado
		System.out.println("");
		System.out.println(" -------------------------------- ");
		System.out.println("|       MENU DE OPÇÕES           |");
		System.out.println("|                                |");
		System.out.println("| 1 - CADASATRAR CLIENTE         |");
		System.out.println("| 2 - ATUALIZAR CLIENTE          |");
		System.out.println("| 3 - EXCLUIR CLIENTE            |");
		System.out.println("| 4 - LISTAR TODOS OS CLIENTES   |");
		System.out.println("| 5 - LISTAR CLIENTES POR CÓDIGO |");
		System.out.println("| 6 - SALVAR CLIENTES EM ARQUIVO |");
		System.out.println(" -------------------------------- ");
		
		
		}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Collection<Cliente> listaDeClientes = new ArrayList<Cliente>();
		Cliente clientes = new Cliente();
		int $opcmenu;
		
		do {
			
			menu();
			System.out.print ("Digite a opção desejada: ");
			$opcmenu = Integer.parseInt(teclado.nextLine()); 
			
			switch ($opcmenu) {
			
			case 1:
				
				System.out.print("Digite um código para o cliente: ");
				clientes.setCodigo(Long.parseLong(teclado.nextLine()));
				
				System.out.print("Nome do cliente: ");
				clientes.setNome(teclado.nextLine());
				teclado.nextLine();
				
				System.out.print("CPF: ");
				clientes.setCpf(teclado.nextLine());
				teclado.nextLine();
				
				System.out.print("Telefone: ");
				clientes.setTelefone(teclado.nextLine());
				teclado.nextLine();
				
				System.out.print("Endereço: ");
				clientes.setEndereco(teclado.nextLine());
				teclado.nextLine();
				
				System.out.print("Email: ");
				clientes.setEmail(teclado.nextLine());
				teclado.nextLine();
				
				listaDeClientes.add(clientes);
				break;
			
			case 4:
				
				System.out.println("Lista de clientes cadastrados");
				for (Cliente Cliente : listaDeClientes) {
					System.out.println(Cliente);
				}
				
				break;
						
			}
			
			
		   }
		while ($opcmenu != 0);
		teclado.close();
	  }
	
}
