package Model;

public class Pessoas {
	private Pessoa[ ] pessoas;
	int index = 0;
	
	public Pessoas (int nrPessoas) {
		this.pessoas = new Pessoa[nrPessoas];
	}
	
	public void addPessoas(Pessoa p) {
		if (index < pessoas.length) {
			this.pessoas[index] =p;
			index++;
		}
	}
	
	public void removePssoas(Pessoa p) {
		int posicao=-1;
		for (int i = posicao +1 ; i < index; i++) {
			this.pessoas[i-1]=this.pessoas[i];
		}
	}
	
}
