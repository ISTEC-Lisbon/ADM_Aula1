package Model;

/*
 * Java Bean - � um padr�o de desenho em Java em que a classe � criada com os seguintes elementos
 * 1 - Atributos privados
 * 2 - M�todos de acesso get p�blicos
 * 3 - M�todos de modifica��o set p�blicos
 * 4 - Um m�todo toString() p�blico
 * 5 - Um m�todo construtor
 */
public class Pessoa {

	private int id;
	private String primeiroNome;
	private String ultimoNome;
	private String cidade;
	private double altura;
	private double peso;
	
	private static int ultimoId = 1;

	public Pessoa(String primeiroNome, String ultimoNome, String cidade, double altura, double peso) {
		this.setId(Pessoa.ultimoId);
		this.setPrimeiroNome(primeiroNome);
		this.setUltimoNome(ultimoNome);
		this.setCidade(cidade);
		this.setAltura(altura);
		this.setPeso(peso);
		Pessoa.ultimoId++;
	}
	
	public String getPrimeiroNome() {
		return this.primeiroNome;
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNomeCompleto() {
		return this.getPrimeiroNome() + " " + this.getUltimoNome();
	}

	public void setNomeCompleto(String nomeCompleto) {
		int espaco = nomeCompleto.indexOf(' ');
		this.setPrimeiroNome(nomeCompleto.substring(0, espaco));
		this.setUltimoNome(nomeCompleto.substring(espaco + 1, nomeCompleto.length()));
	}
	
	@Override
	public String toString() {
		return this.getId() + "-" + this.getPrimeiroNome() + " " + this.getUltimoNome() +
			   " - " + this.getCidade() + ", Altura: " + this.getAltura() + " Peso:" + this.getPeso();
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
	
}
