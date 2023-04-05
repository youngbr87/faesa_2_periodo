package exercicio_teste_01;

import java.util.Calendar;

public class Cliente {
	
	private String $nome;
	private String $endereco;
	private String $cpf;
	private String $telefone;
	private String $email;
	private Long $codigo;
	
	@Override
	public String toString() {
		return "Nome: " + this.$nome + "\nEndereco: " + this.$endereco + "\nCPF: "
				+ this.$cpf + "\nTelefone: " + this.$telefone + "\nEmail: " + this.$email 
				+ "\nCodigo: " + this.$codigo + "\n";
	}
	
	public String getNome() {
		return $nome;
	}
	
	public Long getCodigo() {
		return $codigo;
	}
	
	public void setCodigo (Long codigo) {
		this.$codigo = codigo;
	}
	
	public void setNome (String nome) {
		this.$nome = nome;
	}
	
	public String getEndereco() {
		return $endereco;
	}
	
	public void setEndereco (String endereco) {
		this.$endereco = endereco;
	}
	
	public String getCpf () {
		return $cpf;
	}
	
	public void setCpf (String cpf) {
		this.$cpf = cpf;
	}
	
	public String getTelefone () {
		return $telefone;
	}
	
	public void settelefone (String telefone) {
		this.$telefone = telefone; 
	}
	
	public String getemail() {
		return $email;
	}
	
	public void setemail(String email) {
		this.$email = email;
	}
}
