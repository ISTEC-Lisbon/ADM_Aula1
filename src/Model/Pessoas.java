package Model;

import java.util.Arrays;

public class Pessoas {

	private Pessoa[] pessoas;
	int indiceActual = 0;

	public Pessoas(int nrPessoasMaximo) {
		this.pessoas = new Pessoa[nrPessoasMaximo];
	}

	public void addPessoa(Pessoa p) {
		if (indiceActual < pessoas.length) {
			this.pessoas[indiceActual] = p;
			indiceActual++;
		}
	}

	public void removePessoa(Pessoa p) {
		int posicao = -1;
		for (int i = 0; i < pessoas.length; i++) {
			if (this.pessoas[i] == p) {
				posicao = i;
			}
		}
		if (posicao > -1) {
			for (int i = posicao + 1; i < indiceActual; i++) {
				this.pessoas[i - 1] = this.pessoas[i];
			}
			indiceActual--;
		}
	}

	public Pessoa[] pesquisarNome(String nome) {
		Pessoa[] resultado = new Pessoa[indiceActual];
		int ultimo = 0;
		String nomeAlterado = nome.toLowerCase();
		for (int i = 0; i < indiceActual; i++) {
			if (pessoas[i].getPrimeiroNome().toLowerCase().contains(nomeAlterado)
					|| pessoas[i].getUltimoNome().toLowerCase().contains(nomeAlterado)) {
				resultado[ultimo] = pessoas[i];
				ultimo++;
			}
		}
		return Arrays.copyOf(resultado, ultimo);
	}

	public Pessoa[] pesquisarCidade(String cidade) {
		Pessoa[] resultado = new Pessoa[indiceActual];
		int ultimo = 0;
		String cidadeAlterado = cidade.toLowerCase();
		for (int i = 0; i < indiceActual; i++) {
			if (pessoas[i].getCidade().toLowerCase().contains(cidadeAlterado)) {
				resultado[ultimo] = pessoas[i];
				ultimo++;
			}
		}
		return Arrays.copyOf(resultado, ultimo);
	}

	public double getMediaPeso() {
		double total = 0;
		for (Pessoa p : pessoas) {
			total += p.getPeso();
		}
		if (indiceActual == 0) {
			return 0;
		} else {
			return total / indiceActual;
		}
	}

	public double getMediaAltura() {
		double total = 0;
		for (Pessoa p : pessoas) {
			total += p.getAltura();
		}
		if (indiceActual == 0) {
			return 0;
		} else {
			return total / indiceActual;
		}
	}

	@Override
	public String toString() {
		String resultado = "";
		for (int i = 0; i < indiceActual; i++) {
			resultado = resultado + pessoas[i] + "\r\n";
		}
		resultado = resultado + "M�dia de pesos: " + this.getMediaPeso() + "\r\nM�dia de altura: "
				+ this.getMediaAltura() + "\r\n";
		return resultado;
	}
}
