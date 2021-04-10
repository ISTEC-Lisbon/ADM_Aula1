package adm_Classes;
import Model.Pessoa;
import Model.Pessoas;

public class Main02 {

	public static void main(String[] args) {

		Pessoas pessoas = new Pessoas(5);

		pessoas.addPessoa(new Pessoa("João", "Silva", "Lisboa", 176, 67));
		pessoas.addPessoa(new Pessoa("Maria", "Borges", "Porto", 178, 65));
		pessoas.addPessoa(new Pessoa("Carlos", "Sousa", "Faro", 183, 79));
		pessoas.addPessoa(new Pessoa("Alberto", "Sousa", "Faro", 170, 70));

		Pessoa p = new Pessoa("Alfredo", "Rodrigues", "Coimbra", 190, 90);
		pessoas.addPessoa(p);

		System.out.println(pessoas);

		pessoas.removePessoa(p);
		System.out.println("Depois de retirar o Alfredo:");
		System.out.println(pessoas);

		Pessoa p1 = new Pessoa("Luís", "Almeida", "Porto", 180, 95);
		pessoas.addPessoa(p1);

		System.out.println(pessoas);

		Pessoa[] pesquisa = pessoas.pesquisarNome("sousa");
		for(Pessoa pessoa: pesquisa ) {
			System.out.println(pessoa);
		}
		
		System.out.println("Pessoas de Faro:");
		pesquisa = pessoas.pesquisarCidade("Faro");
		for(Pessoa pessoa: pesquisa ) {
			System.out.println(pessoa);
		}
		
	}

}
