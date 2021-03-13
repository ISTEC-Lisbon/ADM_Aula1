package Model;

/*JAVA BEAN
 * 
 *É um padrão de desenho em Java em que a class é criada
 *com os seguintes elementos:
 *
 * 1 - atributos privados
 * 2 - métodos de acesso (get)
 * 3 - métodos de modificação (set)
 * 4 - um método strind
 * */
public class Pessoa {

	private int id;
	private String primeiro_nome;
	private String ultimo_nome;
	private String cidade;
	private double altura;
	private double peso;
	
	private static int ultimoID = 0;
	
	public Pessoa(String primeiro_nome, String ultimo_nome, String cidade, int altura, int peso) {
		// TODO Auto-generated constructor stub
		this.setId(ultimoID++);
		this.setPrimeiro_nome(primeiro_nome);
		this.setUltimo_nome(ultimo_nome);
		this.setCidade(cidade);
		this.setAltura(altura);
		this.setPeso(peso);
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the primeiro_nome
	 */
	public String getPrimeiro_nome() {
		return primeiro_nome;
	}


	/**
	 * @param primeiro_nome the primeiro_nome to set
	 */
	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}
	/**
	 * @return the ultimo_nome
	 */
	public String getUltimo_nome() {
		return ultimo_nome;
	}
	/**
	 * @param ultimo_nome the ultimo_nome to set
	 */
	public void setUltimo_nome(String ultimo_nome) {
		this.ultimo_nome = ultimo_nome;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getNomeCompleto() {
		return this.getPrimeiro_nome()+ " " + this.getUltimo_nome();
	}

	public String toString() {
		return this.getId() + " - " +
				this.getPrimeiro_nome()+" " + 
				this.getUltimo_nome()+" "+
				this.getCidade()+" "+
				this.getAltura()+" "+
				this.getPeso();
	}

	
	
}
