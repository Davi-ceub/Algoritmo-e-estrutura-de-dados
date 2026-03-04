package aula2;

public class Principal {
	public static void main(String[] args) {

		PessoaFisica pf = new PessoaFisica();
		pf.nome = "Molina";
		pf.cpf = "88888888888";
		pf.email = "francisco.m.duarte@gmail.com";
		pf.telefone = "9999999";
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.nome = "Google";
		pj.email = "suporte@gmail.com";
		pj.nomeFantasia = "Google do Brasil";
		pj.cnpj = "999999999/0001-04";
		pj.telefone = "888888";
		
	   
	}
}